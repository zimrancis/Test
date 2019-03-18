package com.cs.demo.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure().build();

        SessionFactory sessionFactory = new MetadataSources(standardRegistry).addAnnotatedClass(Alien.class).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        AlienName an = new AlienName();
        an.setFname("Shah Mohd.");
        an.setLname("Al-Imran");
        an.setMname("Zobair");
        
        Alien a = new Alien();
        a.setId(101);
        a.setAname(an);
        a.setColor("Blue");

        System.out.println( a.toString());
        session.save(a);
        session.getTransaction().commit();
        session.close();        
        
/*
         // ******* TO PRSIST DATA ******* 
        Alien cs = new Alien();
        cs.setId(106);
        cs.setName("Shah Mohd. Zobair Al-Imran");
        cs.setColor("White");
        System.out.println( cs.toString());
        
        Configuration con = new  Configuration().configure().addAnnotatedClass(Alien.class);        
        SessionFactory sf = con.buildSessionFactory();        
        Session session = sf.openSession();    
        Transaction tx = session.beginTransaction();        
        session.save(cs);
        
        tx.commit();
*/

/*
        // ******* TO FETCH DATA *******


        Alien cs = null;
        
        Configuration con = new  Configuration().configure().addAnnotatedClass(Alien.class);        
        SessionFactory sf = con.buildSessionFactory();        
        Session session = sf.openSession();    
        Transaction tx = session.beginTransaction();        
        
        cs = session.get(Alien.class, 106);
        
        tx.commit();
        System.out.println(cs);

*/
/*
        // ******* TO PERSIST or SAVE DATA *******
        
       AlienName an = new AlienName();
       an.setFname("Shah Mohd.");
       an.setLname("Al-Imran");
       an.setMname("Zobair");
       
        Alien cs = new Alien();
       cs.setId(101);
       cs.setAname(an);
       cs.setColor("White");
       System.out.println( cs.toString());
       
       Configuration con = new  Configuration().configure().addAnnotatedClass(Alien.class);        
       SessionFactory sf = con.buildSessionFactory();        
       Session session = sf.openSession();    
       Transaction tx = session.beginTransaction();        
       session.save(cs);
       
       tx.commit();
       
       System.out.println( cs);
       
*/
/*
        // ******* TO FETCH or RETRIEVE DATA *******
        
    
        Alien cs = null;
       
       Configuration con = new  Configuration().configure().addAnnotatedClass(Alien.class);        
       SessionFactory sf = con.buildSessionFactory();        
       Session session = sf.openSession();    
       Transaction tx = session.beginTransaction();        
     
       cs = session.get(Alien.class, 101);
       
       tx.commit();
       System.out.println(cs); 
       
*/   
        // ******* TO UPDATE DATA *******
        
        
        // ******* TO DELETE DATA ******* 
   }
}
