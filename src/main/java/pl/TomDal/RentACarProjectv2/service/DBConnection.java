package pl.TomDal.RentACarProjectv2.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    Connection connection = null;

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/baza_samochodow", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e + " User or password issue");
        }
        return connection;
    }
}
