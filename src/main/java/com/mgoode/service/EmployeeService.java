package com.mgoode.service;

import com.mgoode.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelgoode on 27/10/2017.
 */
@Component
public class EmployeeService implements IEmployeeService {

    public Employee getFirstEmployee() {
        Employee emp = new Employee();
        emp.setName("Michael Goode");
        emp.setEmail("michaelgoode@sml.com");
        emp.setTelephone("07710597613");
        emp.setLocation("UK");
        return emp;
    }

    public List<Employee> list() {

        ArrayList<Employee> emps = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("Patrick Egan");
        emp1.setEmail("patrick@sml.com");
        emp1.setTelephone("07710678910");
        emp1.setLocation("UK");
        emps.add(emp1);

        Employee emp = new Employee();
        emp.setName("Michael Goode");
        emp.setEmail("michaelgoode@sml.com");
        emp.setTelephone("07710597613");
        emp.setLocation("UK");
        emps.add(emp);

        return emps;

    }

}
