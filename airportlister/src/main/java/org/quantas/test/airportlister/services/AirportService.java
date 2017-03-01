package org.quantas.test.airportlister.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.quantas.test.airportlister.model.Airport;
import org.quantas.test.airportlister.model.Airports;

public class AirportService
{

	private Map<Integer, Airport> airportsMap = new HashMap<>();
	private static final String url = "https://www.qantas.com.au/api/airports";
	private static final String contenType = "application/vnd.qantas.airports.v1+json";

	public AirportService()
	{
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url);
		Builder builder = target.request(contenType);
		Response response = builder.get();
		Airports airports = response.readEntity(Airports.class);
		int count = 1;
		for (Airport airport : airports.getAirports())
		{

			airportsMap.put(Integer.valueOf(count), new Airport(airport.getCode(), airport.isInternational_airport(), airport.isRegional_airport(), airport.getCountry()));
			count++;
		}
	}

	public List<Airport> getAllAirports()
	{

		return new ArrayList<Airport>(airportsMap.values());

	}

	public List<Airport> getAllAirportsForCountry(String countryName)
	{
		List<Airport> airportsForCountry = new ArrayList<Airport>();
		for (Airport airport : airportsMap.values())
		{
			if (airport.getCountry().getDisplay_name().equalsIgnoreCase(countryName))
			{
				airportsForCountry.add(airport);
			}
		}
		return airportsForCountry;

	}

	public List<Airport> getAllAirportsByAirportCode(String airportCode)
	{
		List<Airport> airportsByAirportCode = new ArrayList<Airport>();
		for (Airport airport : airportsMap.values())
		{
			if (airport.getCode().equalsIgnoreCase(airportCode))
			{
				airportsByAirportCode.add(airport);
			}
		}
		return airportsByAirportCode;
	}

	public List<Airport> getAllInternationalAirports()
	{
		List<Airport> internationalAirports = new ArrayList<Airport>();
		for (Airport airport : airportsMap.values())
		{
			if (airport.isInternational_airport())
			{
				internationalAirports.add(airport);
			}
		}
		return internationalAirports;
	}

	public List<Airport> getAllRegionalAirports()
	{
		List<Airport> regionalAirports = new ArrayList<Airport>();
		for (Airport airport : airportsMap.values())
		{
			if (airport.isRegional_airport())
			{
				regionalAirports.add(airport);
			}
		}
		return regionalAirports;
	}

}
