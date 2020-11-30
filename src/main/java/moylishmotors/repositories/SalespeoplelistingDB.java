/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.repositories;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import moylishmotors.Car;
import moylishmotors.Salespeoplelisting;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class SalespeoplelistingDB
{
	public static Salespeoplelisting getByLinstingNumber(int listingNumber)
	{		
			EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
			String query = "SELECT s FROM Salespeoplelisting s WHERE s.listingNumber = :listingNumber";

		TypedQuery<Salespeoplelisting> tq = em.createQuery(query, Salespeoplelisting.class)
				.setParameter("listingNumber",listingNumber );
		
				try{
					return tq.getSingleResult();
}
		finally
		{

			em.close();
		}
	}
	
}
