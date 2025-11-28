package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "tanu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);

            String sql="update sweet set shop_name='JC' where s_id=6";
            String sql2="update sweet set s_name='Halwa' where s_id=10";
            String sql3="update sweet set shop_name='Popular' where s_id=15";
            String sql4="update sweet set shop_name='JC' where s_id=3";

            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(sql);
            System.out.println("rowAffected:"+rowAffected);
            int rowAffected2 = statement.executeUpdate(sql2);
            System.out.println("rowAffected:"+rowAffected2);
            int rowAffected3 = statement.executeUpdate(sql3);
            System.out.println("rowAffected:"+rowAffected3);
            int rowAffected4 = statement.executeUpdate(sql4);
            System.out.println("rowAffected:"+rowAffected4);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}

