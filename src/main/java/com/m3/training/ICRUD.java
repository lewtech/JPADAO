package com.m3.training;

import java.util.Optional;

import org.hibernate.exception.ConstraintViolationException;

public interface ICRUD {
	
	Optional<City> read(int id);
	public void update(int id, String name);
	public void delete(int id);
	void create(int id, String name, int countryId) throws ConstraintViolationException;
}
