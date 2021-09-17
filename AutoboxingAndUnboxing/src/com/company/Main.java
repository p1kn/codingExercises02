package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

       // ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ---> " + intArrayList.get(i));
        }

        System.out.println("----------------------");

        Integer myIntValue = 56;
        int myInt = myIntValue;
        System.out.println(myInt);
        Double myDoubleValue = 10.25;
    }
}
