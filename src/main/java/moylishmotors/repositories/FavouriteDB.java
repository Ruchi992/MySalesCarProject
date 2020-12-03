/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.TypedQuery;
import moylishmotors.Favouritelist;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class FavouriteDB
{
	public static List<Favouritelist> getAlllist()
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT f FROM Favouritelist f";

		TypedQuery<Favouritelist> typedQuery = entityManager.createQuery(sql, Favouritelist.class);
		try
		{
			return typedQuery.getResultList();
		}
		finally
		{
			entityManager.close();
		}
	}
	public static void add( Favouritelist list ) {
		System.out.println("moylishmotors.repositories.FavouriteDB.add() List:" + list);
     
     EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
     
     EntityTransaction trans = em.getTransaction();
     
     try {
		 System.out.println("Try");
         trans.begin();
         em.persist(list);
         trans.commit();
		 System.out.println("moylishmotors.repositories.FavouriteDB.add() after commint");
     }
     catch(Exception ex) {
         System.out.println(ex);
     }
     finally {
         em.close();
     }  
     
 }
	 public static void deleteFav( int listingNumber) {
         EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        String query = "DELETE  f FROM Favouritelist f WHERE f.listingNumber = :listingNumber";
                
        TypedQuery<Favouritelist> tq = em.createQuery(query, Favouritelist.class);
        int result = 0;
        
        try {
            
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            result = tq.setParameter("listingNumber", listingNumber).executeUpdate();
            tx.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
       
    }
}
