package Service;

import DAO.EventDAO;
import DAO.EventDAOImpl;
import DTO.EventDTO;
import com.xworkz.event.exception.DataInvalidException;

import javax.xml.bind.DataBindingException;

public class EventImpl implements EventRegistrationService {

    private EventDAO eventDAO=new EventDAOImpl();

    @Override
    public void validateAndSave(EventDTO eventDTO) throws DataInvalidException {
        boolean isInValid = false;

        if (eventDTO.getName() == null || eventDTO.getName().isEmpty()) {
            System.err.println("Invalid client name");
            isInValid = true;
        }
        if (eventDTO.getEmail() == null || eventDTO.getEmail().isEmpty()) {
            System.err.println("Invalid Email");
            isInValid = true;
        }
        if (eventDTO.getPhone() == null || eventDTO.getPhone().isEmpty()) {
            System.err.println("Invalid phone number");
            isInValid = true;
        }
        if (eventDTO.getType() == null || eventDTO.getType().isEmpty()) {
            System.err.println("Invalid event type");
            isInValid = true;
        }
        if (eventDTO.getCity() == null || eventDTO.getCity().isEmpty()) {
            System.err.println("Invalid city");
            isInValid = true;
        }
        if (isInValid) {
            throw new DataInvalidException();

        }
        else {
            eventDAO.save(eventDTO);
        }
    }
}

