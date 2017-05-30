package com.codecool.freestyle.mesolo;

/**
 *
 */

public abstract class Vehicle {



    private String modelName;
    private String bodyStyle;
    private int numOfDoors;
    private double lengthMeter;
    private int horsePower;
    private int lastTimeServiced;
    private int status;
    private boolean serviceNeeded;

    //getters setters

    public boolean isServiceNeeded() {
        return serviceNeeded;
    }

    public void setServiceNeeded(boolean serviceNeeded) {
        this.serviceNeeded = serviceNeeded;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public int getLastTimeServiced() {
        return lastTimeServiced;
    }

    public void setLastTimeServiced(int lastTimeServiced) {
        this.lastTimeServiced = lastTimeServiced;
    }

    private int numOfAvailable;
    private boolean available;

    public String getModelName() {
        return modelName;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public double getLengthMeter() {
        return lengthMeter;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getNumOfAvailable() {
        return numOfAvailable;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     *
     * Sets the car's parameters
     *
     * @param modelName Name of the model of the car
     * @param bodyStyle Body style of the model
     * @param numOfDoors Number of doors
     * @param lengthMeter Car's lentgh in meters
     * @param horsePower Car's horsepower
     * @param lastTimeServiced The car was serviced for the last time
     * @param numOfAvailable Number of available of the model
     * @param status Car's physical status of a scale on 1 to 10
     */
    public void setCar(String modelName, String bodyStyle, int numOfDoors, double lengthMeter, int horsePower, int lastTimeServiced, int numOfAvailable, int status){

        this.modelName = modelName;
        this.bodyStyle = bodyStyle;
        this.numOfDoors = numOfDoors;
        this.lengthMeter = lengthMeter;
        this.horsePower = horsePower;
        this.lastTimeServiced = lastTimeServiced;
        this.numOfAvailable = numOfAvailable;
        this.status = status;

    }

    /**
     * Prints all parameters set
     */

    public void printCar(){
        System.out.println("Model name:              " + getModelName());
        System.out.println("Body style:              " + getBodyStyle());
        System.out.println("Number of available:     " + getNumOfAvailable());
        System.out.println("Last time serviced:      " + getLastTimeServiced());
        System.out.println("Service needed:          " + checkIfServiceNeeded());
        System.out.println();
    }


    /**
     * Checks if the car needs service or not and returns the value
     */
    public boolean checkIfServiceNeeded(){
        if (getLastTimeServiced()>5){
            setServiceNeeded(true);
        }
        return isServiceNeeded();
    }
}
