/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class FuelTableDB
{
	public static List<FuelTable> getFuel(String fuel)
	{
	EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT f FROM FuelTable f";

		TypedQuery<FuelTable> typedQuery = entityManager.createQuery(sql, FuelTable.class);
		try
		{
			return typedQuery.getResultList();
		}
		finally
		{
			entityManager.close();
		}
	}
	
	public static List<String> getFuelType() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        System.out.println("feul");
		
        String query = "SELECT f.fuel FROM FuelTable f";
        
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
