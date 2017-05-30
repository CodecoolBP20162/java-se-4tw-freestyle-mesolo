package com.codecool.freestyle.mesolo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Car.java adds new cars, using Vehicle.java abstract class
 * @author Bence Gál
 */


public class Car extends Vehicle{

    public static void main(String[] args) {

         //final Logger logger = LoggerFactory.getLogger(Car.class);


        Car porsche911 = new Car();
        Car porscheBoxster = new Car();
        Car mercedesG300 = new Car();

        List carList = new ArrayList();



        //Porsche 911
        porsche911.setCar("Porsche 911", "Coupe", 3, 2.5, 300, 3, 5, 7);
        if(porsche911.getNumOfAvailable()>0){
            porsche911.setAvailable(true);
            //logger.debug("Porsche available: {}.", porsche911.isAvailable());
        }
        //Porsche Boxster
        porscheBoxster.setCar("Porsche Boxster", "Cabriolet", 3, 2.0, 200, 8,10, 8);
        if(porscheBoxster.getNumOfAvailable()>0){
            porscheBoxster.setAvailable(true);
        }
        //Mercedes G 300
        mercedesG300.setCar("Mercedes G-Wagon 300", "SUV", 5, 3.5, 280, 10,0, 3);
        if(mercedesG300.getNumOfAvailable()>0){
            mercedesG300.setAvailable(true);
        }
        carList.add(porsche911.getModelName());
        carList.add(porscheBoxster.getModelName());
        carList.add(mercedesG300.getModelName());

        porsche911.printCar();
        porscheBoxster.printCar();
        mercedesG300.printCar();
    }
}
