package com.carproject.data;

import javax.persistence.*;

@Table(name = "Car")
@Entity
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;
    private String name;
    private String model;
    private long seat;
    private long door;


    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String make) {
        this.name = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getSeat() {
        return seat;
    }

    public void setSeat(long seat) {
        this.seat = seat;
    }

    public long getDoor() {
        return door;
    }

    public void setDoor(long door) {
        this.door = door;
    }
}

