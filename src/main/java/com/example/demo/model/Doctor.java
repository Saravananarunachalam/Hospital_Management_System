package com.example.demo.model;


import jakarta.persistence.*;


@Entity
@Table
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialty;
    private String contactNumber;
    
	public Doctor() {
		super();
	}
	public Doctor(Long id, String name, String specialty, String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.specialty = specialty;
		this.contactNumber = contactNumber;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
    
    
}