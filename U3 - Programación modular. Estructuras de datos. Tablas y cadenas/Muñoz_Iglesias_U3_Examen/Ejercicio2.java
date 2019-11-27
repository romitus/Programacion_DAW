package com.romitus;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int tabla[] = new int[6];
        tabla[0] = 1;
        tabla[1] = 2;
        tabla[2] = 3;
        tabla[3] = 4;
        tabla[4] = 5;
        tabla[5] = 6;

        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(insertarValor(tabla,8,3)));
    }
    public static int[] insertarValor(int vector[], int valor, int posicion){
        int vectorResultado[] = new int[vector.length+1];
        int aux = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i == posicion){
                vectorResultado[i] = valor;
            }else {
                vectorResultado[i] = vector[i];
            }
            if (i > posicion){
                vectorResultado[i] = vector[i-1];
                vectorResultado[vectorResultado.length-1] = vector[vector.length-1];
            }

        }
        return vectorResultado;
    }
}
