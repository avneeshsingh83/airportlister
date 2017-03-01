package org.quantas.test.airportlister.filters;

import javax.ws.rs.QueryParam;

public class AirportFilterBean
{

	private @QueryParam("display_name") String countryName;
	private @QueryParam("code") String airportCode;
	private @QueryParam("international_airport") String isInternational;
	private @QueryParam("regional_airport") String isregional;

	public String getCountryName()
	{
		return countryName;
	}

	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}

	public String getAirportCode()
	{
		return airportCode;
	}

	public void setAirportCode(String airportCode)
	{
		this.airportCode = airportCode;
	}

	public String getInternational()
	{
		return isInternational;
	}

	public void setIsInternational(String isInternational)
	{
		this.isInternational = isInternational;
	}

	public String getregional()
	{
		return isregional;
	}

	public void setIsregional(String isregional)
	{
		this.isregional = isregional;
	}

}
