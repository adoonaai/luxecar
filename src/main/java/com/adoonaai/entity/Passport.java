package com.adoonaai.entity;

import com.adoonaai.enums.Sex;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Passport {

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
