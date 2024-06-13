package com.hibernate.HibernateProject;

import org.hibernate.SessionFactory;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.entity.Song;

public class ReadSongApp {

	public static void main(String[] args) {
		Song s1= new Song();
		Configuration c= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Song.class);
		
		SessionFactory sf= c.buildSessionFactory();
		s1.toString();
		
		Session s=sf.openSession();
		System.out.println(s.get(Song.class, 2));
		
		
		
	}
}
