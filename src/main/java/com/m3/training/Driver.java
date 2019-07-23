package com.m3.training;
import org.hibernate.exception.ConstraintViolationException;



public class Driver {

	public static void main(String[] args) {
		CityDAO cityDAO = new CityDAO();

		try {
			cityDAO.create(1001, "test", 1);
			System.out.println(cityDAO.read(1001));
			cityDAO.update(1001, "other City");
			System.out.println(cityDAO.read(1001));
			cityDAO.delete(1001);
			System.out.println(cityDAO.read(1001));

		}
		catch (ConstraintViolationException e) {
			String msg = "Persistence error"; //not meaningful to the user

			System.out.println(msg + " " + e.getMessage());
		}
	}
}


