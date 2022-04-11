package com.adoonaai.entity;

import com.adoonaai.enums.Sex;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Passport {

    @Id
    private UUID id;
    private String firstname;
    private String lastname;
    private String patronymic;
    private Sex sex;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private String passportIssued;
    private LocalDate dateOfIssue;
    private String divisionCode;
    private Integer seriesAndNumber;
}
