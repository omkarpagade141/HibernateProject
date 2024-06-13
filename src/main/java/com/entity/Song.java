package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Song {
	@Id
	private int songid;
	private String songname;
	private SongDetails details;
	
	public SongDetails getDetails() {
		return details;
	}

	public void setDetails(SongDetails details) {
		this.details = details;
	}

	public int getSongid() {
		return songid;
	}
	
	public void setSongid(int songid) {
		this.songid = songid;
	}
	
	public String getSongname() {
		return songname;
	}
	
	public void setSongname(String songname) {
		this.songname = songname;
	}

	@Override
	public String toString() {
		return "Song [songid=" + songid + ", songname=" + songname + ", details=" + details + "]";
	}

 
	

}
