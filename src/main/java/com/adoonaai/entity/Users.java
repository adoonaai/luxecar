package com.adoonaai.entity;

import javax.persistence.Entity;

@Entity
public class Users {

    private String email;
    private String password;
    private Passport passport;
    private  DriverLicense driverLicense;

}
