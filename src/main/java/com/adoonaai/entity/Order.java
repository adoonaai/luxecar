package com.adoonaai.entity;

import com.adoonaai.enums.State;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Order {

    private Car car;
    private Users users;
    private LocalDate startOrder;
    private LocalDate endOrder;
    private State state;
}
