package com.carproject.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "carId"
})
@XmlRootElement(name = "getCarByIdRequest", namespace = "http://www.szt3.project.pl")
public class GetCarByIdRequest {

    protected long carId;

    /**
     * Gets the value of the carId property.
     */
    public long getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     */
    public void setCarId(long value) {
        this.carId = value;
    }

}
