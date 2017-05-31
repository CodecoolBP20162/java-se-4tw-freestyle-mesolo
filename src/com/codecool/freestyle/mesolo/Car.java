package com.codecool.freestyle.mesolo;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

import javax.xml.soap.Node;


/**
 * Car.java adds new cars, using Vehicle.java abstract class
 * @author Bence Gál
 */


public class Car extends Vehicle{

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;



    public static void main(String[] args) {

         //final Logger logger = LoggerFactory.getLogger(Car.class);

        carStack carStack = new carStack(10);



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

        /*
        Stacking examples and demonstraiton
         */

        //Adding 3 cars to the stack
        carStack.push(porsche911.getModelName());
        carStack.push(porscheBoxster.getModelName());
        carStack.push(mercedesG300.getModelName());
        //Asking for the top one
        System.out.println(carStack.peek());
        //Popping the top one
        carStack.pop();
        //Asking for the top one
        System.out.println(carStack.peek());
        //Popping the top one
        carStack.pop();
        //Asking for the top one
        System.out.println(carStack.peek());
        //Pushing a random string
        carStack.push("kutya");
        //Asking for the top one
        System.out.println(carStack.peek());
    }
}
