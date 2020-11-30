package moylishmotors.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import moylishmotors.SalesStock;

public class StockDB
{
	public static List<SalesStock> getAllSalesStock()
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT s FROM SalesStock s";

		TypedQuery<SalesStock> typedQuery = entityManager.createQuery(sql, SalesStock.class);
		try
		{
			return typedQuery.getResultList();
		}
		finally
		{
			entityManager.close();
		}
	}
	public SalesStock getStockById(int id)
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		try
		{
			return entityManager.find(SalesStock.class, id);
		}
		finally
		{

			entityManager.close();
		}
	}
	public static SalesStock getSalesStockByID(int stockId) {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();

        SalesStock salesStock = null;
        try {
            salesStock = em.find(SalesStock.class, stockId);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }

        return salesStock;
    }	
	 
	  public static List<SalesStock> getStockByMakeAndBuyPrice(String make, int minprice, int maxprice){
        System.out.println("StockDB getStockPrice ");
        System.out.println("make: " + make + " minprice: " + minprice + " maxprice:" + maxprice);
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
		
		String query;
		TypedQuery<SalesStock> tq = null;
		
		if (make == "" && maxprice != 0) {
			System.out.println("StocDB getStockByPrice if 1");
			 query = "SELECT s FROM SalesStock s WHERE s.buyPrice = :buyPrice";
			//query = "SELECT p FROM Properties p WHERE p.price >= :minprice AND p.price <:maxprice";
			tq = em.createQuery(query, SalesStock.class);
			tq.setParameter("minprice", minprice).setParameter("maxprice", maxprice);
		} else if (make== "" && maxprice == 0) {
			System.out.println("StockDB getStockByPrice if 2");
			query = "SELECT s FROM SalesStock s WHERE s.Buyprice >= :minprice";
			tq = em.createQuery(query, SalesStock.class);
			tq.setParameter("minprice", minprice);		
		} else if (make != "" && maxprice != 0) {
			System.out.println("StockDB getStockByPrice if  3");
			query = "SELECT s FROM SalesStock s WHERE s.make = :make AND s.buyprice >= :minprice AND p.price <:maxprice";
			tq = em.createQuery(query, SalesStock.class);
			tq.setParameter("make", make).setParameter("minprice", minprice).setParameter("maxprice", maxprice);
		} else if (!"".equals(make) && maxprice == 0 ){
			System.out.println("StockDB getSockByPrice if 4");
			
		
         
        List<SalesStock> list = null;
        
        try {
            System.out.println("StockDB getStockByPrice   tq:  " + tq);
            list = tq.getResultList();
                                 
            for(SalesStock s : list){
                System.out.println(s);
            
            }

            if (list == null || list.isEmpty()) {
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
        System.out.println("StockDB getStockByPrice   end  ");
        return list;
    }
		return null;
	  }
}
	  


    



