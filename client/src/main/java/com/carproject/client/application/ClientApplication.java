package com.carproject.client.application;

import com.carproject.client.generated.CarModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
        CarClientUi carClientUi = new CarClientUi();
        carClientUi.ClientUiSwitch();


    }

    public static void GetCar() {
        CarClientConfig carClientConfig = new CarClientConfig();
        CarModel carModel = new CarModel();
        carClientConfig.marshaller();
        System.out.println("Enter Car Id ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        long carId = Long.parseLong(line);
        carModel = carClientConfig.carClient(carClientConfig.marshaller()).getCarByIdResponse(carId).getCarInfo();
        System.out.println(carModel.getName() + " " + carModel.getModel() + " with  " + carModel.getDoor() + " doors and " + carModel.getSeat()+" seats");


    }

    public static void DeleteCar() {
        CarClientConfig carClientConfig = new CarClientConfig();
        carClientConfig.marshaller();
        System.out.println("Enter Car Id ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        long carId = Long.parseLong(line);
        System.out.println(carClientConfig.carClient(carClientConfig.marshaller()).deleteCarResponse(carId));
    }

    public static void UpdateCar() {
        CarClientConfig carClientConfig = new CarClientConfig();
        carClientConfig.marshaller();
        System.out.println("Enter Car Id ");
        Scanner scanner = new Scanner(System.in);
        CarModel carModel = new CarModel();
        long carId = Long.parseLong(scanner.nextLine());
        System.out.println("Enter Car make ");
        String name = scanner.nextLine();
        System.out.println("Enter Car model ");
        String model = scanner.nextLine();
        carModel.setCarId(carId);
        carModel.setName(name);
        carModel.setModel(model);
        carClientConfig.carClient(carClientConfig.marshaller()).updateCarResponse(carModel);
    }

    public static void CreateCar() {
        CarClientConfig carClientConfig = new CarClientConfig();
        carClientConfig.marshaller();
        Scanner scanner = new Scanner(System.in);
        CarModel carModel = new CarModel();
        System.out.println("Enter Car name ");
        String name = scanner.nextLine();
        System.out.println("Enter Car model ");
        String model = scanner.nextLine();
        System.out.println("Enter Car number of seats ");
        long seat = Long.parseLong(scanner.nextLine());
        System.out.println("Enter Car number of doors ");
        long door = Long.parseLong(scanner.nextLine());
        carModel.setName(name);
        carModel.setModel(model);
        carModel.setDoor(door);
        carModel.setSeat(seat);
        carClientConfig.carClient(carClientConfig.marshaller()).createCarResponse(carModel);
    }

}

