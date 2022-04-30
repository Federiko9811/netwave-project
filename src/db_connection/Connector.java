package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

    public static Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
                    "jdbc:postgresql://netwave.cmz3s5fvdd1s.us-east-1.rds.amazonaws.com:5432/postgres",
                    "postgres",
                    "netwave2022"
            );
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

        return null;
    }
}
