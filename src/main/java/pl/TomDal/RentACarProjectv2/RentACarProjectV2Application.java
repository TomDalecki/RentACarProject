package pl.TomDal.RentACarProjectv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.TomDal.RentACarProjectv2.service.DBConnection;
import pl.TomDal.RentACarProjectv2.service.GetCarDetailsImpl;

import java.util.Scanner;

@SpringBootApplication
public class RentACarProjectV2Application {

    public static void main(String[] args) {
        SpringApplication.run(RentACarProjectV2Application.class, args);

        System.out.println("User choices:");
        System.out.println("1 - Add car to DB");
        System.out.println("2 - Find car in DB");
        System.out.println("8 - Stop app");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();


            switch (userChoice) {
                case 1 -> {
                    System.out.println("Input car details:");
                    GetCarDetailsImpl getCarDetailsImpl = new GetCarDetailsImpl();
                    getCarDetailsImpl.getCarDetails(scanner);
                }
                case 2 -> {
                    System.out.println("Find car in DB");

                }
                case 8 -> {
                    System.out.println("Application shutdown");
                    System.exit(0);
                }
            }
            System.out.println("User choices:");
            System.out.println("1 - Add car to DB");
            System.out.println("2 - Find car in DB");
            System.out.println("8 - Stop app");

        }
    }

}
