## Hospital Management System (HMS)
# Overview
The Hospital Management System (HMS) is a full-stack web application built with Java Spring Boot and Thymeleaf for managing hospital operations. It provides functionality to manage patients, doctors, appointments, and room allocations. The system uses an in-memory sql database for simplicity and Bootstrap for a responsive user interface.
This project serves as a starting point for a hospital management system, with basic CRUD operations and room assignment features. It is designed to be extensible for additional features like authentication, advanced validation, or a REST API with a modern frontend.

# Features
Patient Management: Add, edit, delete, and list patients with details (name, age, gender, contact, and room assignment).
Doctor Management: Add, edit, delete, and list doctors with details (name, specialty, contact).
Appointment Management: Schedule, edit, delete, and list appointments, linking patients and doctors.
Room Allocation: Manage hospital rooms (room number, type, status) and assign rooms to patients.
Responsive UI: Built with Thymeleaf and Bootstrap for a clean, user-friendly interface.
In-Memory Database: Uses Mysql for easy setup and testing, with automatic schema creation.

# Technologies Used

Backend: Java 21, Spring Boot 3.3.2, Spring Data JPA, Hibernate
Frontend: Thymeleaf, Bootstrap 4.5.2 (via CDN)
Database: Mysql
Build Tool: Maven

# Prerequisites

Java: JDK 21 or later
Maven: 3.6.0 or later
IDE: IntelliJ IDEA, Eclipse, or any Java IDE (optional but recommended)
Browser: Any modern web browser (e.g., Chrome, Firefox)

