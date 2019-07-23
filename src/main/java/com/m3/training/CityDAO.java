package com.m3.training;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;

public class CityDAO implements AutoCloseable, ICRUD {

	private final String PERSISTENCE_UNIT_NAME = "cityJPADemo";
	private EntityManagerFactory factory;
	private EntityManager em;

	public CityDAO() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();

	}

	@Override
	public void create(int id, String name, int countryId) throws ConstraintViolationException {
		em.getTransaction().begin();
		City city = new City();

		city.setCity_id(id);
		city.setCity(name);
		city.setCountry_id(countryId);

		em.persist(city);
		try {
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			// log this next time or throw
		}
	}

	@Override
	public Optional<City> read(int id) {
		Optional<City> city = Optional.of(em.find(City.class, id));
		return city;
	}

	@Override
	public void update(int id, String name) {
		Optional<City> optionalCity = this.read(id);
		
		
		if (!optionalCity.isPresent()) {
			return;
		}
		City city = optionalCity.get();
		em.getTransaction().begin();

		city.setCity(name);
		
		
		
		em.getTransaction().commit();

	}

	@Override
	public void delete(int id) {
		em.getTransaction().begin();
		Optional<City> city = this.read(5000);
		em.remove(city);
		em.getTransaction().commit();

	}

	@Override
	public void close() throws Exception {

	}

}
