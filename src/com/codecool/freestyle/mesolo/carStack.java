package com.codecool.freestyle.mesolo;

import javax.xml.soap.Node;
import java.util.Arrays;

/**
 * carStack stacks the recently added cars
 */
public class carStack {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    carStack(int size){
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    /**
     * Pushes to the carStack
     * @param input Added to the stack
     */
    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        }
    }

    /**
     * Deletes the item of the top
     * @return topOfStack data
     */
    public String pop(){

        if(topOfStack>=0) {
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        }else{
            return "-1";
        }
    }

    /**
     * Returns the top item
     * @return topOfStack data
     */
    public String peek(){
        return stackArray[topOfStack];
    }

}
