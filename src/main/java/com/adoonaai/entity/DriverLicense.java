package com.adoonaai.entity;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class DriverLicense {

    private String firstname;
    private String lastname;
    private String patronymic;
    private LocalDate dateOfBirth;
    private LocalDate dateOfReceipt;
    private LocalDate dateOfExpiration;
    private String divisionCode;
    private String city;

}
