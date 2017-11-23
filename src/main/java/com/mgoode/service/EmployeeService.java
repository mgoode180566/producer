package com.mgoode.service;

import com.mgoode.model.Employee;
import com.mgoode.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Component
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee findEmployeeByID( Long id ) {
        return employeeRepository.findOne(id);
    }

    public Iterable<Employee> list() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee( Long id ) {
        employeeRepository.delete(id);
    }

}
