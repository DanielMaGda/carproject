//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.15 at 02:02:29 PM CEST 
//


package com.carproject.client.generated;

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

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @XmlElement(required = true)
    protected long seat;
    @XmlElement(required = true)
    protected long door;

}
