package com.example.demo.controller;

import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'RECEPTIONIST')")
    public String listAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.findAll());
        return "appointments/list";
    }

    @GetMapping("/new")
    @PreAuthorize("hasAnyRole('ADMIN', 'RECEPTIONIST')")
    public String showFormForAdd(Model model) {
        model.addAttribute("appointment", new Appointment());
        model.addAttribute("patients", patientService.findAll());
        model.addAttribute("doctors", doctorService.findAll());
        return "appointments/form";
    }

    @GetMapping("/edit/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'RECEPTIONIST')")
    public String showFormForUpdate(@PathVariable Long id, Model model) {
        appointmentService.findById(id).ifPresent(appointment -> model.addAttribute("appointment", appointment));
        model.addAttribute("patients", patientService.findAll());
        model.addAttribute("doctors", doctorService.findAll());
        return "appointments/form";
    }

    @PostMapping("/save")
    @PreAuthorize("hasAnyRole('ADMIN', 'RECEPTIONIST')")
    public String saveAppointment(@ModelAttribute("appointment") Appointment appointment) {
        appointmentService.save(appointment);
        return "redirect:/appointments";
    }

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteAppointment(@PathVariable Long id) {
        appointmentService.deleteById(id);
        return "redirect:/appointments";
    }
}
