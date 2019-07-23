package com.m3.training;

public class Country {
	private int country_id;
	private String country_name;
	private String last_updated;
	
	
	
	
	public Country(int country_id, String country_name, String last_updated) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.last_updated = last_updated;
	}
	
	
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	
	

}
