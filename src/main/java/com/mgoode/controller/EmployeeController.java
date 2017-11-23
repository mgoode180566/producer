package com.mgoode.controller;

import com.mgoode.model.Employee;
import com.mgoode.service.IEmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    // return all employees
    @ApiOperation(value="Get all employees", response = Iterable.class, tags="Employee")
    @RequestMapping(value = "/list")
    public Iterable<Employee> list() {
        return employeeService.list();
    }

    public List<Employee> fallback() {
        return new ArrayList<>();
    }

    // find an employee by their id
    @ApiOperation(value="Find an employee by id", response = Employee.class, tags="Employee")
    @RequestMapping(value = "/getemployee/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeService.findEmployeeByID(id);
    }

    // delete an employee by id
    @ApiOperation(value="Delete an employee by id", response = Integer.class, tags="Employee")
    @RequestMapping(value = "/deleteemployee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
