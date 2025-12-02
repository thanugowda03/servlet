package com.xworkz.jdbc;

import java.sql.*;

public class PresidentSelect {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.Secret.getProp())) {

            Statement statement = connection.createStatement();


            // SELECT ALL ROWS
            String selectAll = "SELECT * FROM president";
            ResultSet rs1 = statement.executeQuery(selectAll);

            while (rs1.next()) {
                int id = rs1.getInt("id");
                String firstName = rs1.getString("first_name");
                String lastName = rs1.getString("last_name");
                String country = rs1.getString("country");
                Date termStart = rs1.getDate("term_start");
                Date termEnd = rs1.getDate("term_end");
                String party = rs1.getString("political_party");
                Date birthDate = rs1.getDate("birth_date");
                String birthPlace = rs1.getString("birth_place");
                Date deathDate = rs1.getDate("death_date");
                String deathPlace = rs1.getString("death_place");
                String education = rs1.getString("education");
                String spouse = rs1.getString("spouse");
                int children = rs1.getInt("children");
                String achievements = rs1.getString("achievements");
                String notableFact = rs1.getString("notable_fact");

                System.out.println("ID: " + id);
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("Country: " + country);
                System.out.println("Term: " + termStart + " to " + termEnd);
                System.out.println("Party: " + party);
                System.out.println("Birth: " + birthDate + " at " + birthPlace);
                System.out.println("Death: " + deathDate + " at " + deathPlace);
                System.out.println("Education: " + education);
                System.out.println("Spouse: " + spouse);
                System.out.println("Children: " + children);
                System.out.println("Achievements: " + achievements);
                System.out.println("Notable Fact: " + notableFact);
                System.out.println("------------------------------------------------------");
            }


            //SELECT ONE ROW
            String oneRow = "SELECT * FROM president WHERE id = 3";
            ResultSet rs2 = statement.executeQuery(oneRow);

            while (rs2.next()) {
                System.out.println("ID: " + rs2.getInt("id"));
                System.out.println("Name: " +
                        rs2.getString("first_name") + " " + rs2.getString("last_name"));
                System.out.println("Country: " + rs2.getString("country"));
                System.out.println("Party: " + rs2.getString("political_party"));
                System.out.println("------------------------------------------------------");
            }


            //SELECT ONE COLUMN & ONE ROW
            String oneColumn = "SELECT first_name FROM president WHERE id = 5";
            ResultSet rs3 = statement.executeQuery(oneColumn);

            while (rs3.next()) {
                System.out.println("First Name: " + rs3.getString("first_name"));
            }
            System.out.println("------------------------------------------------------");


            //SELECT TWO ROWS
            String twoRows = "SELECT * FROM president WHERE id IN (1,4)";
            ResultSet rs4 = statement.executeQuery(twoRows);

            while (rs4.next()) {
                System.out.println("ID: " + rs4.getInt("id") + " Name: " + rs4.getString("first_name"));
            }
            System.out.println("------------------------------------------------------");


            //SELECT THREE ROWS
            String threeRows = "SELECT * FROM president WHERE id IN (2,6,8)";
            ResultSet rs5 = statement.executeQuery(threeRows);

            while (rs5.next()) {
                System.out.println("ID: " + rs5.getInt("id") + " Name: " + rs5.getString("first_name") + " Country: " + rs5.getString("country"));
            }
            System.out.println("------------------------------------------------------");


            //SELECT ONE COLUMN ALL ROWS
            String colAll = "SELECT first_name FROM president";
            ResultSet rs6 = statement.executeQuery(colAll);

            while (rs6.next()) {
                System.out.println("Name: " + rs6.getString("first_name"));
            }


            // DISTINCT
            String distinct = "SELECT DISTINCT country FROM president";
            ResultSet rs7 = statement.executeQuery(distinct);

            while (rs7.next()) {
                System.out.println("Country: " + rs7.getString("country"));
            }
            System.out.println("------------------------------------------------------");


            //COUNT(*)
            String count = "SELECT COUNT(*) FROM president";
            ResultSet rs8 = statement.executeQuery(count);

            while (rs8.next()) {
                System.out.println("Total Rows: " + rs8.getInt(1));
            }
            System.out.println("------------------------------------------------------");


            //LATEST ROW
            String latest = "SELECT * FROM president ORDER BY id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(latest);

            while (rs9.next()) {
                System.out.println("Latest President ID: " + rs9.getInt("id"));
            }
            System.out.println("------------------------------------------------------");


            //MAX 2 ROWS
            String max2 = "SELECT * FROM president ORDER BY id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(max2);

            while (rs10.next()) {
                System.out.println("President ID: " + rs10.getInt("id"));
            }
            System.out.println("------------------------------------------------------");


            //MIN 5 ROWS
            String min5 = "SELECT * FROM president ORDER BY id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(min5);

            while (rs11.next()) {
                System.out.println("President ID: " + rs11.getInt("id"));
            }
            System.out.println("------------------------------------------------------");

            //OLDEST ROW
            String oldest = "SELECT * FROM president ORDER BY id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);

            while (rs12.next()) {
                System.out.println("Oldest President ID: " + rs12.getInt("id"));
            }
            System.out.println("------------------------------------------------------");


            //ORDER BY DESC
            String desc = "SELECT * FROM president ORDER BY id DESC";
            ResultSet rs13 = statement.executeQuery(desc);

            while (rs13.next()) {
                System.out.println("ID: " + rs13.getInt("id"));
            }
            System.out.println("------------------------------------------------------");


            //GROUP BY
            String groupBy = "SELECT country, COUNT(*) AS total FROM president GROUP BY country";
            ResultSet rs14 = statement.executeQuery(groupBy);

            while (rs14.next()) {
                System.out.println(rs14.getString("country") + " Total: " + rs14.getInt("total"));
            }
            System.out.println("------------------------------------------------------");


            //GROUP BY and HAVING
            String having = "SELECT country, COUNT(*) AS total FROM president " + "GROUP BY country HAVING COUNT(*) > 0";
            ResultSet rs15 = statement.executeQuery(having);

            while (rs15.next()) {
                System.out.println(rs15.getString("country") + " Total: " + rs15.getInt("total"));
            }
            System.out.println("------------------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

