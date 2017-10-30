package com.mgoode.model;

import org.springframework.context.annotation.Bean;

/**
 * Created by michaelgoode on 27/10/2017.
 */

public class Employee {

    String name;

    String email;

    String telephone;

    String location;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
