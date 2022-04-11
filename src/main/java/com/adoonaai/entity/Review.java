package com.adoonaai.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Review {

    @Id
    private UUID id;
    private Car car;
    private Users users;
    private String text;
    private Double grade;
}
