package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Hospital {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "tanu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);
            String sql = "insert into hospital values" + "(2, 'Sunrise Medical Center', 'Mumbai', 'Maharashtra', 'India', '400001', 'Specialty', 150, 'YES', 4.5),"+
            "(3, 'City Care Hospital', 'Delhi', 'Delhi', 'India', '110001', 'General', 300, 'YES', 4.0),"+
            "(4, 'Riverfront Hospital', 'Chennai', 'Tamil Nadu', 'India', '600001', 'Multispeciality', 200, 'YES', 4.3),"+
            "(5, 'Evergreen Health Institute', 'Hyderabad', 'Telangana', 'India', '500001', 'Specialty', 100, 'NO', 4.1),"+
            "(6, 'Harmony Hospital', 'Pune', 'Maharashtra', 'India', '411001', 'General', 220, 'YES', 4.4),"+
            "(7, 'Lotus Medical Center', 'Kolkata', 'West Bengal', 'India', '700001', 'Multispeciality', 180, 'YES', 4.0),"+
            "(8, 'Bright Future Hospital', 'Jaipur', 'Rajasthan', 'India', '302001', 'General', 120, 'NO', 3.9),"+
           "(9, 'Hope Health Hospital', 'Ahmedabad', 'Gujarat', 'India', '380001', 'Specialty', 160, 'YES', 4.2),"+
            "(10, 'Sunshine Hospital', 'Lucknow', 'Uttar Pradesh', 'India', '226001', 'General', 200, 'YES', 4.1),"+
            "(11, 'Phoenix Medical Center', 'Bhopal', 'Madhya Pradesh', 'India', '462001', 'Multispeciality', 210, 'YES', 4.3),"+
            "(12, 'Crescent Health Care', 'Indore', 'Madhya Pradesh', 'India', '452001', 'General', 150, 'NO', 4.0),"+
            "(13, 'Rainbow Hospital', 'Nagpur', 'Maharashtra', 'India', '440001', 'Specialty', 180, 'YES', 4.2),"+
            "(14, 'Silver Oak Hospital', 'Surat', 'Gujarat', 'India', '395001', 'General', 200, 'YES', 4.1),"+


            "(15, 'Healing Hands Hospital', 'Kochi', 'Kerala', 'India', '682001', 'Multispeciality', 230, 'YES', 4.4),"+
            "(16, 'Tranquil Medical Center', 'Mysore', 'Karnataka', 'India', '570001', 'General', 140, 'NO', 3.8),"+
            "(17, 'Lotus Valley Hospital', 'Chandigarh', 'Chandigarh', 'India', '160001', 'Specialty', 120, 'YES', 4.2),"+
            "(18, 'Aurora Health Institute', 'Guwahati', 'Assam', 'India', '781001', 'General', 160, 'YES', 4.0),"+
            "(19, 'Serene Care Hospital', 'Patna', 'Bihar', 'India', '800001', 'Multispeciality', 200, 'YES', 4.1),"+
            "(20, 'Vitality Hospital', 'Raipur', 'Chhattisgarh', 'India', '492001', 'Specialty', 150, 'NO', 4.0),"+
            "(21, 'Maple Leaf Hospital', 'Dehradun', 'Uttarakhand', 'India', '248001', 'General', 130, 'YES', 4.2),"+
            "(22, 'Crystal Health Hospital', 'Shimla', 'Himachal Pradesh', 'India', '171001', 'Multispeciality', 120, 'YES', 4.3),"+
            "(23, 'Pioneer Medical Center', 'Bhubaneswar', 'Odisha', 'India', '751001', 'General', 180, 'YES', 4.1),"+
            "(24, 'Cedar Health Care', 'Visakhapatnam', 'Andhra Pradesh', 'India', '530001', 'Specialty', 140, 'YES', 4.2),"+
            "(25, 'Hopewell Hospital', 'Coimbatore', 'Tamil Nadu', 'India', '641001', 'General', 160, 'NO', 3.9),"+
            "(26, 'Maple Health Hospital', 'Mangalore', 'Karnataka', 'India', '575001', 'Multispeciality', 200, 'YES', 4.3),"+
            "(27, 'Lighthouse Hospital', 'Trivandrum', 'Kerala', 'India', '695001', 'Specialty', 120, 'YES', 4.0),"+
            "(28, 'Sunset Medical Center', 'Vijayawada', 'Andhra Pradesh', 'India', '520001', 'General', 180, 'YES', 4.1),"+
            "(29, 'Blue Horizon Hospital', 'Patiala', 'Punjab', 'India', '147001', 'Multispeciality', 160, 'NO', 4.2),"+
            "(30, 'Evercare Hospital', 'Nagpur', 'Maharashtra', 'India', '440002', 'Specialty', 140, 'YES', 4.3),"+
            "(31, 'New Life Hospital', 'Indore', 'Madhya Pradesh', 'India', '452002', 'General', 220, 'YES', 4.1),"+
            "(32, 'Central Health Institute', 'Delhi', 'Delhi', 'India', '110002', 'Multispeciality', 250, 'YES', 4.5),"+
            "(33, 'Grace Medical Center', 'Bangalore', 'Karnataka', 'India', '560002', 'General', 180, 'NO', 3.9),"+
            "(34, 'Omni Health Hospital', 'Mumbai', 'Maharashtra', 'India', '400002', 'Specialty', 150, 'YES', 4.2),"+
            "(35, 'Wellness Care Hospital', 'Chennai', 'Tamil Nadu', 'India', '600002', 'General', 200, 'YES', 4.0),"+
            "(36, 'Pearl Health Institute', 'Hyderabad', 'Telangana', 'India', '500002', 'Multispeciality', 210, 'YES', 4.3),"+
            "(37, 'Aspire Hospital', 'Pune', 'Maharashtra', 'India', '411002', 'General', 160, 'YES', 4.1),"+
            "(38, 'Trinity Medical Center', 'Kolkata', 'West Bengal', 'India', '700002', 'Specialty', 180, 'NO', 4.0),"+
            "(39, 'Fortune Hospital', 'Jaipur', 'Rajasthan', 'India', '302002', 'General', 140, 'YES', 4.2),"+
            "(40, 'Healing Touch Hospital', 'Ahmedabad', 'Gujarat', 'India', '380002', 'Multispeciality', 220, 'YES', 4.4),"+
            "(41, 'Caring Hands Hospital', 'Lucknow', 'Uttar Pradesh', 'India', '226002', 'General', 160, 'YES', 4.1),"+
            "(42, 'Bright Star Hospital', 'Bhopal', 'Madhya Pradesh', 'India', '462002', 'Specialty', 150, 'NO', 4.0),"+
            "(43, 'Noble Health Hospital', 'Indore', 'Madhya Pradesh', 'India', '452003', 'General', 180, 'YES', 4.2),"+
            "(44, 'Silverline Hospital', 'Nagpur', 'Maharashtra', 'India', '440003', 'Multispeciality', 200, 'YES', 4.3),"+
            "(45, 'Graceful Care Hospital', 'Surat', 'Gujarat', 'India', '395002', 'General', 140, 'NO', 4.0),"+
            "(46, 'Sunshine Valley Hospital', 'Kochi', 'Kerala', 'India', '682002', 'Specialty', 120, 'YES', 4.1),"+
            "(47, 'Healing Path Hospital', 'Mysore', 'Karnataka', 'India', '570002', 'Multispeciality', 180, 'YES', 4.2),"+
            "(48, 'Aurora Medical Center', 'Chandigarh', 'Chandigarh', 'India', '160002', 'General', 160, 'YES', 4.0),"+
            "(49, 'Serenity Hospital', 'Guwahati', 'Assam', 'India', '781002', 'Specialty', 130, 'NO', 4.1),"+
            "(50, 'Vital Care Hospital', 'Patna', 'Bihar', 'India', '800002', 'Multispeciality', 200, 'YES', 4.3),"+
            "(51, 'Maplewood Hospital', 'Raipur', 'Chhattisgarh', 'India', '492002', 'General', 150, 'YES', 4.0),"+

            "(52, 'Crystal Care Hospital', 'Dehradun', 'Uttarakhand', 'India', '248002', 'Specialty', 120, 'YES', 4.2),"+
            "(53, 'Pioneer Health Institute', 'Shimla', 'Himachal Pradesh', 'India', '171002', 'General', 140, 'YES', 4.1),"+
            "(54, 'Cedar Valley Hospital', 'Bhubaneswar', 'Odisha', 'India', '751002', 'Multispeciality', 180, 'YES', 4.3),"+
            "(55, 'Hope Medical Center', 'Visakhapatnam', 'Andhra Pradesh', 'India', '530002', 'General', 160, 'NO', 4.0),"+
            "(56, 'Maple Care Hospital', 'Coimbatore', 'Tamil Nadu', 'India', '641002', 'Specialty', 140, 'YES', 4.1),"+
            "(57, 'Lighthouse Medical Center', 'Mangalore', 'Karnataka', 'India', '575002', 'General', 180, 'YES', 4.2),"+
            "(58, 'Sunset Health Institute', 'Trivandrum', 'Kerala', 'India', '695002', 'Multispeciality', 200, 'YES', 4.4),"+
            "(59, 'Blue Horizon Medical', 'Vijayawada', 'Andhra Pradesh', 'India', '520002', 'General', 150, 'NO', 4.0),"+
            "(60, 'Evercare Medical Center', 'Patiala', 'Punjab', 'India', '147002', 'Specialty', 130, 'YES', 4.1),"+
            "(61, 'New Life Medical', 'Nagpur', 'Maharashtra', 'India', '440004', 'General', 220, 'YES', 4.2),"+
            "(62, 'Central Valley Hospital', 'Indore', 'Madhya Pradesh', 'India', '452004', 'Multispeciality', 250, 'YES', 4.5),"+
            "(63, 'Grace Care Hospital', 'Delhi', 'Delhi', 'India', '110003', 'General', 180, 'YES', 4.0),"+
            "(64, 'Omni Health Center', 'Bangalore', 'Karnataka', 'India', '560003', 'Specialty', 150, 'NO', 4.1),"+
            "(65, 'Wellness Medical', 'Mumbai', 'Maharashtra', 'India', '400003', 'Multispeciality', 200, 'YES', 4.3),"+
            "(66, 'Pearl Care Hospital', 'Chennai', 'Tamil Nadu', 'India', '600003', 'General', 160, 'YES', 4.0),"+
            "(67, 'Aspire Medical Center', 'Hyderabad', 'Telangana', 'India', '500003', 'Specialty', 180, 'YES', 4.2),"+
            "(68, 'Trinity Hospital', 'Pune', 'Maharashtra', 'India', '411003', 'General', 140, 'NO', 4.0),"+
            "(69, 'Fortune Medical', 'Kolkata', 'West Bengal', 'India', '700003', 'Multispeciality', 220, 'YES', 4.3),"+
            "(70, 'Healing Touch Medical', 'Jaipur', 'Rajasthan', 'India', '302003', 'General', 160, 'YES', 4.1),"+
            "(71, 'Caring Hands Medical', 'Ahmedabad', 'Gujarat', 'India', '380003', 'Specialty', 150, 'YES', 4.2),"+
            "(72, 'Bright Star Medical', 'Lucknow', 'Uttar Pradesh', 'India', '226003', 'General', 180, 'NO', 4.0),"+
            "(73, 'Noble Care Hospital', 'Bhopal', 'Madhya Pradesh', 'India', '462003', 'Multispeciality', 200, 'YES', 4.3),"+
            "(74, 'Silverline Medical', 'Indore', 'Madhya Pradesh', 'India', '452005', 'General', 140, 'YES', 4.1),"+
            "(75, 'Graceful Care Medical', 'Nagpur', 'Maharashtra', 'India', '440005', 'Specialty', 120, 'NO', 4.0)";

            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(sql);
            System.out.println("rowsAffected :"+rowAffected);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}
