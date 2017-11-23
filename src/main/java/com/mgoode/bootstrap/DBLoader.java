package com.mgoode.bootstrap;

import com.mgoode.model.Employee;
import com.mgoode.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.util.ArrayList;

/**
 * Created by michaelgoode on 23/11/2017.
 */
@Component
public class DBLoader implements ApplicationRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        for ( int i = 0; i < 50; i++ ) {
            Employee employee = new Employee();
            employee.setName("Fred");
            employee.setEmail("fred@sml.com");
            employee.setLocation("UK");
            employee.setDept("IT");
            employeeRepository.save(employee);
        }
    }

}
