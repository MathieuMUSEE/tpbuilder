package org.example.builder;

public class Demo {

    public static void main(String[] args) {

        Car car = new Car.CarBuilder("SUV", "Hybride", 7).build();

        Car car1 = new Car
                .CarBuilder("SUV", "Hybride", 7)
                .couleur("Bleu")
                .gps(true)
                .toitOuvrant(true)
                .build();

        System.out.println(car1);


    }
}
