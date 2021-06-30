package com.example.springbootthymeleafcrudwebapp.controller;

import com.example.springbootthymeleafcrudwebapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    // Display list of employee
    @GetMapping("/")

    public String viewHomePage(Model model){
        model.addAttribute("listEmployee", employeeService.getAllEmployee());
        return "index";
    }
}