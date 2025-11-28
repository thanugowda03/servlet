package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Sweet {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "tanu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);
            String sql = "insert into sweet values" +
                    "(2,'Rasgulla','BS','Milk, Sugar',5.00,0.40,'KC Das'),"+
                    "(3,'Gulab Jamun','MS','Khoya, Sugar',6.50,0.45,'A2B'),"+
                    "(4,'Kaju Katli','CS','Cashew, Sugar',9.00,0.30,'Sri Krishna')," +
                    "(5,'Jalebi','FS','Flour, Sugar',4.50,0.40,'Bikanervala')," +
                    "(6,'Badam Halwa','HW','Badam, Ghee',8.25,0.35,'A2B')," +
                    "(7,'Motichoor Laddu','LD','Besan, Sugar',6.75,0.50,'Anand Sweets')," +
                    "(8,'Boondi Laddu','LD','Boondi, Sugar',5.50,0.45,'Sri Manjunath')," +
                    "(9,'Soan Papdi','SP','Gram, Sugar',6.00,0.50,'Kanti Sweets')," +
                    "(10,'Besan Laddu','LD','Besan, Ghee',6.25,0.40,'Kanti Sweets'),"+

                    "(11,'Kesar Peda','PD','Milk, Kesar',7.75,0.30,'Anand Sweets'),"+
                    "(12,'Milk Cake','MC','Milk, Sugar',7.50,0.35,'Sri Krishna'),"+
                    "(13,'Dry Fruit Laddu','DL','Dry Fruits',9.50,0.25,'A2B'),"+
                    "(14,'Cham Cham','BS','Milk Solids',5.50,0.40,'KC Das'),"+
                    "(15,'Sandesh','BS','Milk, Sugar',5.75,0.35,'KC Das'),"+
                    "(16,'Rabri','MS','Milk, Sugar',6.75,0.30,'Bikanervala'),"+
                    "(17,'Malpua','FS','Flour, Sugar',4.75,0.40,'Bikanervala'),"+
                    "(18,'Kesar Jalebi','FS','Flour, Kesar',5.00,0.35,'Sri Manjunath'),"+
                    "(19,'Carrot Halwa','HW','Carrot, Milk',6.50,0.40,'A2B'),"+
                    "(20,'Dry Jamun','MS','Khoya, Sugar',6.25,0.40,'Kanti Sweets'),"+

                    "(21,'Mawa Burfi','MB','Milk, Sugar',7.00,0.35,'Kanti Sweets'),"+
                    "(22,'Pineapple Halwa','HW','Pineapple',5.50,0.45,'Sri Mylari'),"+
                    "(23,'Kesari Bath','KB','Rava, Ghee',4.50,0.50,'Brahmins Cafe'),"+
                    "(24,'Obbattu','OB','Dal, Jaggery',3.50,0.40,'Holige Mane'),"+
                    "(25,'Coconut Burfi','CB','Coconut',5.75,0.40,'Sri Manjunath'),"+
                    "(26,'Dry Fruit Halwa','HW','Dry Fruits',8.75,0.30,'Anand Sweets'),"+
                    "(27,'Mango Barfi','MB','Mango, Milk',6.25,0.40,'Kanti Sweets'),"+
                    "(28,'Pista Roll','PR','Pista, Milk',9.50,0.25,'Anand Sweets'),"+
                    "(29,'Kesari Laddu','LD','Sugar, Ghee',5.75,0.40,'Sri Krishna'),"+
                    "(30,'Rava Laddu','LD','Rava, Sugar',5.00,0.40,'Kanti Sweets'),"+

                    "(31,'Anjeer Roll','AR','Figs, Dry Fruit',9.75,0.30,'Anand Sweets'),"+
                    "(32,'Malai Burfi','MB','Milk, Cream',6.50,0.35,'A2B'),"+
                    "(33,'Kalakand','KK','Milk, Sugar',7.25,0.35,'Sri Krishna'),"+
                    "(34,'Kheer Kadam','KK','Milk, Sugar',6.00,0.30,'KC Das'),"+
                    "(35,'Chum Chum','BS','Chhena',5.25,0.40,'KC Das'),"+
                    "(36,'Peda','PD','Milk, Sugar',5.75,0.30,'Kanti Sweets'),"+
                    "(37,'Kesari Pak','KP','Ghee, Sugar',8.00,0.35,'A2B'),"+
                    "(38,'Dry Fruit Pak','DP','Dry Fruits',9.25,0.25,'Anand Sweets'),"+
                    "(39,'Badusha','BS','Flour, Sugar',5.00,0.35,'Kanti Sweets'),"+
                    "(40,'Khova Noodles','KN','Milk Solids',5.50,0.40,'Sri Manjunath'),"+

                   "(41,'Kaju Roll','KR','Cashew',9.00,0.30,'Anand Sweets'),"+
                    "(42,'Kheer','KH','Milk, Rice',4.50,0.30,'Brahmins Cafe'),"+
                    "(43,'Coconut Laddu','CL','Coconut',5.50,0.40,'Sri Manjunath'),"+
                    "(44,'Dates Laddu','DL','Dates, Nuts',8.50,0.25,'A2B'),"+
                    "(45,'Rose Barfi','RB','Milk, Rose',6.50,0.30,'Kanti Sweets'),"+
                    "(46,'Chocolate Barfi','CB','Cocoa, Milk',6.75,0.30,'Anand Sweets'),"+
                    "(47,'Ghee Laddu','GL','Ghee, Sugar',7.25,0.30,'Sri Krishna'),"+
                    "(48,'Coconut Holige','CH','Coconut',3.75,0.40,'Holige Mane'),"+
                    "(49,'Dry Fruit Peda','DP','Dry Fruits',8.25,0.25,'Anand Sweets'),"+
                    "(50,'Banana Halwa','BH','Banana, Sugar',5.25,0.40,'Kanti Sweets'),"+

                   "(51,'Mango Halwa','MH','Mango, Sugar',5.75,0.40,'A2B'),"+
                    "(52,'Pineapple Kesari','PK','Pineapple',4.25,0.50,'Brahmins Cafe'),"+
                    "(53,'Dry Fruit Burfi','DF','Mixed Nuts',9.50,0.25,'Anand Sweets'),"+
                    "(54,'Coconut Mysore Pak','CM','Coconut',7.50,0.30,'Sri Krishna'),"+
                    "(55,'Milk Mysore Pak','MM','Milk, Ghee',7.00,0.35,'A2B'),"+
                    "(56,'Orange Barfi','OB','Orange, Milk',6.25,0.30,'Kanti Sweets'),"+
                    "(57,'Badam Katli','BK','Almond, Sugar',9.75,0.25,'Anand Sweets'),"+
                    "(58,'Peda Roll','PR','Milk, Sugar',6.00,0.30,'Kanti Sweets'),"+
                    "(59,'Choco Laddu','CL','Cocoa, Milk',5.50,0.40,'Sri Manjunath'),"+
                    "(60,'Kesari ChamCham','KC','Milk, Kesar',6.50,0.35,'KC Das'),"+

                    "(61,'Black Jamun','BJ','Milk Solids',5.75,0.40,'Kanti Sweets'),"+
                    "(62,'Dry Gulab Jamun','DG','Milk Solids',6.50,0.35,'Sri Krishna'),"+
                    "(63,'Dry Fruit Modak','DM','Dry Fruits',8.50,0.25,'Anand Sweets'),"+
                    "(64,'Coconut Modak','CM','Coconut',6.25,0.30,'A2B'),"+
                    "(65,'Khoya Modak','KM','Milk Solids',7.00,0.30,'Kanti Sweets'),"+
                    "(66,'Boondi Pak','BP','Boondi, Ghee',6.75,0.35,'Sri Krishna'),"+
                    "(67,'Dry Fruit Kesari','DK','Dry Fruits',7.50,0.30,'Anand Sweets'),"+
                    "(68,'Choco Barfi','CB','Chocolate',6.50,0.30,'A2B'),"+
                    "(69,'Malai Peda','MP','Milk, Cream',6.75,0.30,'Kanti Sweets'),"+
                    "(70,'Honey Laddu','HL','Honey, Nuts',7.25,0.25,'Sri Manjunath'),"+

                    "(71,'Til Laddu','TL','Sesame, Jaggery',5.50,0.40,'A2B'),"+
                    "(72,'Kesar Barfi','KB','Milk, Kesar',7.75,0.30,'Anand Sweets'),"+
                    "(73,'Milk Burfi','MB','Milk, Sugar',6.00,0.35,'Kanti Sweets'),"+
                    "(74,'Dry Fruit Cake','DC','Nuts, Milk',9.50,0.25,'Anand Sweets'),"+
                    "(75,'Mango Peda','MP','Mango, Milk',6.25,0.30,'Sri Krishna')";


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