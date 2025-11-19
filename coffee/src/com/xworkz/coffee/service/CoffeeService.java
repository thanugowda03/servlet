package com.xworkz.coffee.service;

import com.xworkz.coffee.DTO.CoffeeDTO;

public interface CoffeeService {
    void validateAndSave(CoffeeDTO coffeeDTO);
}
