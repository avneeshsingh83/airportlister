package org.quantas.test.airportlister.model;

/**
 * "country":{"code":"AU","display_name":"Australia"}
 */
public class Country
{

	private String code;
	private String display_name;

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getDisplay_name()
	{
		return display_name;
	}

	public void setDisplay_name(String display_name)
	{
		this.display_name = display_name;
	}

	@Override
	public String toString()
	{
		return "Country [code=" + code + ", display_name=" + display_name + "]";
	}

}
