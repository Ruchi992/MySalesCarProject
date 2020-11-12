package com.mycompany.moylishmotors_project.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil
{
	private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("com.my");

	public static EntityManagerFactory getEMF()
	{
		return EMF;
	}
}
