package com.project.OnlineLawSystemAPI.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "lawyer_master")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Lawyer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3050306502215032993L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private String id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "expertise")
	private String expertise;

	@Column(name = "court_id")
	private String courtId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getCourtId() {
		return courtId;
	}

	public void setCourtId(String courtId) {
		this.courtId = courtId;
	}
	
}
