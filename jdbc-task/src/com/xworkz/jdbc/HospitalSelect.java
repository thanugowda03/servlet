package com.xworkz.jdbc;

import java.sql.*;

public class HospitalSelect {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(
                DBConstant.URL.getProp(),
                DBConstant.USERNAME.getProp(),
                DBConstant.Secret.getProp())) {

            Statement statement = connection.createStatement();

            // Select all rows
            String selectAll = "SELECT * FROM hospital";
            ResultSet rs1 = statement.executeQuery(selectAll);

            while (rs1.next()) {
                int id = rs1.getInt("id");
                String name = rs1.getString("hospital_name");
                String city = rs1.getString("city");
                String state = rs1.getString("state");
                String country = rs1.getString("country");
                String pincode = rs1.getString("pincode");
                String type = rs1.getString("hospital_type");
                int bedCapacity = rs1.getInt("bed_capacity");
                String emergency = rs1.getString("emergency_services");
                double rating = rs1.getDouble("rating");

                System.out.println("ID: " + id);
                System.out.println("Hospital Name: " + name);
                System.out.println("City: " + city);
                System.out.println("State: " + state);
                System.out.println("Country: " + country);
                System.out.println("Pincode: " + pincode);
                System.out.println("Hospital Type: " + type);
                System.out.println("Bed Capacity: " + bedCapacity);
                System.out.println("Emergency Services: " + emergency);
                System.out.println("Rating: " + rating);
                System.out.println("--------------------------------------------------");
            }


            // Select one row
            String oneRow = "SELECT * FROM hospital WHERE id = 3";
            ResultSet rs2 = statement.executeQuery(oneRow);

            while (rs2.next()) {
                System.out.println("ID: " + rs2.getInt("id"));
                System.out.println("Hospital Name: " + rs2.getString("hospital_name"));
                System.out.println("City: " + rs2.getString("city"));
                System.out.println("State: " + rs2.getString("state"));
                System.out.println("--------------------------------------------------");
            }


            // Select one column one row
            String oneColumn = "SELECT hospital_name FROM hospital WHERE id = 5";
            ResultSet rs3 = statement.executeQuery(oneColumn);

            while (rs3.next()) {
                System.out.println("Hospital Name: " + rs3.getString("hospital_name"));
            }
            System.out.println("--------------------------------------------------");



            // Select two rows
            String twoRows = "SELECT * FROM hospital WHERE id IN (1,4)";
            ResultSet rs4 = statement.executeQuery(twoRows);

            while (rs4.next()) {
                System.out.println("ID: " + rs4.getInt("id") +
                        " Hospital Name: " + rs4.getString("hospital_name"));
            }
            System.out.println("--------------------------------------------------");



            // Select three rows
            String threeRows = "SELECT * FROM hospital WHERE id IN (2,6,8)";
            ResultSet rs5 = statement.executeQuery(threeRows);

            while (rs5.next()) {
                System.out.println("ID: " + rs5.getInt("id") +
                        " Name: " + rs5.getString("hospital_name") +
                        " City: " + rs5.getString("city"));
            }
            System.out.println("--------------------------------------------------");



            // Select one column all rows
            String colAll = "SELECT hospital_name FROM hospital";
            ResultSet rs6 = statement.executeQuery(colAll);

            while (rs6.next()) {
                System.out.println("Hospital Name: " + rs6.getString("hospital_name"));
            }
            System.out.println("--------------------------------------------------");



            // Select distinct
            String distinct = "SELECT DISTINCT city FROM hospital";
            ResultSet rs7 = statement.executeQuery(distinct);

            while (rs7.next()) {
                System.out.println("City: " + rs7.getString("city"));
            }
            System.out.println("--------------------------------------------------");



            // Select count(*)
            String count = "SELECT COUNT(*) FROM hospital";
            ResultSet rs8 = statement.executeQuery(count);

            while (rs8.next()) {
                System.out.println("Total Rows: " + rs8.getInt(1));
            }
            System.out.println("--------------------------------------------------");



            // Latest row
            String latest = "SELECT * FROM hospital ORDER BY id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(latest);

            while (rs9.next()) {
                System.out.println("Latest Hospital ID: " + rs9.getInt("id"));
            }
            System.out.println("--------------------------------------------------");



            // Max 2 rows
            String max2 = "SELECT * FROM hospital ORDER BY id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(max2);

            while (rs10.next()) {
                System.out.println("Hospital ID: " + rs10.getInt("id"));
            }
            System.out.println("--------------------------------------------------");



            // Min 5 rows
            String min5 = "SELECT * FROM hospital ORDER BY id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(min5);

            while (rs11.next()) {
                System.out.println("Hospital ID: " + rs11.getInt("id"));
            }
            System.out.println("--------------------------------------------------");



            // Oldest row
            String oldest = "SELECT * FROM hospital ORDER BY id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);

            while (rs12.next()) {
                System.out.println("Oldest Hospital ID: " + rs12.getInt("id"));
            }
            System.out.println("--------------------------------------------------");



            // Order by desc
            String desc = "SELECT * FROM hospital ORDER BY id DESC";
            ResultSet rs13 = statement.executeQuery(desc);

            while (rs13.next()) {
                System.out.println("Hospital ID: " + rs13.getInt("id"));
            }
            System.out.println("--------------------------------------------------");


            // Group by
            String groupBy = "SELECT city, COUNT(*) AS total FROM hospital GROUP BY city";
            ResultSet rs14 = statement.executeQuery(groupBy);

            while (rs14.next()) {
                System.out.println(rs14.getString("city") + " Total: " + rs14.getInt("total"));
            }
            System.out.println("--------------------------------------------------");



            // Group by and having
            String having = "SELECT city, COUNT(*) AS total FROM hospital GROUP BY city HAVING COUNT(*) > 0";
            ResultSet rs15 = statement.executeQuery(having);

            while (rs15.next()) {
                System.out.println(rs15.getString("city") + " Total: " + rs15.getInt("total"));
            }
            System.out.println("--------------------------------------------------");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

