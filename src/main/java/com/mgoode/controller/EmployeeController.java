package com.mgoode.controller;


import com.mgoode.model.Employee;
import com.mgoode.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by michaelgoode on 27/10/2017.
 */
@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping(value = "/first")
    public Employee firstPage() {
        return employeeService.getFirstEmployee();
    }

    @RequestMapping(value = "/list")
    public List<Employee> list() {
        return employeeService.list();
    }
}
