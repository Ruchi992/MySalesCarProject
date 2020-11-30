package moylishmotors.repositories;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil
{
	private static final EntityManagerFactory entityManagerFactory;
	private static final String persistenceUnitName = "MoylishMotors_PU";

	static
	{
		try
		{
			entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
		}
		catch(Throwable ex)
		{
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static EntityManagerFactory getEntityManagerFactory()
	{
		return entityManagerFactory;
	}
}
