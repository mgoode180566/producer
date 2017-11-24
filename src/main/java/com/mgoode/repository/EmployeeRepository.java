package com.mgoode.repository;

import com.mgoode.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by michaelgoode on 23/11/2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

    Iterable<Employee> findEmployeeByName(@Param("name") String name);

}
