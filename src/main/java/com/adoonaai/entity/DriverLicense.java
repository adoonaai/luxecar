package com.adoonaai.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class DriverLicense {

    @Id
    private UUID id;
    private String firstname;
    private String lastname;
    private String patronymic;
    private LocalDate dateOfBirth;
    private LocalDate dateOfReceipt;
    private LocalDate dateOfExpiration;
    private String divisionCode;
    private String city;

}
