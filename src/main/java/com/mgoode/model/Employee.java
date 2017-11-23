package com.mgoode.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by michaelgoode on 27/10/2017.
 */
@Entity
@Table(name="tbl_employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    Long id;

    @ApiModelProperty(notes = "Name of the Employee",name="name",required=true,value="test name")
    @Column(name="name")
    String name;

    @ApiModelProperty(notes = "Email of the Employee",name="email",required=true,value="test email")
    @Column(name = "email")
    String email;

    @ApiModelProperty(notes = "Department of the Employee",name="dept",required=true,value="test dept")
    @Column(name="dept")
    String dept;

    @Column(name="location")
    @ApiModelProperty(notes = "Location of the Employee",name="location",required=true,value="test location")
    String location;

    public Employee() {}

    public Employee(Long id, String name, String email, String dept, String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
