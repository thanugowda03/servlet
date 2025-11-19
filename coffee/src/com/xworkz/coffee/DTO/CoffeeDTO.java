package com.xworkz.coffee.DTO;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeDTO implements Serializable,Comparable<String> {
    private String type;
    private String  price;
    private String  quantity;
    private String farmer;
    private String location;


    public CoffeeDTO(String type,String price,String quantity,String farmer,String location){
     this.type=type;
     this.price=price;
     this.quantity=quantity;
     this.farmer=farmer;
     this.location=location;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeDTO coffeeDTO = (CoffeeDTO) o;
        return Objects.equals(type, coffeeDTO.type) && Objects.equals(price, coffeeDTO.price) && Objects.equals(quantity, coffeeDTO.quantity) && Objects.equals(farmer, coffeeDTO.farmer) && Objects.equals(location, coffeeDTO.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, quantity, farmer, location);
    }

    @Override
    public String toString() {
        return "CoffeeDTO{" +
                "coffeeType='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", farmer='" + farmer + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
