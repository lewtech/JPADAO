package com.m3.training;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
public class City {
	@Id
	@Column(name="city_id")
	private int city_id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country_id")
	private int country_id;
	
	
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	
	@Override
	public String toString() {
		return "city_id = " + this.getCity_id() + ", city name = " + this.getCity() 
		+ ", country id = " + this.getCountry_id();
		
	}

}
