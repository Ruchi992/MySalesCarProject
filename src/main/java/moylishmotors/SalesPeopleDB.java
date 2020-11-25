/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moylishmotors;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
}
