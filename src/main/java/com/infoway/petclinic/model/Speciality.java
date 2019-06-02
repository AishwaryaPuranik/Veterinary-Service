package com.infoway.petclinic.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Speciality {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int sid;
	@Column(name="specialField")
	private String name;
	
	public Speciality(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Speciality() {
		super();
	}
	
	
	
	
}
