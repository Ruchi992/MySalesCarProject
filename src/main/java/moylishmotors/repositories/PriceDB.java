/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import moylishmotors.Carpricetable;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class PriceDB
{
public static List<Carpricetable> getPriceList() {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();
        
        String q = "SELECT c from Carpricetable c";
        
        TypedQuery<Carpricetable> tq = em.createQuery(q, Carpricetable.class);
        //TypedQuery<Authors> tq = em.createNamedQuery("Authors.findAll", Authors.class);
        
        List<Carpricetable> list;
        
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
	
	 public static Carpricetable getPriceByID(int PriceId) {
        EntityManager em = DBUtil.getEntityManagerFactory().createEntityManager();

        Carpricetable price = null;
        try {
            price = em.find(Carpricetable.class, PriceId);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }

        return price;
    }
    
}
	

