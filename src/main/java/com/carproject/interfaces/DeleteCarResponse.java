package com.carproject.interfaces;

import com.carproject.data.CarModel;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "carModel"
})
@XmlRootElement(name = "deleteCarResponse", namespace = "http://www.szt3.project.pl")
public class DeleteCarResponse {

    @XmlElement(required = true)
    public CarModel carModel;

    public CarModel getCar() {
        return carModel;
    }

    public void setCar(CarModel carModel) {
        this.carModel = carModel;
    }
}
