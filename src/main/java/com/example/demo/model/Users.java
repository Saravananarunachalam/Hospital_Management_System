package com.example.demo.model;



import jakarta.persistence.*;



@Entity
public class Users {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String username;
	    private String password;
	    private String role; // ADMIN, DOCTOR, RECEPTIONIST

	    @OneToOne
	    @JoinColumn(name = "doctor_id")
	    private Doctor doctor; // Link to Doctor entity for DOCTOR role

		public Users() {
			super();
		}

		public Users(Long id, String username, String password, String role, Doctor doctor) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.role = role;
			this.doctor = doctor;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Doctor getDoctor() {
			return doctor;
		}

		public void setDoctor(Doctor doctor) {
			this.doctor = doctor;
		}
	    
	    
	    
}
    
    
