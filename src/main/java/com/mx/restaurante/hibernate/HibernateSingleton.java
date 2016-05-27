package com.mx.restaurante.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public final class HibernateSingleton {
	
	private static Logger logger = Logger.getLogger(HibernateSingleton.class);
	private static SessionFactory sessionFactory;
	  
    public static Session getSession() throws HibernateException {
    	buildSessionFactory();
    	Session session = HibernateSingleton.sessionFactory.openSession(); 
        return session;
    }
	    
    private static void buildSessionFactory(){
    	if(HibernateSingleton.sessionFactory != null && !sessionFactory.isClosed()) return;
    	
    	try{
    		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
        			.configure() // configures settings from hibernate.cfg.xml
        			.build();
        	try {
        		sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        	}
        	catch (Exception e) {
        		// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
        		// so destroy it manually.
        		StandardServiceRegistryBuilder.destroy( registry );
        	}
	     }catch (Exception he){
	         logger.fatal("Error creating Session.",he);
	     }
	}
    

}
