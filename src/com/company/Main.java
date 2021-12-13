package com.company;

public class Main {

    public static void main(String[] args) {
    Car porsche = new Car();
    Car holden = new Car();
    porsche.setModel("911");
    porsche.setEngine("4.2 litres");

        System.out.println("Model is " + porsche.getModel());
        System.out.println("Engine is " + porsche.getEngine());

    }
}
