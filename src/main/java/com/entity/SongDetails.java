package com.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class SongDetails {
	
	private String songtype;
	private double duration;
	private String composername;
	
	
	public String getSongtype() {
		return songtype;
	}
	public void setSongtype(String songtype) {
		this.songtype = songtype;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getComposername() {
		return composername;
	}
	public void setComposername(String composername) {
		this.composername = composername;
	}
	@Override
	public String toString() {
		return "SongDetails [songtype=" + songtype + ", duration=" + duration + ", composername=" + composername + "]";
	}
	
	
	

}
