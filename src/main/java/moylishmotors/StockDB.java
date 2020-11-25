package moylishmotors;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
	
	 public static List<String> getModel() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        System.out.println("SalesStock getModel");
		
        String query = "SELECT s.model FROM SalesStock s";
        
        TypedQuery<String> tq = em.createQuery(query, String.class);
        
        List<String> list = null;
        
        try {
            list = tq.getResultList();
            for( String s : list){
                System.out.println(s);
            
            }

            if (list == null || list.size() == 0) {
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
       
        return list;
    }
	 public static List<String> getYear() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        System.out.println("SalesStock getMake");
		
        String query = "SELECT s.year FROM SalesStock s";
        
        TypedQuery<String> tq = em.createQuery(query, String.class);
        
        List<String> list = null;
        
        try {
            list = tq.getResultList();
            for( String s : list){
                System.out.println(s);
            
            }

            if (list == null || list.size() == 0) {
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }       
        return list;
    }
	 public static List<String> getMake() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        System.out.println("SalesStock getMake");
		
        String query = "SELECT s.make FROM SalesStock s";
        
        TypedQuery<String> tq = em.createQuery(query, String.class);
        
        List<String> list = null;
        
        try {
            list = tq.getResultList();
            for( String s : list){
                System.out.println(s);
            
            }

            if (list == null || list.size() == 0) {
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }       
        return list;
    }
	 public static List<String> getColour() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        System.out.println("SalesStock getyear");
		
        String query = "SELECT s.colour FROM SalesStock s";
        
        TypedQuery<String> tq = em.createQuery(query, String.class);
        
        List<String> list = null;
        
        try {
            list = tq.getResultList();
            for( String s : list){
                System.out.println(s);
            
            }

            if (list == null || list.size() == 0) {
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
       
        return list;
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
	  


    



