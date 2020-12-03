package moylishmotors.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import moylishmotors.Salesstock;

public class StockDB
{
	public static List<Salesstock> getAllSalesStock()
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT s FROM Salesstock s";

		TypedQuery<Salesstock> typedQuery = entityManager.createQuery(sql, Salesstock.class);
		try
		{
			return typedQuery.getResultList();
		}
		finally
		{
			entityManager.close();
		}
	}
	public static Salesstock getByLinstingNumber(int listingNumber)
	{		
			EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
			System.out.println("moylishmotors.repositories.StockDB.getByLinstingNumber()");
	
	      String query = "SELECT s FROM Salesstock s WHERE s.listingNumber = :listingNumber";

		TypedQuery<Salesstock> tq = em.createQuery(query, Salesstock.class)
				
				.setParameter("listingNumber",listingNumber );
		 System.out.println("Null");
				try{
					return tq.getSingleResult();
}
		finally
		{

			em.close();
		}
	}
	
	 public static Salesstock getByPrice(int buyPrice)
	{		
			EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
			String query = "SELECT s FROM Salesstock s WHERE s.buyPrice = :buyPrice";

		TypedQuery<Salesstock> tq = em.createQuery(query, Salesstock.class)
				.setParameter("buyPrice",buyPrice );
		
				try{
					return tq.getSingleResult();
}
		finally
		{

			em.close();
		}
	}
  
}
	 
	 

	  


    



