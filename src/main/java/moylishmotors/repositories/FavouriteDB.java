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
     
     EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
     
     EntityTransaction trans = em.getTransaction();
     
     try {
         trans.begin();
         em.persist(list);
         trans.commit();
     }
     catch(Exception ex) {
         System.out.println(ex);
     }
     finally {
         em.close();
     }  
     
 }
}
