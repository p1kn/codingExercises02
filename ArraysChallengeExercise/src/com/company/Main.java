package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i=0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        printIntegers(myIntegers);
        sortIntegers(myIntegers);
        printIntegers(myIntegers);



    }

    public static int[] getIntegers (int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i=0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printIntegers (int [] name) {
        System.out.println(Arrays.toString(name));
    }

    public static int[] sortIntegers (int[] name) {
        Arrays.sort(name);
        for (int i = 0; i < name.length/ 2; i++) {
            int temp = name[i];
            name[i] = name[name.length - 1 - i];
            name[name.length - 1 - i] = temp;
        }
        return name;
    }

}
