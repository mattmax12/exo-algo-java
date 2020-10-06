package com.company;

public class TP42 {
    /**
     *La fonction cherche si un chiffre se trouve dans un tableau et nous montre son index
     * @param croissant est un tableau utiliser dans la fonction recherche
     * @param nombre est un nombre entier utiliser dans la fonction recherche
     * @return i si le chiffre est trouver et -1 si le chiffre n'est pas dans le tableau
     */
    public static int recherche(int[] croissant, int nombre ,int max,int min) {



        if (min <= max) {
            int middle = (min + max) / 2;
            if (croissant[middle] < nombre) {
                return recherche(croissant, nombre, max, middle + 1);
            }
            else if (croissant[middle] > nombre) {
                return recherche(croissant, nombre, middle - 1, min);
            }
            else if (croissant[middle] == nombre) {
                return middle;
            }
        }
        return -1;
    }


    public static void main(String[] args) {



        int[] croissant= {1,2,3,4,5,6,7,8,9,10,11,12,15};
        int chiffre=15;
        int min = 0;
        int max =croissant.length - 1;
        int nombre=recherche(croissant,chiffre,max,min);
        System.out.println(nombre);
    }
}