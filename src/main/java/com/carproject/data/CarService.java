package com.carproject.data;

import org.springframework.stereotype.Service;

@Service
public class CarService {


    final
    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public void AddCar(CarEntity carEntity) {
        carRepository.save(carEntity);
    }


    public CarEntity GetCarById(long carId) {
        return carRepository.findByCarId(carId);

    }


    public void UpdateCar(CarEntity carEntity) {
        carRepository.findByCarId(carEntity.getCarId());
        carRepository.save(carEntity);
    }


    public void DeleteCar(long carId) {
        carRepository.deleteById(carId);
    }
}
