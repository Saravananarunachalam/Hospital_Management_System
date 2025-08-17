package com.example.demo.model;


import jakarta.persistence.*;


@Entity

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomNumber;
    private String type; // e.g., General, ICU, Private
    private String status; // e.g., Available, Occupied
    
    
	public Room() {
		super();
	}
	public Room(Long id, String roomNumber, String type, String status) {
		super();
		this.id = id;
		this.roomNumber = roomNumber;
		this.type = type;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

    
    
}