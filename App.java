package com.hibernate.read.fatch.Rani;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		
		// create

//		Rani r=new Rani();
//		r.setrId(1);
//		r.setrName("deeksha");
//		r.setrSal("456789");
//		r.setrLanguage("Hibernate");
//
//		Rani r1=new Rani();
//		r1.setrId(2);
//		r1.setrName("shreya");
//		r1.setrSal("98765");
//		r1.setrLanguage("ABCD");
//
//		Rani r2=new Rani();
//		r2.setrId(3);
//		r2.setrName("bujji");
//		r2.setrSal("123423423");
//		r2.setrLanguage("Numbers");
//
//		Rani r3=new Rani();
//		r3.setrId(4);
//		r3.setrName("kariyelli");
//		r3.setrSal("456789");
//		r3.setrLanguage("Amma nodu mama ");
//
//
//		Configuration cfg=new Configuration().configure().addAnnotatedClass(Rani.class);
//		SessionFactory sf=cfg.buildSessionFactory();
//		Session session=sf.openSession();
//		Transaction trans=session.beginTransaction();
//
//
//		List<Rani> lists=new ArrayList<Rani>();
//		
//		lists.add(r);
//		lists.add(r1);
//		lists.add(r2);
//		lists.add(r3);
//		
//		for( Object list : lists)
//		{
//			System.out.println(list);
//			session.save(list);
//		}
//		
//		trans.commit();
//		session.close();
		
		
		
		
		
		//update

//
//		Configuration cfg=new Configuration().configure().addAnnotatedClass(Rani.class);
//		SessionFactory sf=cfg.buildSessionFactory();
//		Session session=sf.openSession();
//		Transaction trans=session.beginTransaction();
//		
//		trans.commit();
//		session.close();
		
		
		// read 
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Rani.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		
		
		Rani rani=session.load(Rani.class, 1);  
		Rani rani1=session.load(Rani.class, 2); 
		Rani rani2=session.load(Rani.class, 3); 
		Rani rani3=session.load(Rani.class, 4); 
		Rani rani4=session.load(Rani.class, 5); 
		Rani rani5=session.load(Rani.class, 6); 
		System.out.println( rani+""+rani1+""+rani2+""+rani3+""+rani4+""+rani5+""+rani5);
		
		trans.commit();
		session.close();


	}
}
