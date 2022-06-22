package com.carproject.interfaces;

import com.carproject.data.CarModel;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "carModel"
})
@XmlRootElement(name = "getCarByIdResponse", namespace = "http://www.szt3.project.pl")
public class GetCarByIdResponse {

    @XmlElement(required = true)
    protected CarModel carModel;


    /**
     * Gets the value of the car property.
     *
     * @return possible object is
     * {@link CarModel }
     */
    public CarModel getCar() {
        return carModel;
    }

    /**
     * Sets the value of the car property.
     *
     * @param value allowed object is
     *              {@link CarModel }
     */
    public void setCar(CarModel value) {
        this.carModel = value;
    }

}
