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
		
        String query = "SELECT s FROM SalesStock s WHERE s.model= :model";
        
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
    
}


