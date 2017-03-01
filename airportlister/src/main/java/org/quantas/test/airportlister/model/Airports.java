package org.quantas.test.airportlister.model;

import java.util.ArrayList;
import java.util.List;

public class Airports
{

	List<Airport> airports = new ArrayList<Airport>();

	public List<Airport> getAirports()
	{
		return airports;
	}

	public void setAirports(List<Airport> airports)
	{
		this.airports = airports;
	}

}
