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
import moylishmotors.Carprice;
import moylishmotors.web.servlets.CarPrice;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class PriceDB
{
public static List<CarPrice> getPriceList() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        
        String q = "SELECT c from Carprice c";
        
        TypedQuery<CarPrice> tq = em.createQuery(q, CarPrice.class);
        //TypedQuery<Authors> tq = em.createNamedQuery("Authors.findAll", Authors.class);
        
        List<CarPrice> list;
        
        try {
            list = tq.getResultList();
            
            if (list == null || list.isEmpty())
                list = null;
            
        }
        finally {
            em.close();
        }

        return list;
	
	}
	
	 public static CarPrice getPriceByID(int PriceId) {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();

        CarPrice price = null;
        try {
            price = em.find(CarPrice.class, PriceId);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }

        return price;
    }
	 public  static void AddPrice(CarPrice price){
       EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
       try{
       EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.persist(price);
        
        tx.commit();

       }catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
       
    }
	public static Carprice AddPrice(int PriceId)
	{
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
    
}
	

