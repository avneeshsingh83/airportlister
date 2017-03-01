package org.quantas.test.airportlister.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.quantas.test.airportlister.filters.AirportFilterBean;
import org.quantas.test.airportlister.model.Airport;
import org.quantas.test.airportlister.services.AirportService;

@Path("/airports")
public class AirportListerResource
{

	AirportService airportService = new AirportService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> getAirportDetails(@BeanParam AirportFilterBean airportFilterBean)
	{
		if (null != airportFilterBean.getCountryName())
		{

			if (!airportFilterBean.getCountryName().isEmpty())
				return airportService.getAllAirportsForCountry(airportFilterBean.getCountryName());
		}
		if (null != airportFilterBean.getAirportCode())
		{
			if (!airportFilterBean.getAirportCode().isEmpty())
				return airportService.getAllAirportsByAirportCode(airportFilterBean.getAirportCode());
		}
		if (null != airportFilterBean.getInternational())
		{

			return airportService.getAllInternationalAirports();
		}
		if (null != airportFilterBean.getregional())
		{

			return airportService.getAllRegionalAirports();
		}
		return airportService.getAllAirports();

	}

}
