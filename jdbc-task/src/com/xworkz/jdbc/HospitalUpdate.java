package com.xworkz.jdbc;

import java.sql.*;

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


            String query5="update hospital set hospital_name=? where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(query5);
            preparedStatement.setString(1,"Modi Hospital");
            preparedStatement.setInt(2,4);
            int row=preparedStatement.executeUpdate();
            System.out.println("Rows updated :"+row);

            String query6="update hospital set City=? where id=?";
            PreparedStatement preparedStatement1=connection.prepareStatement(query6);
            preparedStatement1.setString(1,"Delhi");
            preparedStatement1.setInt(2,4);
            int row1=preparedStatement1.executeUpdate();
            System.out.println("Rows updated :"+row1);


            String query7="update hospital set Rating=? where id=?";
            PreparedStatement preparedStatement2=connection.prepareStatement(query7);
            preparedStatement2.setDouble(1,4.5);
            preparedStatement2.setInt(2,5);
            int row2=preparedStatement2.executeUpdate();
            System.out.println("Rows updated :"+row2);


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
