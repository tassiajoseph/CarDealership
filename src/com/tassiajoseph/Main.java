package com.tassiajoseph;

public class Main {

    public static void main(String[] args) {
        Car subaru = new Car("Subaru", "Legacy", 200_000, 0.5F);
        Car nissan  = new Car("Nissan", "Altima", 200_000, 0.25F);
        Car toyota = new Car("Toyota", "Camry", 100_000, 0.75F);

        Dealership genericDealership = new Dealership("Generic Dealership");

        // add to the "currentAvailableCars" ArrayList
        genericDealership.currentCarsAvailable.add(subaru);
        genericDealership.currentCarsAvailable.add(nissan);
        genericDealership.currentCarsAvailable.add(toyota);

        System.out.println(genericDealership.currentCarsAvailable.get(0));


    }
}


