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
	public Salesstock getStockById(int id)
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		try
		{
			return entityManager.find(Salesstock.class, id);
		}
		finally
		{

			entityManager.close();
		}
	}
	public static Salesstock getSalesStockByID(int stockId) {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();

        Salesstock salesStock = null;
        try {
            salesStock = em.find(Salesstock.class, stockId);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }

        return salesStock;
    }	
	 
	 
}
	  


    



