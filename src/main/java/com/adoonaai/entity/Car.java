package com.adoonaai.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Car {

    private String firm;
    private String model;
    private String VIN;
    private LocalDate yearOfIssue;
    private String driveUnit;
    private Double power;
    private Double engineCapacity;
    private String transmission;
    private String category;
    private BigDecimal pricePerDay;

}
