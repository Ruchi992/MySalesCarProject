/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import moylishmotors.Salespeople;

/**
 *
 * @author Ruchi Devi <https://github.com/Ruchi992>
 */
public class SalesPeopleDB
{
	public static List<Salespeople> getAllSalespeoples()
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT s FROM Salespeople s";
   
		TypedQuery<Salespeople> typedQuery = entityManager.createQuery(sql, Salespeople.class);
		try{
			System.out.println("********************* getAllSalespeoples ");
			List<Salespeople> ResultList = typedQuery.getResultList();
		 System.out.println("ResultList" +  ResultList);
			
			return ResultList;
		}
		finally
		{
			entityManager.close();
		}
	}
	
	public static Salespeople getByEmail(String  salesPersonEmail)
	{
		EntityManager entityManager = DBUtil.getEntityManagerFactory().createEntityManager();
		String sql = "SELECT s FROM Salespeople s WHERE s.salesPersonEmail = :salesPersonEmail";
   
		TypedQuery<Salespeople> typedQuery = entityManager.createQuery(sql, Salespeople.class)
				.setParameter("salesPersonEmail", salesPersonEmail);
		try{
			System.out.println("********************* getAllSalespeoples ");
			Salespeople result = typedQuery.getSingleResult();
		 System.out.println("ResultList" +  result);
			
			return result;
		}
		finally
		{
			entityManager.close();
		}
	}
}
