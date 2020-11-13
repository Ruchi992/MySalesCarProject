package moylishmotors;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil
{

	private static final EntityManagerFactory emf;
	private static final String persistenceUnit = "MoylishMotors_PU";

	static
	{
		try
		{
			emf = Persistence.createEntityManagerFactory(persistenceUnit);
		}
		catch (Throwable ex)
		{
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("MoylishMotors_PU");

	public static EntityManagerFactory getEMF()
	{
		return EMF;
	}

	public static EntityManagerFactory getEmf()
	{
		return emf;
	}
}
