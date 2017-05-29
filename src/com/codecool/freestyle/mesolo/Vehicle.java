package com.codecool.freestyle.mesolo;

public abstract class Vehicle {

    private String modelName;
    private String bodyStyle;
    private int numOfDoors;
    private double lengthMeter;
    private int horsePower;
    private int lastTimeServiced;
    private int status;

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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



}
