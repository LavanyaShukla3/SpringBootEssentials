package com.example.roomwebapp.web.controller;

import com.example.roomwebapp.data.repository.StaffRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {

    private final StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping("/staff")
    public String getStaff(Model model) {
        model.addAttribute("staffs", staffRepository.findAll());
        return "staffs";  // corresponds to staffs.html
    }
}