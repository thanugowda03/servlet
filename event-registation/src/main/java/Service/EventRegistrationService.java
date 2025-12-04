package Service;

import DTO.EventDTO;
import com.xworkz.event.exception.DataInvalidException;

public interface EventRegistrationService {
    void validateAndSave(EventDTO eventDTO) throws DataInvalidException;

}
