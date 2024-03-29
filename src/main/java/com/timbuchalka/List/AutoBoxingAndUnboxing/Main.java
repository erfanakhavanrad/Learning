package com.timbuchalka.List.AutoBoxingAndUnboxing;

import java.util.ArrayList;

/**
 * @author Erfan Akhavan Rad
 * @created 07/21/2023
 */

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Erfan");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(44));
        Integer integer = 43;
        Double doubleValue = 23.1;

        ArrayList<Integer> intArrayList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            intArrayList.add(Integer.valueOf(i));
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i + " --> "+ intArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; // Integer.valueOf(56) This is called AutoBoxing.
        int myInt = myIntValue.intValue(); //  This is called Unboxing.


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }


    }
}
