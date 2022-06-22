package com.carproject.application;

import com.carproject.data.CarEntity;
import com.carproject.data.CarModel;
import com.carproject.interfaces.*;
import com.carproject.data.CarService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
@EnableAutoConfiguration
@Endpoint
public class CarEndpoint extends CarProjectApplication {
    private static final String NameSpace_URI = "http://www.szt3.project.pl";
    @Autowired
    private CarService carService;

    public CarEndpoint(CarService carService) {
        this.carService = carService;
    }


    @PayloadRoot(namespace = NameSpace_URI, localPart = "getCarByIdRequest")
    @ResponsePayload
    public GetCarByIdResponse getCarById(@RequestPayload GetCarByIdRequest request) {


        GetCarByIdResponse response = new GetCarByIdResponse();
        CarModel carModel = new CarModel();
        BeanUtils.copyProperties(carService.GetCarById(request.getCarId()), carModel);
        response.setCar(carModel);
        return response;


    }


    @PayloadRoot(namespace = NameSpace_URI, localPart = "createCarRequest")
    @ResponsePayload
    public CreateCarResponse createCarResponse(@RequestPayload CreateCarRequest request) {

        CreateCarResponse response = new CreateCarResponse();
        CarEntity carEntity = new CarEntity();
        BeanUtils.copyProperties(request.getCarModel(), carEntity);
        carService.AddCar(carEntity);
        response.setCar(request.getCarModel());
        return response;


    }

    @PayloadRoot(namespace = NameSpace_URI, localPart = "updateCarRequest")
    @ResponsePayload
    public UpdateCarResponse updateCarResponse(@RequestPayload UpdateCarRequest request) {

        UpdateCarResponse response = new UpdateCarResponse();
        CarEntity carEntity = new CarEntity();

        BeanUtils.copyProperties(request.getCar(), carEntity);
        carService.UpdateCar(carEntity);
        return response;


    }

    @PayloadRoot(namespace = NameSpace_URI, localPart = "deleteCarRequest")
    @ResponsePayload
    public DeleteCarResponse deleteCarResponse(@RequestPayload DeleteCarRequest request) {

        carService.DeleteCar(request.getCarId());
        DeleteCarResponse response = new DeleteCarResponse();
        return response;

    }


}
