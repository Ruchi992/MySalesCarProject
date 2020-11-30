/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import moylishmotors.Car;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class CarTableDB
{

	public static List<Car> getAllCars()
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT c FROM Car c";

		TypedQuery<Car> typedQuery = entityManager.createQuery(sql, Car.class);
		try
		{
			return typedQuery.getResultList();
		}
		finally
		{
			entityManager.close();
		}
	}

	public static List<String> getModel()
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		System.out.println("new");

		String query = "SELECT c.model FROM Car c";

		TypedQuery<String> tq = entityManager.createQuery(query, String.class);
		List<String> list = null;

		try
		{
			list = tq.getResultList();

		}
		finally
		{
			entityManager.close();
		}

		return list;
	}
	public static List<String> getYear()
	{
		EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
		System.out.println("SalesStock getMake");

		String query = "SELECT c.year FROM Car c";

		TypedQuery<String> tq = em.createQuery(query, String.class);

		List<String> list = null;

		try
		{
			list = tq.getResultList();
			for (String s : list)
			{
				System.out.println(s);

			}

			if (list == null || list.size() == 0)
			{
				return null;
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			em.close();
		}
		return list;
	}
	public static List<String> getMake()
	{
		EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
		System.out.println("SalesStock getMake");

		String query = "SELECT c.make FROM Car c";

		TypedQuery<String> tq = em.createQuery(query, String.class);

		List<String> list = null;

		try
		{
			list = tq.getResultList();
			for (String s : list)
			{
				System.out.println(s);

			}

			if (list == null || list.size() == 0)
			{
				return null;
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			em.close();
		}
		return list;
	}
	public static List<String> getColour()
	{
		EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
		System.out.println("SalesStock getyear");

		String query = "SELECT c.colour FROM Car c";

		TypedQuery<String> tq = em.createQuery(query, String.class);

		List<String> list = null;

		try
		{
			list = tq.getResultList();
			for (String s : list)
			{
				System.out.println(s);

			}

			if (list == null || list.size() == 0)
			{
				return null;
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			em.close();
		}

		return list;
	}
	public static List<Car> Search(String model, String make, String year, String colour, String fuel)
	{
		EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
		System.out.println("SalesStock search *** ----");
		System.out.println("SalesStock model:" + model);
		System.out.println("SalesStock make:" + make);
		System.out.println("SalesStock year:" + year);
		System.out.println("SalesStock colour:" + colour);
        System.out.println("SalesStock colour:" + fuel);
//        String query = "SELECT c.model, c.make, c.year, c.colour, c.engine, c.body FROM Cartable c WHERE c.make = :make and c.model =:model and c.year =:year and c.colour =:colour";
		String query = "SELECT c FROM Car c WHERE c.make = :make and c.model =:model and c.year =:year and c.colour =:colour and c.fuel=:fuel";

		TypedQuery<Car> tq = em.createQuery(query, Car.class)
				.setParameter("make", make)
				.setParameter("model", model)
				.setParameter("year", year)
				.setParameter("colour", colour)
				.setParameter("fuel", fuel)
				;

		List<Car> list = null;

		try
		{
			System.out.println("*** before result ");
			list = tq.getResultList();
			System.out.println("*** after result");

			System.out.println("*** list " + list);

			if (list == null)
			{
				return new ArrayList<>();
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			em.close();
		}

		return list;
	}
	
	public static Car getByLinstingNumber(int listingNumber)
	{		
			EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
			String query = "SELECT c FROM Car c WHERE c.listingNumber = :listingNumber";

		TypedQuery<Car> tq = em.createQuery(query, Car.class)
				.setParameter("listingNumber",listingNumber );
		
				try{
					return tq.getSingleResult();
}
		finally
		{

			em.close();
		}
	}
	
	public static Car getById(int id)
	{
//		Cartable car = new Cartable();
//		car.setId(1);
//		car.setMake("MArk");
//		car.setModel("MArk");
//		car.setEngine(50.0);
//		
//		return car;
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		try
		{
			return entityManager.find(Car.class, id);
		}
		finally
		{

			entityManager.close();
		}
	}

}
