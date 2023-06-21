package com.simform.EmployeeManagementSystem.controller;

import com.simform.EmployeeManagementSystem.entity.*;
import com.simform.EmployeeManagementSystem.service.*;
import jakarta.servlet.http.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.*;

import java.util.*;

@Controller
@RequestMapping("/employees")
public class EmpController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String home(Model model){
        List<Employee> allEmp = employeeService.getAllEmp();
        model.addAttribute("emp", allEmp);
        model.addAttribute("employeeService",employeeService);
        return "index";
    }
    @GetMapping("/addemp")
    public String addEmpForm(){
        return "add_emp";
    }
    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee emp, @RequestParam(value = "submitButton") String submitButton,HttpSession session){
        System.out.println(emp);
//        System.out.println(session.getAttribute("msg"));
        if(submitButton != null) session.setAttribute("msg", "Employee Added Successfully !");
        employeeService.addEmployee(emp);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        Employee empById = employeeService.getEmpById(id);
        model.addAttribute("emp", empById);
        return "edit";
    }
    @PostMapping("/update")
    public String updateEmp(@ModelAttribute Employee emp, HttpSession session){
        employeeService.addEmployee(emp);
        session.setAttribute("msg", "Employee Data updated Successfully!");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id, HttpSession session){
        employeeService.deleteEmp(id);
        session.setAttribute("msg", "Employee Data deleted Successfully!");
        return "redirect:/";
    }
}
