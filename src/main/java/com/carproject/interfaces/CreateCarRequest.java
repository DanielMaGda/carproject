package com.carproject.interfaces;

import com.carproject.data.CarModel;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "carModel"
})
@XmlRootElement(name = "createCarRequest", namespace = "http://www.szt3.project.pl")
public class CreateCarRequest {
    @XmlElement(required = true)
    protected CarModel carModel;

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }


}
