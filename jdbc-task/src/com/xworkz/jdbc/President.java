package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class President {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "tanu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);
            String sql = "insert into president values" +
                    "(2,'Abraham','Lincoln','USA','1861-03-04','1865-04-15','Republican','1809-02-12','Hardin','1865-04-15','Washington','Self','Mary',4,'Emancipation','Hero')," +
                    "(3,'Nelson','Mandela','South Africa','1994-05-10','1999-06-14','ANC','1918-07-18','Mvezo','2013-12-05','Johannesburg','None','Winnie',6,'Freedom','Leader'),"+
                   " (4,'Emmanuel','Macron','France','2017-05-14','2027-05-13','LREM','1977-12-21','Amiens','2025-01-01','Paris','Science Po','Brigitte',0,'Reform','Youngest')," +
           " (5,'Angela','Merkel','Germany','2005-11-22','2021-12-08','CDU','1954-07-17','Hamburg','2025-01-01','Berlin','Physics','Unknown',0,'Chancellor','Powerful')," +
            "(6,'Vladimir','Putin','Russia','2000-05-07','2008-05-07','United Russia','1952-10-07','Leningrad','2025-01-01','Moscow','Law','Lyudmila',2,'Leader','Strong')," +
            "(7,'Xi','Jinping','China','2013-03-14','2025-01-01','CPC','1953-06-15','Beijing','2025-01-01','Beijing','Engineering','Peng',1,'Reform','Powerful')," +
            "(8,'Narendra','Modi','India','2014-05-26','2025-01-01','BJP','1950-09-17','Vadnagar','2025-01-01','New Delhi','Gujarat University','Jashodaben',2,'Reform','Popular')," +
           " (9,'Jair','Bolsonaro','Brazil','2019-01-01','2025-01-01','PSL','1955-03-21','Glicério','2025-01-01','Brasília','Unknown','Michelle',5,'Policy','Controversial')," +
            "(10,'Justin','Trudeau','Canada','2015-11-04','2025-01-01','Liberal','1971-12-25','Ottawa','2025-01-01','Ottawa','McGill','Sophie',3,'Youth','Charismatic')," +
            "(11,'Boris','Johnson','UK','2019-07-24','2022-09-06','Conservative','1964-06-19','New York','2025-01-01','London','Oxford','Carrie',2,'Brexit','Controversial')," +
            "(12,'Moon','Jae-in','South Korea','2017-05-10','2022-05-09','Democratic','1953-01-24','Geoje','2025-01-01','Seoul','Kyung Hee','Kim',2,'Peace','Leader')," +
            "(13,'Recep','Erdogan','Turkey','2014-08-28','2025-01-01','AKP','1954-02-26','Istanbul','2025-01-01','Ankara','Marmara','Emine',4,'Reform','Powerful')," +
            "(14,'Pedro','Castillo','Peru','2021-07-28','2025-01-01','Free Peru','1969-10-19','Tacabamba','2025-01-01','Lima','National University','Lilia',2,'Education','Teacher')," +
            "(15,'Alberto','Fernández','Argentina','2019-12-10','2025-01-01','PJ','1959-04-02','Buenos Aires','2025-01-01','Buenos Aires','UBA','Fabiola',3,'Policy','Lawyer')," +
            "(16,'Gitanas','Nauseda','Lithuania','2019-07-12','2025-01-01','Independent','1964-05-19','Vilnius','2025-01-01','Vilnius','Vilnius University','Diana',2,'Economy','Banker')," +
            "(17,'Andrzej','Duda','Poland','2015-08-06','2025-01-01','PiS','1972-05-16','Kraków','2025-01-01','Warsaw','Jagiellonian','Agata',1,'Policy','Lawyer')," +
            "(18,'Sergio','Mattarella','Italy','2015-02-03','2025-01-01','Independent','1941-07-23','Palermo','2025-01-01','Rome','Sapienza','Laura',3,'Law','President'),"+
                    " (19,'Emmanuel','Macron','France','2017-05-14','2027-05-13','LREM','1977-12-21','Amiens','2025-01-01','Paris','Science Po','Brigitte',0,'Reform','Youngest')," +
                    " (20,'Angela','Merkel','Germany','2005-11-22','2021-12-08','CDU','1954-07-17','Hamburg','2025-01-01','Berlin','Physics','Unknown',0,'Chancellor','Powerful')," +
                    "(21,'Vladimir','Putin','Russia','2000-05-07','2008-05-07','United Russia','1952-10-07','Leningrad','2025-01-01','Moscow','Law','Lyudmila',2,'Leader','Strong')," +
                    "(22,'Xi','Jinping','China','2013-03-14','2025-01-01','CPC','1953-06-15','Beijing','2025-01-01','Beijing','Engineering','Peng',1,'Reform','Powerful')," +
                    "(23,'Narendra','Modi','India','2014-05-26','2025-01-01','BJP','1950-09-17','Vadnagar','2025-01-01','New Delhi','Gujarat University','Jashodaben',2,'Reform','Popular')," +
                    " (24,'Jair','Bolsonaro','Brazil','2019-01-01','2025-01-01','PSL','1955-03-21','Glicério','2025-01-01','Brasília','Unknown','Michelle',5,'Policy','Controversial')," +
                    "(25,'Justin','Trudeau','Canada','2015-11-04','2025-01-01','Liberal','1971-12-25','Ottawa','2025-01-01','Ottawa','McGill','Sophie',3,'Youth','Charismatic')," +
                    "(26,'Boris','Johnson','UK','2019-07-24','2022-09-06','Conservative','1964-06-19','New York','2025-01-01','London','Oxford','Carrie',2,'Brexit','Controversial')," +
                    "(27,'Moon','Jae-in','South Korea','2017-05-10','2022-05-09','Democratic','1953-01-24','Geoje','2025-01-01','Seoul','Kyung Hee','Kim',2,'Peace','Leader')," +
                    "(28,'Recep','Erdogan','Turkey','2014-08-28','2025-01-01','AKP','1954-02-26','Istanbul','2025-01-01','Ankara','Marmara','Emine',4,'Reform','Powerful')," +
                    "(29,'Pedro','Castillo','Peru','2021-07-28','2025-01-01','Free Peru','1969-10-19','Tacabamba','2025-01-01','Lima','National University','Lilia',2,'Education','Teacher')," +
                    "(30,'Alberto','Fernández','Argentina','2019-12-10','2025-01-01','PJ','1959-04-02','Buenos Aires','2025-01-01','Buenos Aires','UBA','Fabiola',3,'Policy','Lawyer')," +
                    "(31,'Gitanas','Nauseda','Lithuania','2019-07-12','2025-01-01','Independent','1964-05-19','Vilnius','2025-01-01','Vilnius','Vilnius University','Diana',2,'Economy','Banker')," +
                    "(32,'Andrzej','Duda','Poland','2015-08-06','2025-01-01','PiS','1972-05-16','Kraków','2025-01-01','Warsaw','Jagiellonian','Agata',1,'Policy','Lawyer')," +
                    "(33,'Sergio','Mattarella','Italy','2015-02-03','2025-01-01','Independent','1941-07-23','Palermo','2025-01-01','Rome','Sapienza','Laura',3,'Law','President'),"+

                    " (34,'Emmanuel','Macron','France','2017-05-14','2027-05-13','LREM','1977-12-21','Amiens','2025-01-01','Paris','Science Po','Brigitte',0,'Reform','Youngest')," +
                    " (35,'Angela','Merkel','Germany','2005-11-22','2021-12-08','CDU','1954-07-17','Hamburg','2025-01-01','Berlin','Physics','Unknown',0,'Chancellor','Powerful')," +
                    "(36,'Vladimir','Putin','Russia','2000-05-07','2008-05-07','United Russia','1952-10-07','Leningrad','2025-01-01','Moscow','Law','Lyudmila',2,'Leader','Strong')," +
                    "(37,'Xi','Jinping','China','2013-03-14','2025-01-01','CPC','1953-06-15','Beijing','2025-01-01','Beijing','Engineering','Peng',1,'Reform','Powerful')," +
                    "(38,'Narendra','Modi','India','2014-05-26','2025-01-01','BJP','1950-09-17','Vadnagar','2025-01-01','New Delhi','Gujarat University','Jashodaben',2,'Reform','Popular')," +
                    " (39,'Jair','Bolsonaro','Brazil','2019-01-01','2025-01-01','PSL','1955-03-21','Glicério','2025-01-01','Brasília','Unknown','Michelle',5,'Policy','Controversial')," +
                    "(40,'Justin','Trudeau','Canada','2015-11-04','2025-01-01','Liberal','1971-12-25','Ottawa','2025-01-01','Ottawa','McGill','Sophie',3,'Youth','Charismatic')," +
                    "(41,'Boris','Johnson','UK','2019-07-24','2022-09-06','Conservative','1964-06-19','New York','2025-01-01','London','Oxford','Carrie',2,'Brexit','Controversial')," +
                    "(42,'Moon','Jae-in','South Korea','2017-05-10','2022-05-09','Democratic','1953-01-24','Geoje','2025-01-01','Seoul','Kyung Hee','Kim',2,'Peace','Leader')," +
                    "(43,'Recep','Erdogan','Turkey','2014-08-28','2025-01-01','AKP','1954-02-26','Istanbul','2025-01-01','Ankara','Marmara','Emine',4,'Reform','Powerful')," +
                    "(44,'Pedro','Castillo','Peru','2021-07-28','2025-01-01','Free Peru','1969-10-19','Tacabamba','2025-01-01','Lima','National University','Lilia',2,'Education','Teacher')," +
                    "(45,'Alberto','Fernández','Argentina','2019-12-10','2025-01-01','PJ','1959-04-02','Buenos Aires','2025-01-01','Buenos Aires','UBA','Fabiola',3,'Policy','Lawyer')," +
                    "(46,'Gitanas','Nauseda','Lithuania','2019-07-12','2025-01-01','Independent','1964-05-19','Vilnius','2025-01-01','Vilnius','Vilnius University','Diana',2,'Economy','Banker')," +
                    "(47,'Andrzej','Duda','Poland','2015-08-06','2025-01-01','PiS','1972-05-16','Kraków','2025-01-01','Warsaw','Jagiellonian','Agata',1,'Policy','Lawyer')," +
                    "(48,'Sergio','Mattarella','Italy','2015-02-03','2025-01-01','Independent','1941-07-23','Palermo','2025-01-01','Rome','Sapienza','Laura',3,'Law','President'),"+

                  " (49,'Emmanuel','Macron','France','2017-05-14','2027-05-13','LREM','1977-12-21','Amiens','2025-01-01','Paris','Science Po','Brigitte',0,'Reform','Youngest')," +
                    " (50,'Angela','Merkel','Germany','2005-11-22','2021-12-08','CDU','1954-07-17','Hamburg','2025-01-01','Berlin','Physics','Unknown',0,'Chancellor','Powerful')," +
                    "(51,'Vladimir','Putin','Russia','2000-05-07','2008-05-07','United Russia','1952-10-07','Leningrad','2025-01-01','Moscow','Law','Lyudmila',2,'Leader','Strong')," +
                    "(52,'Xi','Jinping','China','2013-03-14','2025-01-01','CPC','1953-06-15','Beijing','2025-01-01','Beijing','Engineering','Peng',1,'Reform','Powerful')," +
                    "(53,'Narendra','Modi','India','2014-05-26','2025-01-01','BJP','1950-09-17','Vadnagar','2025-01-01','New Delhi','Gujarat University','Jashodaben',2,'Reform','Popular')," +
                    " (54,'Jair','Bolsonaro','Brazil','2019-01-01','2025-01-01','PSL','1955-03-21','Glicério','2025-01-01','Brasília','Unknown','Michelle',5,'Policy','Controversial')," +
                    "(55,'Justin','Trudeau','Canada','2015-11-04','2025-01-01','Liberal','1971-12-25','Ottawa','2025-01-01','Ottawa','McGill','Sophie',3,'Youth','Charismatic')," +
                    "(56,'Boris','Johnson','UK','2019-07-24','2022-09-06','Conservative','1964-06-19','New York','2025-01-01','London','Oxford','Carrie',2,'Brexit','Controversial')," +
                    "(57,'Moon','Jae-in','South Korea','2017-05-10','2022-05-09','Democratic','1953-01-24','Geoje','2025-01-01','Seoul','Kyung Hee','Kim',2,'Peace','Leader')," +
                    "(58,'Recep','Erdogan','Turkey','2014-08-28','2025-01-01','AKP','1954-02-26','Istanbul','2025-01-01','Ankara','Marmara','Emine',4,'Reform','Powerful')," +
                    "(59,'Pedro','Castillo','Peru','2021-07-28','2025-01-01','Free Peru','1969-10-19','Tacabamba','2025-01-01','Lima','National University','Lilia',2,'Education','Teacher')," +
                    "(60,'Alberto','Fernández','Argentina','2019-12-10','2025-01-01','PJ','1959-04-02','Buenos Aires','2025-01-01','Buenos Aires','UBA','Fabiola',3,'Policy','Lawyer')," +
                    "(61,'Gitanas','Nauseda','Lithuania','2019-07-12','2025-01-01','Independent','1964-05-19','Vilnius','2025-01-01','Vilnius','Vilnius University','Diana',2,'Economy','Banker')," +
                    "(62,'Andrzej','Duda','Poland','2015-08-06','2025-01-01','PiS','1972-05-16','Kraków','2025-01-01','Warsaw','Jagiellonian','Agata',1,'Policy','Lawyer')," +
                    "(63,'Sergio','Mattarella','Italy','2015-02-03','2025-01-01','Independent','1941-07-23','Palermo','2025-01-01','Rome','Sapienza','Laura',3,'Law','President'),"+
                    " (64,'Emmanuel','Macron','France','2017-05-14','2027-05-13','LREM','1977-12-21','Amiens','2025-01-01','Paris','Science Po','Brigitte',0,'Reform','Youngest')," +
                    " (65,'Angela','Merkel','Germany','2005-11-22','2021-12-08','CDU','1954-07-17','Hamburg','2025-01-01','Berlin','Physics','Unknown',0,'Chancellor','Powerful')," +
                    "(66,'Vladimir','Putin','Russia','2000-05-07','2008-05-07','United Russia','1952-10-07','Leningrad','2025-01-01','Moscow','Law','Lyudmila',2,'Leader','Strong')," +
                    "(67,'Xi','Jinping','China','2013-03-14','2025-01-01','CPC','1953-06-15','Beijing','2025-01-01','Beijing','Engineering','Peng',1,'Reform','Powerful')," +
                    "(68,'Narendra','Modi','India','2014-05-26','2025-01-01','BJP','1950-09-17','Vadnagar','2025-01-01','New Delhi','Gujarat University','Jashodaben',2,'Reform','Popular')," +
                    " (69,'Jair','Bolsonaro','Brazil','2019-01-01','2025-01-01','PSL','1955-03-21','Glicério','2025-01-01','Brasília','Unknown','Michelle',5,'Policy','Controversial')," +
                    "(70,'Justin','Trudeau','Canada','2015-11-04','2025-01-01','Liberal','1971-12-25','Ottawa','2025-01-01','Ottawa','McGill','Sophie',3,'Youth','Charismatic')," +
                    "(71,'Boris','Johnson','UK','2019-07-24','2022-09-06','Conservative','1964-06-19','New York','2025-01-01','London','Oxford','Carrie',2,'Brexit','Controversial')," +
                    "(72,'Moon','Jae-in','South Korea','2017-05-10','2022-05-09','Democratic','1953-01-24','Geoje','2025-01-01','Seoul','Kyung Hee','Kim',2,'Peace','Leader')," +
                    "(73,'Recep','Erdogan','Turkey','2014-08-28','2025-01-01','AKP','1954-02-26','Istanbul','2025-01-01','Ankara','Marmara','Emine',4,'Reform','Powerful')," +
                    "(74,'Pedro','Castillo','Peru','2021-07-28','2025-01-01','Free Peru','1969-10-19','Tacabamba','2025-01-01','Lima','National University','Lilia',2,'Education','Teacher')," +
                    "(75,'Alberto','Fernández','Argentina','2019-12-10','2025-01-01','PJ','1959-04-02','Buenos Aires','2025-01-01','Buenos Aires','UBA','Fabiola',3,'Policy','Lawyer')";

            Statement statement = connection.createStatement();
            int rowAffected = statement.executeUpdate(sql);
            System.out.println("rowsAffected :" + rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}
