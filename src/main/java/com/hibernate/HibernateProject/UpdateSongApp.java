package com.hibernate.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Song;
import com.entity.SongDetails;

public class UpdateSongApp {
	
	public static void main(String[] args) {
		
		Configuration c=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Song.class);
		
		SessionFactory sf= c.buildSessionFactory();
		
		Session s=sf.openSession();
		Song s1= s.get(Song.class, 1);
		SongDetails d1= new SongDetails();
		d1.setComposername("b praak");
		d1.setSongtype("lofi");
		d1.setDuration(2.20);
		s1.setSongname("teri Mitti");
		s1.setDetails(d1);
		
		Transaction tx= s.beginTransaction();
		s.update(s1);
		tx.commit();
		System.out.println("song updated");
	}

}
