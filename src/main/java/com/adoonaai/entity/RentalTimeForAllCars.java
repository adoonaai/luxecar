package com.adoonaai.entity;

import java.time.LocalDate;

public class RentalTimeForAllCars {

    //насколько я понимаю тут вполне будет достаточно связи с Order, тк там мы сможем достать и
    //время начала и окончания аренды

    private Order order;
    private LocalDate startOrder;
    private LocalDate endOrder;
}
