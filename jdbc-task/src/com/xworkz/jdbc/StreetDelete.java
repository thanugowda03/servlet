package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StreetDelete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "tanu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);

            String query1="delete from sports where sport_id=1";
            String query2="delete from sports where maintenance_status='Poor'";

            Statement statement = connection.createStatement();
            int rowDeleted = statement.executeUpdate(query1);
            System.out.println("rowDeleted :"+rowDeleted);
            int rowDeleted1 = statement.executeUpdate(query2);
            System.out.println("rowDeleted :"+rowDeleted1);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}
