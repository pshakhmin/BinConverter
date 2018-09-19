package com.company;

import java.util.Scanner;

public class Main {
    static String str;

    public static void main(String[] args) {
        inputNumber();
        varTypeTest(str);
        decToBin(Long.valueOf(str));
    }

    public static void inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number");
        str = input.next();
    }

    public static void varTypeTest(String str) {

        Long number = new Long(str);
        if (number.byteValue() == number.shortValue()) {
            System.out.println("Can be used: byte, short, int, long ");
        } else {
            if (number.shortValue() == number.intValue()) {
                System.out.println("Can be used: short, int, long ");
            } else {
                if (number.intValue() == number.longValue()) {
                    System.out.println("Can be used: int, long ");
                } else {
                    System.out.println("Can be used: long");
                }
            }
        }
    }


    public static void decToBin(long a) {
        long b;
        String out = "";
        while (a != 0) {
            if ((out.length() % 5) == 0) {
                out = " " + out;
            }
            b = a % 2;
            out = b + out;
            a = a / 2;
        }
        System.out.println(str + " in binary is ");
        System.out.println(out);
    }
}
