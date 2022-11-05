package pl.TomDal.RentACarProjectv2.service;

import java.sql.SQLException;
import java.sql.Statement;

import pl.TomDal.RentACarProjectv2.model.Car;

public class AddCarToDBImpl implements AddCarToDB {
    @Override
    public void addCarToDB(Car car) {
        DBConnection dbConnection = new DBConnection();
        dbConnection.getConnection();

        try {
            String carData = "INSERT INTO samochody_dane VALUES(0," +
                    "'" + car.getCompany() + "'" + "," +
                    "'" + car.getModel() + "'" + "," +
                    "'" + car.getType() + "'" + "," +
                    "'" + car.getIdNumber() + "'" + "," +
                    "'" + car.getVinNumber() + "'" + "," +
                    car.getYearOfProduction() + ")";

            Statement insertData = dbConnection.connection.createStatement();
            insertData.executeUpdate(carData);
            System.out.println(car);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}