package com.company;

public class TP51232 {
    static void countDownRecursive(int start) {
            System.out.println(start + "...");
            countDownRecursive(start - 1);
            System.out.println("FINISHED");

    }
    public static void main(String[] args) {
        countDownRecursive(3); // 3, 2, 1, FINISHED

    }
}
