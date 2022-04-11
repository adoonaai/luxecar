package com.adoonaai.entity;

import javax.persistence.Entity;

@Entity
public class Review {

    private Car car;
    private Users users;
    private String text;
    private Double grade;
}
