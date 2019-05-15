package net.mytrofanov.aggregator.jdbc;

import org.mariadb.jdbc.MariaDbPoolDataSource;

import java.sql.Connection;

public class DBConnection {
    private static Connection connection = null;
    private static final String URL = "jdbc:mariadb://localhost:3306/bank_exchange_rates?user=root&password=147D0kmY0cnM741&maxPoolSize=10";

    private DBConnection() {

    }

    public static Connection getDBConnection() {
        try {
            if (connection == null) {
                // Get a connection to the database
                connection = new MariaDbPoolDataSource(URL).getConnection();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
