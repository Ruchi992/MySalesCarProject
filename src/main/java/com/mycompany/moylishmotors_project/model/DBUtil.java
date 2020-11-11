/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moylishmotors_project.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Industry Connect
 */
public class DBUtil {    
    
     private static final EntityManagerFactory EMF = 
            Persistence.createEntityManagerFactory("moter_UP");
     
    public static EntityManagerFactory getEMF() { return EMF; }

}
