package com.hibernate.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Song;
import com.entity.SongDetails;
import com.entity.Song;

import jakarta.transaction.Transaction;

public class CreateSongApp { 
	public static void main(String[] args) {
		try {
			Configuration c=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Song.class);
			
			Song s1=new Song();
			
			SongDetails d1= new SongDetails();
			d1.setSongtype("sufi");
			d1.setDuration(3.25);
			d1.setComposername("Arajit Singh");
			
			
			s1.setSongid(2);
			s1.setSongname("a watan");
			s1.setDetails(d1);
			 
			
			SessionFactory sf=c.buildSessionFactory();
			Session session=sf.openSession();
			
			org.hibernate.Transaction tx= session.beginTransaction();
			
			session.persist(s1);
			
			tx.commit();
		
			
			System.out.println("@@@@@@@@@@@ data saved success ");
			session.close();
			
		} catch (Exception e) {
			System.out.println("###########"+ e);
		}
		
	 	
	}
	

}
