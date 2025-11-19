package com.xworkz.coffee.service;

import com.xworkz.coffee.DTO.CoffeeDTO;
import com.xworkz.coffee.DTO.CustomerDTO;

public interface CustomerService {
    void validateAndSave(CustomerDTO customerDTO);

}
