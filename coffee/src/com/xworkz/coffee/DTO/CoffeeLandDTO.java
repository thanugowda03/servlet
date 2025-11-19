package com.xworkz.coffee.DTO;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeLandDTO implements Serializable,Comparable<String> {

    private String size;
    private  String plants;
    private  String yield;
    private String expenditure;
    private String profit;
    private String fertilizer;

    public CoffeeLandDTO(String size,String plants,String yield,String expenditure,String profit,String fertilizer){
        this.size=size;
        this.plants=plants;
        this.yield=yield;
        this.expenditure=expenditure;
        this.profit=profit;
        this.fertilizer=fertilizer;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeLandDTO that = (CoffeeLandDTO) o;
        return Objects.equals(size, that.size) && Objects.equals(plants, that.plants) && Objects.equals(yield, that.yield) && Objects.equals(expenditure, that.expenditure) && Objects.equals(profit, that.profit) && Objects.equals(fertilizer, that.fertilizer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size,plants, yield, expenditure, profit, fertilizer);
    }

    @Override
    public String toString() {
        return "CoffeeLandDTO{" +
                "size='" + size + '\'' +
                ", plants='" + plants + '\'' +
                ", yield='" + yield + '\'' +
                ", expenditure='" + expenditure + '\'' +
                ", profit='" + profit + '\'' +
                ", fertilizer='" + fertilizer + '\'' +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
