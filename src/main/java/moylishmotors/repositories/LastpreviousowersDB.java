/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import moylishmotors.Lastpreviousowners;
import moylishmotors.Salespeoplelisting;



/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class LastpreviousowersDB
{
public static List<Lastpreviousowners> getPreviousOwners()
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT 1 FROM Lastpreviousowners 1";
   
		TypedQuery<Lastpreviousowners> typedQuery = entityManager.createQuery(sql, Lastpreviousowners.class);
		try{
			System.out.println("********************* getAllSalespeoples ");
			List<Lastpreviousowners> ResultList = typedQuery.getResultList();
		 System.out.println("ResultList" +  ResultList);
			
			return ResultList;
		}
		finally
		{
			entityManager.close();
		}
	}

  public static Lastpreviousowners getByName(String  lastPreviousOwnersName)
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT l FROM Lastpreviousowners l WHERE l.lastPreviousOwnersName = :lastPreviousOwnersName";
   
		TypedQuery<Lastpreviousowners> typedQuery = entityManager.createQuery(sql, Lastpreviousowners.class)
				.setParameter("lastPreviousOwnersName", lastPreviousOwnersName);
		try{
			System.out.println("********************* getAllSalespeoples ");
			Lastpreviousowners result = typedQuery.getSingleResult();
		 System.out.println("ResultList" +  result);
			
			return result;
		}
		finally
		{
			entityManager.close();
		}
	}
  public static Lastpreviousowners getByLinstingNumber(int listingNumber)
	{		
			EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
			String query = "SELECT l FROM Lastpreviousowners l WHERE l.listingNumber = :listingNumber";

		TypedQuery<Lastpreviousowners> tq = em.createQuery(query, Lastpreviousowners.class)
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
		

