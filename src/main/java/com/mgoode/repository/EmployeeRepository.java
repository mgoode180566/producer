package com.mgoode.repository;

import com.mgoode.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by michaelgoode on 23/11/2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{}
