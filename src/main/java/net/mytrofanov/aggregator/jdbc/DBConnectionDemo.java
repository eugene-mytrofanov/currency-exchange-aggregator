package net.mytrofanov.aggregator.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionDemo {
    public static void main(String[] args) {
        try {
            // Get a connection to the database
//          Connection conn = DBConnection.getDBConnection();
            // Get a connection to the database
            Connection conn = HikariCPDataSource.getConnection();
            // Create a statement
            Statement myStatement = conn.createStatement();
            // Execute SQL query
            ResultSet myResult = myStatement.executeQuery("SELECT * FROM banks ORDER BY BankID");
            // Process the result set
            while (myResult.next()){
                System.out.println(myResult.getInt("BankId") + " | " + myResult.getString("BankName"));
            }
            myStatement.close();
            System.out.println("Bingo!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
