package com.romitus;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int vector[] = new int[4];
        vector[0] = 7;
        vector[1] = 9;
        vector[2] = 11;
        vector[3] = 17;
        System.out.println(Arrays.toString(filtraPrimos(vector)));
    }
    public static int[] filtraPrimos(int tabla[]){
        int contador = 0;
        int contadorVector = 0;
        boolean noElementos = false;
        for (int i = 0; i < tabla.length; i++) {
            if (esPrimo(tabla[i]) == true){
                contador++;
            }
        }
        if (contador == 0){
            contador++;
            noElementos = true;
        }
        int vectorResultado[] = new int[contador];
        if (noElementos == true){
            vectorResultado[0] = -1;
        }
        for (int i = 0; i < tabla.length; i++) {
            if (esPrimo(tabla[i]) == true){
                vectorResultado[contadorVector++] = tabla[i];
            }
        }
        return vectorResultado;
    }
    public static boolean esPrimo (int num1){
        boolean primo = true;
        int contador = 2;
        for (int i = 2; i < num1 ; i++) {
            if (num1 % i == 0){
                contador++;
            }
            if (contador > 2){
                primo = false;
            }
        }
        return primo;
    }
}
