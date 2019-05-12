package org.caps.dev.feeback.dbutils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaHibernateUtils {

	private JpaHibernateUtils() {
	}
	
   private static final EntityManagerFactory emf = retrieveEMF();
			
	
	private static EntityManagerFactory retrieveEMF() {
		return Persistence.createEntityManagerFactory("myPersistenceUnit");
	}
	
	public static EntityManagerFactory getEMF() {
		return emf;
	}
	
	
	
}
