package com.xworkz.coffee.service;

import com.xworkz.coffee.DTO.CustomerDTO;
import com.xworkz.coffee.DTO.CustomerFeedbackDTO;

public interface CustomerFeedbackService {
    void validateAndSave(CustomerFeedbackDTO customerFeedbackDTO);

}
