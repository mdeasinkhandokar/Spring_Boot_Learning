package com.example.Dependency_Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

    private  Air air;
    private   Water water;
    private  Food food;


    private  Cyclone cyclone;


    @Autowired
    public void setCyclone(Cyclone cyclone) {
        this.cyclone = cyclone;
    }

    Home home;

//    public Human(Air air, Water water, Food food) {
//        this.air = air;
//        this.water = water;
//        this.food = food;
//
//
//
//    }

    public void setHome(Home home) {
        this.home = home;
    }

        @Autowired
    public void setAir(Air air) {
        this.air = air;
    }
    @Autowired
    public void setFood(Food food) {
        this.food= food;
    }

    @Autowired
    public void setWater(Water water) {
        this.water = water;
    }

    public void live(){

//        modifyWaterObj();

        air.breath();
        water.drink();

        if(air== null || water == null|| food == null){
            System.out.println("Dead . I can't live.");
        }
        else{
            System.out.println("Alive . I am living my life. ");


        }



    }

//    public void modifyWaterObj(){
//        Water waterObj =  new Water();
//        waterObj.setAmountOfWater(10000);
//        this.water= waterObj;
//    }


}
