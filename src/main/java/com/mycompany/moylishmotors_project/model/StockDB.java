/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moylishmotors_project.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Industry Connect
 */
public class StockDB {
  
    
    public static List<Sheet1> getAllSheet1() {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        String q = "SELECT s from sheet1 s";
         
        TypedQuery<Sheet1> tq = em.createQuery(q, Sheet1.class);
        
        List<Sheet1> list = null;
       
        
        try {
            list = tq.getResultList();
            for(Sheet1 s : list){
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
        System.out.println("Here is  end");
        return list;
    }


//    public static Sheet1 getAccountByID(int accountID) {
//        EntityManager em = DBUtil.getEmf().createEntityManager();
//
//        Sheet1 sheet1 = null;
//        try {
//            sheet1 = em.find(Sheet1.class, accountID);
//        } catch (Exception ex) {
//            System.out.println(ex);
//        } finally {
//            em.close();
//        }
//
//        return sheet1;
//    }
    
}
    

