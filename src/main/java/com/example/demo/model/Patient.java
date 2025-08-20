package com.example.demo.model;



import jakarta.persistence.*;

@Entity
@Table
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String gender;
    private double weight;
    private String contactNumber;
    private String address;
   
    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

	public Patient() {
		super();
	}

	public Patient(Long id, String name, int age, String gender, double weight, String contactNumber, String address,
			Room room) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.contactNumber = contactNumber;
		this.address = address;
		this.room = room;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
    
 
        
}
