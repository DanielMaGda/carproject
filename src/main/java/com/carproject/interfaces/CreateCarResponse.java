package com.carproject.interfaces;

import com.carproject.data.CarModel;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "carModel"
})
@XmlRootElement(name = "createCarResponse", namespace = "http://www.szt3.project.pl")
public class CreateCarResponse {

    public CarModel getCar() {
        return carModel;
    }

    public void setCar(CarModel carModel) {
        this.carModel = carModel;
    }

    @XmlElement(required = true)
    protected CarModel carModel;


}
