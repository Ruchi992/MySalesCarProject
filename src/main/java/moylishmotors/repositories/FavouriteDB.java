/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
	 public static int deleteFav(int id) {
        System.out.println("PropertyDB DeleteProperty " + id);
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        String query = "DELETE FROM Favouritelist f WHERE f.id = :id";
                
        TypedQuery<Favouritelist> tq = em.createQuery(query, Favouritelist.class);
        int result = 0;
        
        try {
            
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            result = tq.setParameter("id", id).executeUpdate();
            tx.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
        System.out.println("Favouritelist DeleteFavouritelist   end  ");
        return result;
    }
}
