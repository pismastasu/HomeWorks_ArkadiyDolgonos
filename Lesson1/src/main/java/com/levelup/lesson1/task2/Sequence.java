package com.levelup.lesson1.task2;


public class Sequence {

    public static void main(String[] args) {
        double e = 0.00001D;
        for (int i = 0; ; i++) {
            double calculation = considerAn(i);
            System.out.println("i: " + i + "\tan:" + calculation);
            if (e > calculation) {
                System.out.println("stop calculation on step: " + i);
                break;
            }
        }
    }

    private static double considerAn(int n) {
        return (double) 1 / Math.pow((n * n + 1), 2);
    }

}
