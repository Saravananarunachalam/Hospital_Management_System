package com.example.demo.controller;

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public String listDoctors(Model model) {
        model.addAttribute("doctors", doctorService.findAll());
        return "doctors/list";
    }

    @GetMapping("/new")
    @PreAuthorize("hasRole('ADMIN')")
    public String showFormForAdd(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "doctors/form";
    }

    @GetMapping("/edit/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String showFormForUpdate(@PathVariable Long id, Model model) {
        doctorService.findById(id).ifPresent(doctor -> model.addAttribute("doctor", doctor));
        return "doctors/form";
    }

    @PostMapping("/save")
    @PreAuthorize("hasRole('ADMIN')")
    public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
        doctorService.save(doctor);
        return "redirect:/doctors";
    }

    @GetMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteDoctor(@PathVariable Long id) {
        doctorService.deleteById(id);
        return "redirect:/doctors";
    }
}
