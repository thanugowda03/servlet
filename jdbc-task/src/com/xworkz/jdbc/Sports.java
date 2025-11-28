package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sports {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "tanu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);
            String sql = "insert into sports values" +
                    "2,'Swimming','Water','Swimsuit',1,'England','High','Pool','YES','YES')," +
                    "(3,'Badminton','Indoor','Racket, Shuttle',2,'India','High','Court','YES','YES')," +
                    "(4,'Tennis','Outdoor','Racket, Ball',2,'France','High','Court','YES','YES')," +
                    "(5,'Table Tennis','Indoor','Bat, Ball',2,'England','Medium','Table','YES','NO')," +
                    "(6,'Boxing','Combat','Gloves',2,'USA','High','Ring','YES','YES')," +
                    "(7,'Archery','Outdoor','Bow, Arrow',1,'Korea','Medium','Range','YES','YES')," +
                    "(8,'Hockey','Outdoor','Stick, Ball',11,'India','High','Field','YES','YES')," +
                    "(9,'Football','Outdoor','Ball, Shoes',11,'England','High','Field','YES','YES')," +
                    "(10,'Volleyball','Outdoor','Ball, Net',6,'USA','Medium','Court','YES','NO')," +

                    "(11,'Basketball','Indoor','Ball, Shoes',5,'USA','High','Court','YES','YES')," +
                    "(12,'Wrestling','Combat','Mat',2,'Greece','High','Arena','YES','YES')," +
                    "(13,'Weightlifting','Indoor','Barbell',1,'Russia','High','Platform','YES','YES')," +
                    "(14,'Judo','Combat','Uniform',2,'Japan','Medium','Mat','YES','YES')," +
                    "(15,'Karate','Combat','Uniform',1,'Japan','Medium','Dojo','YES','NO')," +
                    "(16,'Cycling','Outdoor','Cycle',1,'France','High','Track','YES','YES')," +
                    "(17,'Shooting','Indoor','Rifle',1,'Germany','Medium','Range','YES','YES')," +
                    "(18,'Gymnastics','Indoor','Bars, Beam',1,'Greece','High','Arena','YES','YES')," +
                    "(19,'Fencing','Indoor','Sword, Mask',1,'France','Low','Hall','YES','YES')," +
                    "(20,'Rowing','Water','Boat, Oars',4,'England','Medium','River','YES','YES'),"+


                   "(21,'Sailing','Water','Boat',1,'USA','Low','Waterbody','YES','NO')," +
                    "(22,'Canoeing','Water','Kayak',1,'Canada','Medium','River','YES','YES')," +
                    "(23,'Rugby','Outdoor','Ball',15,'England','Medium','Field','YES','NO')," +
                    "(24,'Golf','Outdoor','Club, Ball',1,'Scotland','Medium','Course','YES','NO')," +
                    "(25,'Cricket','Outdoor','Bat, Ball',11,'England','High','Ground','NO','YES')," +
                    "(26,'Kabaddi','Indoor','None',7,'India','High','Court','NO','NO')," +
                    "(27,'Kho Kho','Outdoor','None',9,'India','Medium','Field','NO','NO')," +
                    "(28,'Handball','Indoor','Ball',7,'Germany','Low','Court','YES','NO')," +
                    "(29,'Baseball','Outdoor','Bat, Ball',9,'USA','High','Field','YES','YES')," +
                    "(30,'Softball','Outdoor','Bat, Ball',9,'USA','Low','Field','YES','NO')," +
                    "(31,'Equestrian','Outdoor','Horse',1,'UK','Medium','Arena','YES','YES'),"+


                    "(32,'Triathlon','Outdoor','Cycle, Shoes',1,'USA','High','Track','YES','YES')," +
                    "(33,'Surfing','Water','Board',1,'Hawaii','Medium','Ocean','YES','NO')," +
                    "(34,'Skateboarding','Outdoor','Skateboard',1,'USA','High','Ramp','YES','NO')," +
                    "(35,'Taekwondo','Combat','Uniform',1,'Korea','Medium','Dojo','YES','YES')," +
                    "(36,'Ice Hockey','Indoor','Skates, Stick',6,'Canada','High','Ice Rink','YES','NO')," +
                    "(37,'Figure Skating','Indoor','Skates',1,'Russia','High','Ice Rink','YES','YES')," +
                    "(38,'Speed Skating','Indoor','Skates',1,'Netherlands','Medium','Ice Rink','YES','YES')," +
                    "(39,'Snowboarding','Outdoor','Snowboard',1,'USA','Medium','Mountain','YES','NO')," +
                    "(40,'Skiing','Outdoor','Skis',1,'Switzerland','High','Slopes','YES','YES')," +
                    "(41,'BMX Cycling','Outdoor','Bike',1,'USA','Medium','Track','YES','NO'),"+

                    "(42,'Mountain Biking','Outdoor','Bike',1,'Switzerland','Medium','Trail','YES','NO')," +
                    "(43,'Diving','Water','Swimsuit',1,'China','High','Pool','YES','YES')," +
                    "(44,'Water Polo','Water','Ball',7,'England','Medium','Pool','YES','NO')," +
                    "(45,'Marathon','Outdoor','Shoes',1,'Greece','High','Track','YES','NO')," +
                    "(46,'Relay Race','Outdoor','Baton',4,'Greece','Medium','Track','YES','NO'), "+
                    "(47,'Pole Vault','Outdoor','Pole',1,'USA','Medium','Track','YES','YES')," +
                    "(48,'Long Jump','Outdoor','Shoes',1,'Greece','Medium','Track','YES','NO')," +
                    "(49,'High Jump','Outdoor','Shoes',1,'USA','Medium','Track','YES','NO')," +
                    "(50,'Shot Put','Outdoor','Shot',1,'Greece','Low','Track','YES','YES')," +
                    "(51,'Discus Throw','Outdoor','Discus',1,'Greece','Low','Track','YES','YES')," +
                    "(52,'Hammer Throw','Outdoor','Hammer',1,'Scotland','Low','Track','YES','YES')," +
                    "(53,'Triple Jump','Outdoor','Shoes',1,'France','Low','Track','YES','NO')," +
                    "(54,'Sprint 100m','Outdoor','Shoes',1,'USA','High','Track','YES','NO'),"+

                    "(55,'Sprint 200m','Outdoor','Shoes',1,'USA','High','Track','YES','NO')," +
                    "(56,'Sprint 400m','Outdoor','Shoes',1,'USA','Medium','Track','YES','NO')," +
                    "(57,'Greco-Roman Wrestling','Combat','Mat',1,'Greece','Medium','Arena','YES','YES')," +
                    "(58,'Freestyle Wrestling','Combat','Mat',1,'Russia','Medium','Arena','YES','YES')," +
                    "(59,'Rhythmic Gymnastics','Indoor','Ribbon, Hoop',1,'Russia','Medium','Arena','YES','NO')," +
                    "(60,'Artistic Gymnastics','Indoor','Bars, Rings',1,'USA','High','Arena','YES','YES')," +
                    "(61,'Mixed Relay Triathlon','Outdoor','Shoes, Cycle',4,'USA','Medium','Track','YES','YES')," +
                    "(62,'Beach Volleyball','Outdoor','Ball, Net',2,'Brazil','High','Sand','YES','NO')," +
                    "(63,'Synchronized Swimming','Water','Costume',4,'Russia','Medium','Pool','YES','NO')," +
                    "(64,'Climbing','Indoor','Rope, Grip',1,'France','High','Wall','YES','NO')," +
                    "(65,'Modern Pentathlon','Outdoor','Sword, Gun',1,'UK','Low','Arena','YES','YES'),"+

                    "(66,'Equestrian Jumping','Outdoor','Horse',1,'UK','Medium','Arena','YES','YES')," +
                    "(67,'Freestyle Surfing','Water','Board',1,'USA','Medium','Sea','YES','NO')," +
                    "(68,'Mixed Doubles Badminton','Indoor','Racket',2,'China','High','Court','YES','NO')," +
                    "(69,'Mixed Doubles Tennis','Outdoor','Racket',2,'USA','High','Court','YES','NO')," +
                    "(70,'Skeet Shooting','Outdoor','Gun',1,'USA','Medium','Range','YES','YES')," +
                    "(71,'Air Rifle Shooting','Indoor','Rifle',1,'Germany','Medium','Range','YES','YES')," +
                    "(72,'Kayak Slalom','Water','Kayak',1,'France','Medium','River','YES','NO')," +
                    "(73,'Canoe Sprint','Water','Canoe',1,'Germany','Medium','Lake','YES','YES')," +
                    "(74,'Racewalking','Outdoor','Shoes',1,'Russia','Low','Track','YES','YES')," +
                    "(75,'Relay 4x400m','Outdoor','Baton',4,'USA','High','Track','YES','YES')";

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