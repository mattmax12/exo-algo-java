package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] scores = new int[7];
        float total=0;
        scores[0]=24;
        scores[1]=63;
        scores[2]=96;
        scores[3]=47;
        scores[4]=80;
        scores[5]=13;
        scores[6]=83;
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
            total =scores[i]+total;
        }
        System.out.println(total/7);

    }
}
