package moylishmotors;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil
{
	private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("MoylishMotors_PU");

	public static EntityManagerFactory getEMF()
	{
		return EMF;
	}
}
