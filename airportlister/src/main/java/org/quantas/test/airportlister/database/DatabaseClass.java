package org.quantas.test.airportlister.database;

import java.util.HashMap;
import java.util.Map;

import org.quantas.test.airportlister.model.Airport;

public class DatabaseClass
{

	private static Map<Integer, Airport> airports = new HashMap<>();

	public static Map<Integer, Airport> getAirports()
	{

		return airports;
	}

}
