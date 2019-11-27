package com.romitus;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        String vector1[] = new String[5];
        vector1[0] = "a";
        vector1[1] = "b";
        vector1[2] = "c";
        vector1[3] = "d";
        vector1[4] = "e";

        String vector2[] = new String[3];
        vector2[0] = "f";
        vector2[1] = "g";
        vector2[2] = "h";

        System.out.println(Arrays.toString(VectoresExamen.unir(vector1,vector2)));
    }
}


