package com.example.Dependency_Injection;


import org.springframework.stereotype.Component;

@Component
public class Water {

    int amountOfWater =10;

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public void setAmountOfWater(int amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public void drink(){
        System.out.println("I am drinking water "+ amountOfWater +" Water");

    }
}
