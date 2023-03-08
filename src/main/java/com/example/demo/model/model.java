package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospitaldetails")
public class model{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="patientname")
           private String patientname;
	@Column(name="age")
           private int age;
	@Column(name="gender")
	       private String gender;
	@Column(name="contactno")
	       private long contactno;
	@Column(name="email")
    private String email;
	@Column(name="disease")
    private String disease;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
public model(int id,String patientname, int age, String gender, int contactno, String email, String disease) {
		super();
		this.id = id;
		this.patientname = patientname;
		this.age = age;
		this.gender = gender;
		this.contactno = contactno;
		this.email = email;
		this.disease = disease;
	}
public model() {
		
	}
	
}
				