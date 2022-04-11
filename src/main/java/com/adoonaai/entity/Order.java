package com.adoonaai.entity;

import com.adoonaai.enums.State;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Order {

    @Id
    private UUID id;
    private Car car;
    private Users users;
    private LocalDate startOrder;
    private LocalDate endOrder;
    private State state;
}
