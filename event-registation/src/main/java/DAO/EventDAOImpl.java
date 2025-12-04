package DAO;

import DTO.EventDTO;
import com.xworkz.event.DBConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EventDAOImpl implements EventDAO {

    @Override
    public void save(EventDTO eventDTO) {
        String insertQuery = "INSERT INTO EventRegister(name,email,phone,type,city) VALUES(?,?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    DBConstants.URL.getProp(),
                    DBConstants.USERNAME.getProp(),
                    DBConstants.Secret.getProp());

             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        preparedStatement.setString(1,eventDTO.getName());
        preparedStatement.setString(2, eventDTO.getEmail());
            preparedStatement.setString(3, eventDTO.getPhone());
            preparedStatement.setString(4, eventDTO.getType());
            preparedStatement.setString(5, eventDTO.getCity());

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows inserted: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
