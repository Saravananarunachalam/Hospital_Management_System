package com.example.demo.config;



import com.example.demo.model.Doctor;
import com.example.demo.model.Users;
import com.example.demo.service.DoctorService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        // Admin user
        Users admin = new Users();
        admin.setUsername("admin");
        admin.setPassword(passwordEncoder.encode("admin123"));
        admin.setRole("ADMIN");
        userService.save(admin);

        // Receptionist user
        Users receptionist = new Users();
        receptionist.setUsername("receptionist");
        receptionist.setPassword(passwordEncoder.encode("recep123"));
        receptionist.setRole("RECEPTIONIST");
        userService.save(receptionist);

        // Doctor user
        Doctor doctor = new Doctor();
        doctor.setName("Dr.Kamesh");
        doctor.setGender("male");
        doctor.setSpecialty("Cardiology");
        doctor.setExperience(5);
        doctor.setContactNumber("123456789");
        
        doctor = doctorService.save(doctor);

        Users doctorUser = new Users();
        doctorUser.setUsername("Dr.Kamesh");
        doctorUser.setPassword(passwordEncoder.encode("123456789")); // Contact number as password
        doctorUser.setRole("DOCTOR");
        doctorUser.setDoctor(doctor);
        userService.save(doctorUser);

        doctor.setUser(doctorUser);
        doctorService.save(doctor);
    }
}
