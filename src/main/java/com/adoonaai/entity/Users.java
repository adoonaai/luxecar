package com.adoonaai.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Users {

    @Id
    private UUID id;
    private String email;
    private String password;
    private Passport passport;
    private DriverLicense driverLicense;

}
