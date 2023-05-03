package com.uptc.electiva.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "complementary_activities")
public class ComplementaryActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    @Column( length = 100, nullable = false)
	private String name;
    @Column( length = 250, nullable = false)
	private String description;
    @Column(nullable = false)
	private LocalDate dateStart;
    @Column(nullable = false)
	private LocalDate dateEnds;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
	private Teacher teacher;
	public ComplementaryActivity() {

	}
	public ComplementaryActivity(Integer id, String name, String description, LocalDate dateStart, LocalDate dateEnds) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.dateStart = dateStart;
		this.dateEnds = dateEnds;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateStart() {
		return dateStart;
	}
	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}
	public LocalDate getDateEnds() {
		return dateEnds;
	}
	public void setDateEnds(LocalDate dateEnds) {
		this.dateEnds = dateEnds;
	}
	
	
	
	

}
