package com.company;

public class TP5 {
    static void countDownLoop(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println(i + "...");
        }
        System.out.println("FINISHED");
    }
    public static void main(String[] args) {
        countDownLoop(3); // 3, 2, 1, FINISHED

    }
}
