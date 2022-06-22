package com.carproject.client.application;

import java.util.Scanner;

import static java.lang.System.exit;

public class CarClientUi {

    public void ClientUiSwitch() {
        String[] options = {"1- GetCar 1",
                "2- AddCar 2",
                "3- UpdateCar 3",
                "4- DeleteCar 4 ",
                "5- Exit 5 "
        };
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        ClientApplication.GetCar();
                        break;
                    case 2:
                        ClientApplication.CreateCar();

                        break;
                    case 3:
                        ClientApplication.UpdateCar();
                        break;
                    case 4:
                        ClientApplication.DeleteCar();
                        break;
                    case 5:
                        exit(0);
                        break;

                }
            } catch (Exception ex) {
                System.out.println("Please enter an integer value between 1 and " + options.length + ex.getMessage());
                scanner.next();
            }
        }
    }


    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
}
