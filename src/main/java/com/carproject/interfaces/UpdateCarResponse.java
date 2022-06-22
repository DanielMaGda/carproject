package com.carproject.interfaces;

import com.carproject.data.CarModel;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "carModel"
})
@XmlRootElement(name =  "updateCarResponse")
public class UpdateCarResponse {
    @XmlElement(required = true)
    protected CarModel carModel;

    public CarModel getCar() {
        return carModel;
    }

    public void setCar(CarModel carModel) {
        this.carModel = carModel;
    }
}
