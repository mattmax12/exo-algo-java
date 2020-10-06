package com.company;

public class TP43 {
    static int serchbinary(int[] tab,int num) {
        int min = 0;
        int max = tab.length - 1;

        while (true) {
            int mid = (min + max) / 2;
            if (num == tab[mid]) {
                return mid;
            } else if (num < tab[mid]) {

            }
        }
    }
        public static void main(String[] args) {
    }
}
