package com.mgoode.service;

import com.mgoode.model.Employee;
import com.mgoode.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


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

    public Iterable<Employee> findEmployeeByName( String name ) {
        return employeeRepository.findEmployeeByName(name);
    }

    public Long employeeCount(){
        return employeeRepository.count();
    }

}
