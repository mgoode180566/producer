package com.mgoode.service;

import com.mgoode.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by michaelgoode on 27/10/2017.
 */

public interface IEmployeeService {
    public Employee getFirstEmployee();

    public List<Employee> list();
}
