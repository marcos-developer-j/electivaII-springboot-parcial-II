package com.uptc.electiva.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    @Column( length = 100, nullable = false)
	private String fullname;
    @Column( length = 20, nullable = false)
	private String cc;
    @Column( length = 20, nullable = false)
	private String phone;
    @Column( length = 20, nullable = false)
	private String address;
    @Column(nullable = false)
	private LocalDate birthday;
    @OneToMany(mappedBy = "teacher")
	private List<ComplementaryActivity> complementaryActivities;
	public Teacher() {

	}
	public Teacher(int id, String fullname, String cc, String phone, String address,LocalDate birthday) {
		this.id = id;
		this.fullname = fullname;
		this.cc = cc;
		this.phone = phone;
		this.address = address;
		this.birthday=birthday;
		complementaryActivities= new ArrayList<>();
	}

	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public List<ComplementaryActivity> getComplementaryActivities() {
		return complementaryActivities;
	}
	public void setComplementaryActivities(List<ComplementaryActivity> complementaryActivities) {
		this.complementaryActivities = complementaryActivities;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
