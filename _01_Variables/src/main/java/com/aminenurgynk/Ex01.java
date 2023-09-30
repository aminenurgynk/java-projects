package com.aminenurgynk;

/*
Pascal Case for class --> MyClass, PersonName
 */
public class Ex01 {
    public static void main(String[] args) {
        /*
        Camel case for variables --> myByte, myCar, firstName
         */
        //primitive data type
        int number = 69;
        byte myByte = 25;
        short myShort = 5222;
        long myLong = 1_000_000_000;
        double myDouble = 125000.52;
        char myChar = 'A';
        char myChar2 = 66;// ASCII code
        boolean myBoolean = true;     // true or false;
        float myFloat = 128.65f;
        //wrapper data type
        Integer myInteger = 529;
        Integer myInteger2 = null;
        int myInt = 0;
        System.out.println("INTEGER2 ==>" + myInteger2);
        myInteger2 = myInt;
        System.out.println("INTEGER ==>" + myInteger);
        System.out.println("INTEGER2 ==>" + myInteger2);
        System.out.println("int ==>" + myInt);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toString(myInt)); // from Integer to stringe
    }
}
