package com.carproject.client.application;

import com.carproject.client.generated.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class CarClient extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(CarClient.class);

    public GetCarByIdResponse getCarByIdResponse(long carId) {
        GetCarByIdRequest request = new GetCarByIdRequest();
        request.setCarId(carId);
        logger.info("Car with id  " + carId + " is ");

        return (GetCarByIdResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
    public DeleteCarResponse deleteCarResponse(long carId) {
        DeleteCarRequest request = new DeleteCarRequest();
        request.setCarId(carId);
        logger.info("Car Data with id  " + carId + "  was deleted");

        return (DeleteCarResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
    public UpdateCarResponse updateCarResponse(CarModel carModel){
        UpdateCarRequest request = new UpdateCarRequest();
        request.setCarInfo(carModel);
        logger.info("Car Data with " + " "+ carModel.getName() + " "+ carModel.getModel() + "was updated to base ");
        return (UpdateCarResponse)  getWebServiceTemplate().marshalSendAndReceive(request);
    }
    public CreateCarResponse createCarResponse(CarModel carModel){
        CreateCarRequest request = new CreateCarRequest();
        request.setCarInfo(carModel);
        logger.info("Car Data with " + " "+ carModel.getName() + " "+ carModel.getModel() + "was added to base ");
        return (CreateCarResponse)  getWebServiceTemplate().marshalSendAndReceive(request);

    }
}
