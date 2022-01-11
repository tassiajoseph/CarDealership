package com.tassiajoseph;

import java.util.ArrayList;

public class Dealership {

    public String dealershipName;
    public ArrayList<Car> currentCarsAvailable[] = new Car[];
    public ArrayList<Car> currentCarsBooked = new Car[];

    public Dealership(String dealershipName) {
        this.dealershipName = dealershipName;

    }


}
