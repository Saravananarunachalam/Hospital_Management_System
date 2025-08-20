package com.example.demo.model;


import jakarta.persistence.*;


@Entity
@Table
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private String specialty;
    private int experience;
    private String contactNumber;
    @OneToOne(mappedBy = "doctor")
    private Users user; // Link to User entity for authentication
    
    
	public Doctor() {
		super();
	}
	public Doctor(Long id, String name, String gender, String specialty, int experience, String contactNumber,
			Users user) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.specialty = specialty;
		this.experience = experience;
		this.contactNumber = contactNumber;
		this.user = user;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
    
    
	    
}
