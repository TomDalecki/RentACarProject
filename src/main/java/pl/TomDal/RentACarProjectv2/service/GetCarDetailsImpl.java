package pl.TomDal.RentACarProjectv2.service;

import pl.TomDal.RentACarProjectv2.model.Car;

import java.util.Scanner;

public class GetCarDetailsImpl implements GetCarDetails {
    @Override
    public void getCarDetails(Scanner scanner) {
        System.out.println("Input car company name");
        String company = scanner.next();

        System.out.println("Input car model");
        String model = scanner.next();

        System.out.println("Input type of the car");
        String type = scanner.next();

        System.out.println("Input car ID number");
        String idNumber = scanner.next();

        System.out.println("Input car VIN number");
        String vinNumber = scanner.next();

        System.out.println("Input car production year");
        int yearOfProduction = scanner.nextInt();

        Car car = new Car(company, model, type, idNumber, vinNumber, yearOfProduction);
        AddCarToDBImpl addCarToDB = new AddCarToDBImpl();
        addCarToDB.addCarToDB(car);
    }
}
