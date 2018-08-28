package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

// put your code here!
public class DynamicIntArray {

    private int[] staticIntArray = new int[0];

    public void add(int numToAdd) {
        int newArraySize =  staticIntArray.length + 1;
        int[] temporaryArray = new int[newArraySize];
         for (int i = 0; i < staticIntArray.length; i++) {
             temporaryArray[i] = staticIntArray[i];
             temporaryArray[staticIntArray.length] = numToAdd;
         }
         staticIntArray = temporaryArray;
    }

    public void remove(int numToRemove) {
        int[] temporaryArray = new int[staticIntArray.length -1];
        int counter = 0;
        while (counter < temporaryArray.length) {
            if (staticIntArray[counter] == numToRemove) {
                continue;
            }
            temporaryArray[counter] = staticIntArray[counter];
            counter++;
        }
        staticIntArray = temporaryArray;
    }

    public void insert(int place, int numberToInsert) {

    }


    @Override
    public String toString() {
         String stringRepresentation = new String(Arrays.toString(staticIntArray));
         stringRepresentation.replaceAll("[", "");
         stringRepresentation.replaceAll("]", "");
         return stringRepresentation;
    }
}
