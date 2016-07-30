package com.levelup.lesson1.task3;


public class IntervalValues {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        int step = 2;

        for (int i = a; i <= b; i = i + step) {
            System.out.println("i: " + i + " \tvalue: " + calculateFunc(i));
        }
    }

    public static double calculateFunc(int i) {
        return Math.tan(i) - 3;
    }
}
