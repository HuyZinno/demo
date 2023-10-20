package com.hibernate.demo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Alien a = new Alien(5 , "Gray", "Lam"); 
		session.save(a); 
//		Alien a2 = session.get(Alien.class, 6);
//		System.out.println(a2.toString());
//		String query = "select  a.id, a.color, a.name  from Alien a";
//		List<Object[]> list = session.createQuery(query).list();
//		for (Object[] alien : list) {
//			System.out.println(alien[0]+"-"+alien[1]+"-"+alien[2]); 
//		}
		transaction.commit();
		session.close();
			
    }
}
