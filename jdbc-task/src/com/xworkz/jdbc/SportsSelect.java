package com.xworkz.jdbc;

import java.sql.*;

public class SportsSelect {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.Secret.getProp())) {

            Statement statement = connection.createStatement();

            // Select all rows
            String selectAll = "Select * from sports";
            ResultSet rs1 = statement.executeQuery(selectAll);

            while (rs1.next()) {
                int sport_id = rs1.getInt("sport_id");
                String sport_name = rs1.getString("sport_name");
                String category = rs1.getString("category");
                String equipment = rs1.getString("equipment");
                int player_count = rs1.getInt("player_count");
                String origin_country = rs1.getString("origin_country");
                String popularity_level = rs1.getString("popularity_level");
                String play_area = rs1.getString("play_area");
                String olympic_sport = rs1.getString("olympic_sport");
                String coach_required = rs1.getString("coach_required");

                System.out.println("Sport ID:" + sport_id);
                System.out.println("Sport Name:" + sport_name);
                System.out.println("Category:" + category);
                System.out.println("Equipment:" + equipment);
                System.out.println("Player Count:" + player_count);
                System.out.println("Origin Country:" + origin_country);
                System.out.println("Popularity Level:" + popularity_level);
                System.out.println("Play Area:" + play_area);
                System.out.println("Olympic Sport:" + olympic_sport);
                System.out.println("Coach Required:" + coach_required);
                System.out.println("--------------------------------------------------");
            }


            // Select one row
            String oneRow = "Select * from sports where sport_id = 3";
            ResultSet rs2 = statement.executeQuery(oneRow);

            while (rs2.next()) {
                System.out.println("Sport ID: " + rs2.getInt("sport_id"));
                System.out.println("Sport Name: " + rs2.getString("sport_name"));
                System.out.println("Category: " + rs2.getString("category"));
                System.out.println("Play Area: " + rs2.getString("play_area"));
                System.out.println("--------------------------------------------------");
            }


            // Select one column one row
            String oneColumn = "Select sport_name from sports where sport_id = 5";
            ResultSet rs3 = statement.executeQuery(oneColumn);

            while (rs3.next()) {
                System.out.println("Sport Name: " + rs3.getString("sport_name"));
            }
            System.out.println("--------------------------------------------------");



            // Select two rows
            String twoRows = "Select * from sports where sport_id IN (1,4)";
            ResultSet rs4 = statement.executeQuery(twoRows);

            while (rs4.next()) {
                System.out.println("Sport ID: " + rs4.getInt("sport_id") +
                        " Sport Name: " + rs4.getString("sport_name"));
            }
            System.out.println("--------------------------------------------------");



            // Select three rows
            String threeRows = "Select * from sports where sport_id IN (2,6,8)";
            ResultSet rs5 = statement.executeQuery(threeRows);

            while (rs5.next()) {
                System.out.println("Sport ID: " + rs5.getInt("sport_id") +
                        " Name: " + rs5.getString("sport_name") +
                        " Category: " + rs5.getString("category"));
            }
            System.out.println("--------------------------------------------------");



            // Select one column all rows
            String colAll = "Select sport_name from sports";
            ResultSet rs6 = statement.executeQuery(colAll);

            while (rs6.next()) {
                System.out.println("Sport Name: " + rs6.getString("sport_name"));
            }
            System.out.println("--------------------------------------------------");



            // Select distinct
            String distinct = "Select distinct category from sports";
            ResultSet rs7 = statement.executeQuery(distinct);

            while (rs7.next()) {
                System.out.println("Category: " + rs7.getString("category"));
            }
            System.out.println("--------------------------------------------------");



            // Select count(*)
            String count = "Select COUNT(*) from sports";
            ResultSet rs8 = statement.executeQuery(count);

            while (rs8.next()) {
                System.out.println("Total Rows: " + rs8.getInt(1));
            }
            System.out.println("--------------------------------------------------");



            // Latest row
            String latest = "Select * from sports ORDER BY sport_id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(latest);

            while (rs9.next()) {
                System.out.println("Latest Sport ID: " + rs9.getInt("sport_id"));
            }
            System.out.println("--------------------------------------------------");


            // Max 2 rows
            String max2 = "Select * from sports ORDER BY sport_id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(max2);

            while (rs10.next()) {
                System.out.println("Sport ID: " + rs10.getInt("sport_id"));
            }
            System.out.println("--------------------------------------------------");



            // Min 5 rows
            String min5 = "Select * from sports ORDER BY sport_id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(min5);

            while (rs11.next()) {
                System.out.println("Sport ID: " + rs11.getInt("sport_id"));
            }
            System.out.println("--------------------------------------------------");



            // Oldest row
            String oldest = "Select * from sports ORDER BY sport_id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);

            while (rs12.next()) {
                System.out.println("Oldest Sport ID: " + rs12.getInt("sport_id"));
            }
            System.out.println("--------------------------------------------------");



            // Order by desc
            String desc = "Select * from sports ORDER BY sport_id DESC";
            ResultSet rs13 = statement.executeQuery(desc);

            while (rs13.next()) {
                System.out.println("Sport ID: " + rs13.getInt("sport_id"));
            }
            System.out.println("--------------------------------------------------");



            // Group by
            String groupBy = "Select category, COUNT(*) AS total from sports GROUP BY category";
            ResultSet rs14 = statement.executeQuery(groupBy);

            while (rs14.next()) {
                System.out.println(rs14.getString("category") + " Total: " + rs14.getInt("total"));
            }
            System.out.println("--------------------------------------------------");



            // Group by + having
            String having = "Select category, COUNT(*) AS total from sports GROUP BY category HAVING COUNT(*) > 0";
            ResultSet rs15 = statement.executeQuery(having);

            while (rs15.next()) {
                System.out.println(rs15.getString("category") + " Total: " + rs15.getInt("total"));
            }
            System.out.println("--------------------------------------------------");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

