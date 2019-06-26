package com.project.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    { 
    	employee obj = new employee();
    	
    	obj.setId(106);
    	obj.setFirstname("David");
    	obj.setLastname("Gem");
    	obj.setSalary(30000);
    	obj.setMail("davidgem89@gmail.com");
    
    	Configuration con = new Configuration().configure().addAnnotatedClass(employee.class);
    	
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    	
    	SessionFactory sf = con.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	session.save(obj);
    	obj = (employee) session.get(employee.class,106);
    	tx.commit();
    	System.out.println(obj);
    }
}
