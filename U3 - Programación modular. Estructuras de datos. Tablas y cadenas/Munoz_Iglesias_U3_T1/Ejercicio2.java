package com.romitus;

import java.util.Scanner;

public class Ejercicio2 {
    /*Escribe un programa que pida 20 números enteros. Estos números se deben
    introducir en un array de 4 filas por 5 columnas. El programa mostrará las
    sumas parciales de filas y columnas igual que si de una hoja de cálculo se
    tratara. La suma total debe aparecer en la esquina inferior derecha.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tablaNumeros[][] = new int[4][5];
        for (int i = 0; i < 4; i++) { //Eje x
            for (int j = 0; j < 5; j++) { //Eje y
                tablaNumeros[i][j] = teclado.nextInt();
            }
        }

        System.out.println();
        leerArray(tablaNumeros);
        System.out.println();
        leerArray(media(tablaNumeros));
    }

    public static void leerArray(int tablaBidimensional[][]) {
        for (int i = 0; i < tablaBidimensional.length; i++) {
            for (int j = 0; j < tablaBidimensional[i].length; j++) {
                System.out.print(tablaBidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] media(int tabla[][]){
        int suma = 0;
        int tablaResultado[][] = new int[tabla.length+1][tabla[0].length+1];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tablaResultado[i][j] = tabla[i][j];
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                suma = suma + tablaResultado[i][j];
            }
            tablaResultado[i][5]= suma / tabla[0].length;
        }

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                suma = suma + tablaResultado[j][i];
            }
            tablaResultado[tabla.length][i]= suma / 4;
        }

        return tablaResultado;
    }
}