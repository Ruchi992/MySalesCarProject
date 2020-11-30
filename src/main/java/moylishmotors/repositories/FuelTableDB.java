/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import moylishmotors.Fuel;
import moylishmotors.Salespeople;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class FuelTableDB
{
	public static Fuel getFuel(String fuel)
	{
	EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT f FROM FuelTable f WHERE f.fuel = :fuel";

		TypedQuery<Fuel> typedQuery = entityManager.createQuery(sql, Fuel.class)
				.setParameter("fuel", fuel);
		try{
			System.out.println("********************* getAllSalespeoples ");
			Fuel result = typedQuery.getSingleResult();
		 System.out.println("ResultList" +  result);
			
			return result;
		}
		finally
		{
			entityManager.close();
	}
	}
	
	public static List<String> getFuelType() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        System.out.println("feul");
		
        String query = "SELECT f.fuel FROM Fuel f";
        
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
	public static Fuel getFuel(Fuel fuel)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
