package org.quantas.test.airportlister.model;

/**
 * location":{"latitude":-34.616665,"longitude":143.61667}
 */
public class Location
{
	private double latitude;
	private double longitude;

	public double getLatitude()
	{
		return latitude;
	}

	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

	public double getLongitude()
	{
		return longitude;
	}

	public void setLongitude(double longitude)
	{
		this.longitude = longitude;
	}

	@Override
	public String toString()
	{
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
