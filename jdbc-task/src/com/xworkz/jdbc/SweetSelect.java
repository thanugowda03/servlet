package com.xworkz.jdbc;

import java.sql.*;

public class SweetSelect {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.Secret.getProp())) {

            Statement statement = connection.createStatement();

            //Select all rows
            String selectall = "Select * from sweet";
            ResultSet resultSet1 = statement.executeQuery(selectall);
            System.out.println("Resultset:" + resultSet1);

            while (resultSet1.next()) {
                int s_id = resultSet1.getInt("s_id");
                String s_name = resultSet1.getString("s_name");
                String s_type = resultSet1.getString("s_type");
                String ingredients = resultSet1.getString("ingredients");
                Double price = resultSet1.getDouble("price");
                Double quantity = resultSet1.getDouble("quantity");
                String shop_name = resultSet1.getString("shop_name");

                System.out.println("Sweet id:" + s_id);
                System.out.println("Sweet name is:" + s_name);
                System.out.println("Sweet type:" + s_type);
                System.out.println("Sweet ingredients:" + ingredients);
                System.out.println("Sweet price:" + price);
                System.out.println("Sweet quantity:" + quantity);
                System.out.println("Sweet shop name:" + shop_name);
                System.out.println("--------------------------------------------");
            }


            //Select one row
            String row1 = "Select * from sweet where s_id = 6";
            ResultSet resultSet2 = statement.executeQuery(row1);

            while (resultSet2.next()) {
                int s_id = resultSet2.getInt("s_id");
                String s_name = resultSet2.getString("s_name");
                String s_type = resultSet2.getString("s_type");
                String ingredients = resultSet2.getString("ingredients");
                Double price = resultSet2.getDouble("price");
                Double quantity = resultSet2.getDouble("quantity");
                String shop_name = resultSet2.getString("shop_name");

                System.out.println("Sweet id:" + s_id);
                System.out.println("Sweet name is:" + s_name);
                System.out.println("Sweet type:" + s_type);
                System.out.println("Ingredients:" + ingredients);
                System.out.println("Price:" + price);
                System.out.println("Quantity:" + quantity);
                System.out.println("Shop Name:" + shop_name);
                System.out.println("------------------------------------------");
            }


            //Select one column one row
            String row1column1 = "Select s_name from sweet where s_id=10";
            ResultSet resultSet3 = statement.executeQuery(row1column1);

            while (resultSet3.next()) {
                String s_name = resultSet3.getString("s_name");
                System.out.println("Sweet name :" + s_name);
            }
            System.out.println("--------------------------------------------");


            //Select two rows
            String selectrow2 = "Select * from sweet where s_id IN (3,1)";
            ResultSet resultSet4 = statement.executeQuery(selectrow2);

            while (resultSet4.next()) {
                int s_id = resultSet4.getInt("s_id");
                String s_name = resultSet4.getString("s_name");
                System.out.println("Sweet id is: " + s_id + " Sweet name is: " + s_name);
            }
            System.out.println("--------------------------------------------");


            //Select three rows
            String selectrow3 = "Select * from sweet where s_id IN (6,10,12)";
            ResultSet resultSet5 = statement.executeQuery(selectrow3);

            while (resultSet5.next()) {
                int s_id = resultSet5.getInt("s_id");
                String s_name = resultSet5.getString("s_name");
                String s_type = resultSet5.getString("s_type");
                System.out.println("Sweet id: " + s_id + " Name: " + s_name + " Type: " + s_type);
            }
            System.out.println("--------------------------------------------");


            //Select one column all rows
            String columnallrows = "Select s_name from sweet";
            ResultSet resultSet6 = statement.executeQuery(columnallrows);

            while (resultSet6.next()) {
                String s_name = resultSet6.getString("s_name");
                System.out.println("Sweet Name: " + s_name);
            }
            System.out.println("--------------------------------------------");


            //Select distinct
            String distinct = "Select distinct s_type from sweet";
            ResultSet rs7 = statement.executeQuery(distinct);

            while (rs7.next()) {
                String s_type = rs7.getString("s_type");
                System.out.println("Sweet Type: " + s_type);
            }
            System.out.println("--------------------------------------------");


            //Select Count(*)
            String count = "Select COUNT(*) from sweet";
            ResultSet rs8 = statement.executeQuery(count);

            while (rs8.next()) {
                int total = rs8.getInt(1);
                System.out.println("Total Rows: " + total);
            }
            System.out.println("--------------------------------------------");


            //Latest row
            String latestRow = "Select * from sweet ORDER BY s_id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(latestRow);

            while (rs9.next()) {
                System.out.println("Latest Sweet ID:" + rs9.getInt("s_id"));
            }
            System.out.println("--------------------------------------------");


            //Max 2 rows
            String max2 = "Select * from sweet ORDER BY s_id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(max2);

            while (rs10.next()) {
                System.out.println("Sweet ID:" + rs10.getInt("s_id"));
            }
            System.out.println("--------------------------------------------");


            //Min 5 rows
            String min5 = "Select * from sweet ORDER BY s_id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(min5);

            while (rs11.next()) {
                System.out.println("Sweet ID:" + rs11.getInt("s_id"));
            }
            System.out.println("--------------------------------------------");


            //Oldest row
            String oldest = "Select * from sweet ORDER BY s_id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);

            while (rs12.next()) {
                System.out.println("Oldest Sweet ID:" + rs12.getInt("s_id"));
            }
            System.out.println("--------------------------------------------");


            //All rows order by desc
            String descRow = "Select * from sweet ORDER BY s_id DESC";
            ResultSet rs13 = statement.executeQuery(descRow);

            while (rs13.next()) {
                System.out.println("Sweet ID:" + rs13.getInt("s_id"));
            }
            System.out.println("--------------------------------------------");


            //Group by
            String sql = "Select s_type, COUNT(*) AS total_sweets from sweet GROUP BY s_type";
            ResultSet rs14 = statement.executeQuery(sql);

            while (rs14.next()) {
                System.out.println(rs14.getString("s_type") + " Total: " + rs14.getInt("total_sweets"));
            }
            System.out.println("--------------------------------------------");


            //Group by and having
            String sql1 = "Select s_type, COUNT(*) AS total_sweets from sweet GROUP BY s_type HAVING COUNT(*) > 0";
            ResultSet rs15 = statement.executeQuery(sql1);

            while (rs15.next()) {
                System.out.println(rs15.getString("s_type") + " Total: " + rs15.getInt("total_sweets"));
            }
            System.out.println("--------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
