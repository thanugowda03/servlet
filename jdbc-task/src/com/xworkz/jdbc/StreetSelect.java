package com.xworkz.jdbc;

import java.sql.*;

public class StreetSelect {

        public static void main(String[] args) {

            try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.Secret.getProp())) {

                Statement statement = connection.createStatement();

                // Select all rows
                String selectAll = "Select * from street";
                ResultSet rs1 = statement.executeQuery(selectAll);

                while (rs1.next()) {
                    int id = rs1.getInt("id");
                    String street_name = rs1.getString("street_name");
                    String city = rs1.getString("city");
                    String state = rs1.getString("state");
                    String pincode = rs1.getString("pincode");
                    String country = rs1.getString("country");
                    String street_type = rs1.getString("street_type");
                    double length = rs1.getDouble("length_meters");
                    int lanes = rs1.getInt("lanes");
                    String traffic = rs1.getString("traffic_density");
                    String parking = rs1.getString("parking_available");
                    String lighting = rs1.getString("lighting");
                    String maintenance = rs1.getString("maintenance_status");

                    System.out.println("ID:" + id);
                    System.out.println("Street Name:" + street_name);
                    System.out.println("City:" + city);
                    System.out.println("State:" + state);
                    System.out.println("Pincode:" + pincode);
                    System.out.println("Country:" + country);
                    System.out.println("Street Type:" + street_type);
                    System.out.println("Length:" + length);
                    System.out.println("Lanes:" + lanes);
                    System.out.println("Traffic Density:" + traffic);
                    System.out.println("Parking Available:" + parking);
                    System.out.println("Lighting:" + lighting);
                    System.out.println("Maintenance:" + maintenance);
                    System.out.println("----------------------------------------------");
                }


                // Select one row
                String row1 = "Select * from street where id = 3";
                ResultSet rs2 = statement.executeQuery(row1);

                while (rs2.next()) {
                    System.out.println("ID: " + rs2.getInt("id"));
                    System.out.println("Street Name: " + rs2.getString("street_name"));
                    System.out.println("City: " + rs2.getString("city"));
                    System.out.println("State: " + rs2.getString("state"));
                    System.out.println("----------------------------------------------");
                }


                // Select one column one row
                String col1 = "Select street_name from street where id = 5";
                ResultSet rs3 = statement.executeQuery(col1);

                while (rs3.next()) {
                    System.out.println("Street Name: " + rs3.getString("street_name"));
                }
                System.out.println("----------------------------------------------");


                // Select two rows
                String twoRows = "Select * from street where id IN (1,4)";
                ResultSet rs4 = statement.executeQuery(twoRows);

                while (rs4.next()) {
                    System.out.println("ID: " + rs4.getInt("id") +
                            " Name: " + rs4.getString("street_name"));
                }
                System.out.println("----------------------------------------------");


                // Select three rows
                String threeRows = "Select * from street where id IN (2,6,8)";
                ResultSet rs5 = statement.executeQuery(threeRows);

                while (rs5.next()) {
                    System.out.println("ID: " + rs5.getInt("id") +
                            " Name: " + rs5.getString("street_name") +
                            " City: " + rs5.getString("city"));
                }
                System.out.println("----------------------------------------------");


                // Select one column all rows
                String colAll = "Select street_name from street";
                ResultSet rs6 = statement.executeQuery(colAll);

                while (rs6.next()) {
                    System.out.println("Street Name: " + rs6.getString("street_name"));
                }
                System.out.println("----------------------------------------------");


                // Select distinct
                String distinct = "Select distinct street_type from street";
                ResultSet rs7 = statement.executeQuery(distinct);

                while (rs7.next()) {
                    System.out.println("Street Type: " + rs7.getString("street_type"));
                }
                System.out.println("----------------------------------------------");


                // Select count
                String count = "Select COUNT(*) from street";
                ResultSet rs8 = statement.executeQuery(count);

                while (rs8.next()) {
                    System.out.println("Total Rows: " + rs8.getInt(1));
                }
                System.out.println("----------------------------------------------");


                // Latest row
                String latest = "Select * from street ORDER BY id DESC LIMIT 1";
                ResultSet rs9 = statement.executeQuery(latest);

                while (rs9.next()) {
                    System.out.println("Latest Street ID: " + rs9.getInt("id"));
                }
                System.out.println("----------------------------------------------");


                // Max 2 rows
                String max2 = "Select * from street ORDER BY id DESC LIMIT 2";
                ResultSet rs10 = statement.executeQuery(max2);

                while (rs10.next()) {
                    System.out.println("Street ID: " + rs10.getInt("id"));
                }
                System.out.println("----------------------------------------------");


                // Min 5 rows
                String min5 = "Select * from street ORDER BY id ASC LIMIT 5";
                ResultSet rs11 = statement.executeQuery(min5);

                while (rs11.next()) {
                    System.out.println("Street ID: " + rs11.getInt("id"));
                }
                System.out.println("----------------------------------------------");


                // Oldest row
                String oldest = "Select * from street ORDER BY id ASC LIMIT 1";
                ResultSet rs12 = statement.executeQuery(oldest);

                while (rs12.next()) {
                    System.out.println("Oldest Street ID: " + rs12.getInt("id"));
                }
                System.out.println("----------------------------------------------");


                // Order by desc
                String desc = "Select * from street ORDER BY id DESC";
                ResultSet rs13 = statement.executeQuery(desc);

                while (rs13.next()) {
                    System.out.println("Street ID: " + rs13.getInt("id"));
                }
                System.out.println("----------------------------------------------");


                // Group by
                String groupBy = "Select city, COUNT(*) AS total from street GROUP BY city";
                ResultSet rs14 = statement.executeQuery(groupBy);

                while (rs14.next()) {
                    System.out.println(rs14.getString("city") + " Total: " + rs14.getInt("total"));
                }
                System.out.println("----------------------------------------------");


                // Group by + having
                String having = "Select city, COUNT(*) AS total from street GROUP BY city HAVING COUNT(*) > 0";
                ResultSet rs15 = statement.executeQuery(having);

                while (rs15.next()) {
                    System.out.println(rs15.getString("city") + " Total: " + rs15.getInt("total"));
                }
                System.out.println("----------------------------------------------");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


