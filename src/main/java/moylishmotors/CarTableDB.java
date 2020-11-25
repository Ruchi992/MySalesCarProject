/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class CarTableDB
{
	public static List<Cartable> getAllCars()
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT c FROM Cartable c";

		TypedQuery<Cartable> typedQuery = entityManager.createQuery(sql, Cartable.class);
		try
		{
			return typedQuery.getResultList();
		}
		finally
		{
			entityManager.close();
		}
	}
	
	
	 public static List<String> getModel() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        System.out.println("new");
		
        String query = "SELECT c.model FROM Cartable c";
        
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
		
        String query = "SELECT c.year FROM Cartable c";
        
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
		
        String query = "SELECT c.make FROM Cartable c";
        
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
		
        String query = "SELECT c.colour FROM Cartable c";
        
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
	  public static List<Cartable> Search(String model, String make, String year, String colour) {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        System.out.println("SalesStock search *** ----");
		System.out.println("SalesStock model:" + model);
		System.out.println("SalesStock make:" + make);
		System.out.println("SalesStock year:" + year);
		System.out.println("SalesStock colour:" + colour);
		
//        String query = "SELECT c.model, c.make, c.year, c.colour, c.engine, c.body FROM Cartable c WHERE c.make = :make and c.model =:model and c.year =:year and c.colour =:colour";
        String query = "SELECT c FROM Cartable c WHERE c.make = :make and c.model =:model and c.year =:year and c.colour =:colour";

        TypedQuery<Cartable> tq = em.createQuery(query, Cartable.class)
				.setParameter("make", make)
				.setParameter("model", model)
				.setParameter("year", year)
				.setParameter("colour", colour);
        
        List<Cartable> list = null;
        
        try {
			System.out.println("*** before result ");
            list = tq.getResultList();
			System.out.println("*** after result");

                System.out.println("*** list " + list);
            
            

            if (list == null ) {
                return new ArrayList<>();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
       
        return list;
    }
	
}
