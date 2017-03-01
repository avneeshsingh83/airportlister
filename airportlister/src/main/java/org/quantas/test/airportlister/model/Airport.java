package org.quantas.test.airportlister.model;

/**
 * 	[{"code":"BZD","display_name":"Balranald","international_airport":false,"regional_airport":false,"location":{"latitude":-34.616665,"longitude":143.61667},"currency_code":"AUD","timezone":"Australia/Sydney","country":{"code":"AU","display_name":"Australia"}},
 */
public class Airport
{

	private String code;

	private boolean international_airport;
	private boolean regional_airport;

	private Country country;

	public Airport()
	{

	}

	public Airport(String code, boolean international_airport, boolean regional_airport, Country country)
	{
		super();
		this.code = code;
		this.international_airport = international_airport;
		this.regional_airport = regional_airport;
		this.country = country;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public boolean isInternational_airport()
	{
		return international_airport;
	}

	public void setInternational_airport(boolean international_airport)
	{
		this.international_airport = international_airport;
	}

	public boolean isRegional_airport()
	{
		return regional_airport;
	}

	public void setRegional_airport(boolean regional_airport)
	{
		this.regional_airport = regional_airport;
	}

	public Country getCountry()
	{
		return country;
	}

	public void setCountry(Country country)
	{
		this.country = country;
	}

	@Override
	public String toString()
	{
		return "Airport [code=" + code + ", international_airport=" + international_airport + ", regional_airport=" + regional_airport + " ,country=" + country + "]";
	}
}
