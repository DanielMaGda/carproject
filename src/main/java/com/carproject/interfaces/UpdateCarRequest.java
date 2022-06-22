package com.carproject.interfaces;

import com.carproject.data.CarModel;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name =  "", propOrder = {
        "carModel"
})
@XmlRootElement(name = "updateCarRequest",namespace = "http://www.szt3.project.pl")
public class UpdateCarRequest {
    @XmlElement(required = true)
    protected CarModel carModel;
    public CarModel getCar(){
        return carModel;
    }
    public void setCar(CarModel value){this.carModel = value;}
}
