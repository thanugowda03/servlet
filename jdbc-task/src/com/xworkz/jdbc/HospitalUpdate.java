package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalUpdate {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "tanu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);

            String query1="update hospital set hospital_name='city hospital' where id=2";
            String query2="update hospital set rating=5.0 where id=4";
            String query3="update hospital set hospital_name='Chiranthana clinic' where id=3";
            String query4="update hospital set rating=4.0 where id=1";


            Statement statement = connection.createStatement();
            int rowAffected1 = statement.executeUpdate(query1);
            System.out.println("rowsAffected :"+rowAffected1);
            int rowAffected2 = statement.executeUpdate(query2);
            System.out.println("rowsAffected :"+rowAffected2);
            int rowAffected3 = statement.executeUpdate(query3);
            System.out.println("rowsAffected :"+rowAffected3);
            int rowAffected4= statement.executeUpdate(query4);
            System.out.println("rowsAffected :"+rowAffected4);


        }
        catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}
