package com.codecool.freestyle.mesolo;

public class Car extends Vehicle{

    public static void main(String[] args) {

        Car porsche911 = new Car();
        Car porscheBoxster = new Car();
        Car mercedesG300 = new Car();
        

        //Porsche 911
        porsche911.setCar("Porsche 911", "Coupe", 3, 2.5, 300, 3, 5, 7);
        if(porsche911.getNumOfAvailable()>0){
            porsche911.setAvailable(true);
        }
        if(porsche911.getLastTimeServiced() < 5){
            porsche911.goToService();
            porsche911.setLastTimeServiced(0);
        }


        //Porsche Boxster
        porscheBoxster.setCar("Porsche Boxster", "Cabriolet", 3, 2.0, 200, 8,10, 8);
        if(porscheBoxster.getNumOfAvailable()>0){
            porscheBoxster.setAvailable(true);
        }
        if(porscheBoxster.getLastTimeServiced() < 5){
            porscheBoxster.goToService();
            porscheBoxster.setLastTimeServiced(0);
        }


        //Mercedes G 300
        mercedesG300.setCar("Mercedes G-Wagon 300", "SUV", 5, 3.5, 280, 10,0, 3);
        if(mercedesG300.getNumOfAvailable()>0){
            mercedesG300.setAvailable(true);
        }
        if(mercedesG300.getLastTimeServiced() < 5){
            mercedesG300.goToService();
            mercedesG300.setLastTimeServiced(0);
        }



        System.out.println("Model name:              " + porsche911.getModelName());
        System.out.println("Body style:              " + porsche911.getBodyStyle());
        System.out.println("Number of available:     " + porsche911.getNumOfAvailable());
        System.out.println("Available:               " + porsche911.isAvailable() + "\n");

        System.out.println("Model name:              " + porscheBoxster.getModelName());
        System.out.println("Body style:              " + porscheBoxster.getBodyStyle());
        System.out.println("Number of available:     " + porscheBoxster.getNumOfAvailable());
        System.out.println("Available:               " + porscheBoxster.isAvailable() + "\n");

        System.out.println("Model name:              " + mercedesG300.getModelName());
        System.out.println("Body style:              " + mercedesG300.getBodyStyle());
        System.out.println("Number of available:     " + mercedesG300.getNumOfAvailable());
        System.out.println("Available:               " + mercedesG300.isAvailable() + "\n");

    }
}
