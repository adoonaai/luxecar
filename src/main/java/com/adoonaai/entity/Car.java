package com.adoonaai.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Car {

    @Id
    private String VIN;
    private String firm;
    private String model;
    private LocalDate yearOfIssue;
    private String driveUnit;
    private Double power;
    private Double engineCapacity;
    private String transmission;
    private String rank;
    private BigDecimal pricePerDay;

}
