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
 * @author Industry Connect
 */
public class StockDB
{

	public static List<Sheet1> getAllSheet1()
	{
		EntityManager em = DBUtil.getEMF().createEntityManager();

		String q = "SELECT s from Sheet1 s";

		TypedQuery<Sheet1> typedQuery = em.createQuery(q, Sheet1.class);

		List<Sheet1> list = null;

		try
		{
			list = typedQuery.getResultList();
			for (Sheet1 s : list)
			{
				System.out.println(s);
			}

			if (list == null || list.size() == 0)
			{
				return null;
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			em.close();
		}
		System.out.println("Here is  end");
		return list;
	}

//    public static SalesStock getAccountByID(int accountID) {
//        EntityManager em = DBUtil.getEmf().createEntityManager();
//
//        SalesStock sheet1 = null;
//        try {
//            sheet1 = em.find(SalesStock.class, accountID);
//        } catch (Exception ex) {
//            System.out.println(ex);
//        } finally {
//            em.close();
//        }
//
//        return sheet1;
//    }
}
