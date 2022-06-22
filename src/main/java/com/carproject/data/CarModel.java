package com.carproject.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carModel", namespace = "http://www.szt3.project.pl", propOrder = {
        "carId",
        "name",
        "model",
        "seat",
        "door"
})
public class CarModel {
    @XmlElement(required = true)
    protected long carId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected long seat;
    @XmlElement(required = true)
    protected long door;


    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
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

    public String getName() {
        return name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String value) {
        this.model = value;
    }

}
