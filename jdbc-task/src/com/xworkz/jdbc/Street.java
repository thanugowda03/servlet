package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Street {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "tanu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);
            String sql = "insert into street values" +
                    "(2,'Brigade Road','Bengaluru','Karnataka','560001','India','Road',800.0,3,'High','YES','YES','Good')," +
                    "(3,'Avenue Road','Bengaluru','Karnataka','560002','India','Road',650.0,2,'High','NO','YES','Fair')," +
                    "(4,'Lavelle Road','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','YES','YES','Good')," +
                    "(5,'JC Road','Bengaluru','Karnataka','560002','India','Road',750.0,2,'Medium','NO','YES','Good')," +
                    "(6,'Cunningham Road','Bengaluru','Karnataka','560052','India','Road',600.0,2,'Medium','NO','YES','Good')," +
                    "(7,'Mosque Road','Bengaluru','Karnataka','560084','India','Road',400.0,2,'High','YES','YES','Fair')," +
                    "(8,'Bannerghatta Road','Bengaluru','Karnataka','560076','India','Road',5000.0,4,'High','NO','YES','Poor')," +
                    "(9,'Sarjapur Road','Bengaluru','Karnataka','560035','India','Road',3000.0,4,'High','NO','NO','Poor')," +
                    "(10,'Outer Ring Road','Bengaluru','Karnataka','560071','India','Road',32000.0,6,'High','NO','YES','Fair'),"+

                    "(11,'Residency Road','Bengaluru','Karnataka','560025','India','Road',900.0,2,'Medium','YES','YES','Good')," +
                    "(12,'St. Mark’s Road','Bengaluru','Karnataka','560001','India','Road',1100.0,3,'Medium','YES','YES','Good')," +
                    "(13,'Church Street','Bengaluru','Karnataka','560001','India','Road',750.0,2,'High','YES','YES','Fair')," +
                    "(14,'Infantry Road','Bengaluru','Karnataka','560001','India','Road',650.0,2,'Medium','YES','YES','Good')," +
                    "(15,'Brigade Gateway Road','Bengaluru','Karnataka','560025','India','Road',850.0,3,'High','YES','YES','Fair')," +
                    "(16,'Kasturba Road','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','NO','YES','Good')," +
                    "(17,'Queens Road','Bengaluru','Karnataka','560001','India','Road',600.0,2,'Medium','NO','YES','Fair')," +
                    "(18,'Richmond Road','Bengaluru','Karnataka','560025','India','Road',750.0,3,'High','YES','YES','Good')," +
                    "(19,'Cunningham Road Extension','Bengaluru','Karnataka','560052','India','Road',500.0,2,'Medium','NO','YES','Good')," +
                    "(20,'Residency Extension','Bengaluru','Karnataka','560025','India','Road',400.0,2,'Medium','YES','YES','Fair')," +
                    "(21,'Vittal Mallya Road','Bengaluru','Karnataka','560001','India','Road',1000.0,4,'High','YES','YES','Good')," +
                    "(22,'Brigade Circle Road','Bengaluru','Karnataka','560001','India','Road',850.0,3,'High','YES','YES','Fair')," +
                    "(23,'Queens Circle Road','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','NO','YES','Good')," +
                    "(24,'Lavelle Circle Road','Bengaluru','Karnataka','560001','India','Road',600.0,2,'Medium','YES','YES','Fair')," +
                    "(25,'Church Street Extension','Bengaluru','Karnataka','560001','India','Road',750.0,2,'High','YES','YES','Good'),"+


                    "(26,'M G Road Extension','Bengaluru','Karnataka','560001','India','Road',1200.0,4,'High','YES','YES','Fair')," +
                    "(27,'Brigade Road Extension','Bengaluru','Karnataka','560001','India','Road',800.0,3,'High','YES','YES','Good')," +
                    "(28,'Avenue Road Extension','Bengaluru','Karnataka','560002','India','Road',650.0,2,'High','NO','YES','Fair')," +
                    "(29,'Lavelle Road Extension','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','YES','YES','Good')," +
                    "(30,'JC Road Extension','Bengaluru','Karnataka','560002','India','Road',750.0,2,'Medium','NO','YES','Good')," +
                    "(31,'Cunningham Road North','Bengaluru','Karnataka','560052','India','Road',600.0,2,'Medium','NO','YES','Good')," +
                    "(32,'Mosque Road East','Bengaluru','Karnataka','560084','India','Road',400.0,2,'High','YES','YES','Fair')," +
                    "(33,'Bannerghatta Road South','Bengaluru','Karnataka','560076','India','Road',5000.0,4,'High','NO','YES','Poor')," +
                    "(34,'Sarjapur Road South','Bengaluru','Karnataka','560035','India','Road',3000.0,4,'High','NO','NO','Poor')," +
                    "(35,'Outer Ring Road West','Bengaluru','Karnataka','560071','India','Road',32000.0,6,'High','NO','YES','Fair'),"+
                    "(36,'Residency Road East','Bengaluru','Karnataka','560025','India','Road',900.0,2,'Medium','YES','YES','Good')," +
                    "(37,'St. Mark’s Road North','Bengaluru','Karnataka','560001','India','Road',1100.0,3,'Medium','YES','YES','Good')," +
                    "(38,'Church Street West','Bengaluru','Karnataka','560001','India','Road',750.0,2,'High','YES','YES','Fair')," +
                    "(39,'Infantry Road North','Bengaluru','Karnataka','560001','India','Road',650.0,2,'Medium','YES','YES','Good')," +
                    "(40,'Brigade Gateway Road East','Bengaluru','Karnataka','560025','India','Road',850.0,3,'High','YES','YES','Fair')," +
                    "(41,'Kasturba Road North','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','NO','YES','Good')," +
                    "(42,'Queens Road North','Bengaluru','Karnataka','560001','India','Road',600.0,2,'Medium','NO','YES','Fair')," +
                    "(43,'Richmond Road East','Bengaluru','Karnataka','560025','India','Road',750.0,3,'High','YES','YES','Good')," +
                    "(44,'Cunningham Road South','Bengaluru','Karnataka','560052','India','Road',500.0,2,'Medium','NO','YES','Good')," +
                    "(45,'Residency Extension South','Bengaluru','Karnataka','560025','India','Road',400.0,2,'Medium','YES','YES','Fair')," +
                    "(46,'Vittal Mallya Road West','Bengaluru','Karnataka','560001','India','Road',1000.0,4,'High','YES','YES','Good')," +
                    "(47,'Brigade Circle Road East','Bengaluru','Karnataka','560001','India','Road',850.0,3,'High','YES','YES','Fair')," +
                    "(48,'Queens Circle Road East','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','NO','YES','Good')," +
                    "(49,'Lavelle Circle Road East','Bengaluru','Karnataka','560001','India','Road',600.0,2,'Medium','YES','YES','Fair')," +
                    "(50,'Church Street Extension West','Bengaluru','Karnataka','560001','India','Road',750.0,2,'High','YES','YES','Good')," +
                    "(51,'M G Road South','Bengaluru','Karnataka','560001','India','Road',1200.0,4,'High','YES','YES','Fair'),"+

                    "(52,'Brigade Road','Bengaluru','Karnataka','560001','India','Road',800.0,3,'High','YES','YES','Good')," +
                    "(53,'Avenue Road North','Bengaluru','Karnataka','560002','India','Road',650.0,2,'High','NO','YES','Fair')," +
                    "(54,'Lavelle Road South','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','YES','YES','Good')," +
                    "(55,'JC Road South','Bengaluru','Karnataka','560002','India','Road',750.0,2,'Medium','NO','YES','Good')," +
                    "(56,'Cunningham Road West','Bengaluru','Karnataka','560052','India','Road',600.0,2,'Medium','NO','YES','Good')," +
                    "(57,'Mosque Road West','Bengaluru','Karnataka','560084','India','Road',400.0,2,'High','YES','YES','Fair')," +
                    "(58,'Bannerghatta Road North','Bengaluru','Karnataka','560076','India','Road',5000.0,4,'High','NO','YES','Poor')," +
                    "(59,'Sarjapur Road North','Bengaluru','Karnataka','560035','India','Road',3000.0,4,'High','NO','NO','Poor')," +
                    "(60,'Outer Ring Road East','Bengaluru','Karnataka','560071','India','Road',32000.0,6,'High','NO','YES','Fair')," +
                    "(61,'Residency Road West','Bengaluru','Karnataka','560025','India','Road',900.0,2,'Medium','YES','YES','Good')," +
                    "(62,'St. Mark’s Road South','Bengaluru','Karnataka','560001','India','Road',1100.0,3,'Medium','YES','YES','Good')," +
                    "(63,'Church Street East','Bengaluru','Karnataka','560001','India','Road',750.0,2,'High','YES','YES','Fair')," +
                    "(64,'Infantry Road South','Bengaluru','Karnataka','560001','India','Road',650.0,2,'Medium','YES','YES','Good')," +
                    "(65,'Brigade Gateway Road West','Bengaluru','Karnataka','560025','India','Road',850.0,3,'High','YES','YES','Fair')."+
                    "(66,'Kasturba Road South','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','NO','YES','Good')," +
                    "(67,'Queens Road South','Bengaluru','Karnataka','560001','India','Road',600.0,2,'Medium','NO','YES','Fair')," +
                    "(68,'Richmond Road West','Bengaluru','Karnataka','560025','India','Road',750.0,3,'High','YES','YES','Good')," +
                    "(69,'Cunningham Road East','Bengaluru','Karnataka','560052','India','Road',500.0,2,'Medium','NO','YES','Good')," +
                    "(70,'Residency Extension North','Bengaluru','Karnataka','560025','India','Road',400.0,2,'Medium','YES','YES','Fair')," +
                    "(71,'Vittal Mallya Road East','Bengaluru','Karnataka','560001','India','Road',1000.0,4,'High','YES','YES','Good')," +
                    "(72,'Brigade Circle Road West','Bengaluru','Karnataka','560001','India','Road',850.0,3,'High','YES','YES','Fair')," +
                    "(73,'Queens Circle Road West','Bengaluru','Karnataka','560001','India','Road',700.0,2,'Medium','NO','YES','Good')," +
                    "(74,'Lavelle Circle Road West','Bengaluru','Karnataka','560001','India','Road',600.0,2,'Medium','YES','YES','Fair')," +
                    "(75,'Church Street North','Bengaluru','Karnataka','560001','India','Road',750.0,2,'High','YES','YES','Good')";




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
