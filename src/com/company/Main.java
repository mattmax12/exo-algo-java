package com.company;

public class Main {
    static void score(int[] scores){
        int max=0;
        float total=0;
        boolean moinsde10=false;
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
            total=scores[i]+total;
            if (max<scores[i]){
                max=scores[i];
            }
            if (scores[i]<10) {
                moinsde10 = true;
            }
        }
        System.out.println("contient une valeur inferieur a 10 "+moinsde10);
        System.out.println("moyenne"+total/7);
        System.out.println("max="+max);

    }

    public static void main(String[] args) {
	// write your code here
        int[] scores = new int[7];
        scores[0]=24;
        scores[1]=63;
        scores[2]=96;
        scores[3]=47;
        scores[4]=80;
        scores[5]=13;
        scores[6]=83;
        score(scores);
    }
}
