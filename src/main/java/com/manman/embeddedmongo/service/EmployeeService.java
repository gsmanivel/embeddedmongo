package com.manman.embeddedmongo.service;

import com.manman.embeddedmongo.model.Employee;
import com.manman.embeddedmongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
       return employeeRepository.findAll();
    }

    public Employee insertEmployee(Employee employee){
        return employeeRepository.insert(employee);
    }


    public void deleteAll() {
        employeeRepository.deleteAll();
    }
}
