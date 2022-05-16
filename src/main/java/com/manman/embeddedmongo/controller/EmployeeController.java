package com.manman.embeddedmongo.controller;

import com.manman.embeddedmongo.model.Employee;
import com.manman.embeddedmongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAll(){
        return employeeService.findAll();
    }


    @PostMapping("/employee")
    public Employee insertNewEmployee(@RequestBody  Employee e){
        return employeeService.insertEmployee(e);

    }


    @DeleteMapping("/")
    public void deleteAll(){
        employeeService.deleteAll();
    }
}
