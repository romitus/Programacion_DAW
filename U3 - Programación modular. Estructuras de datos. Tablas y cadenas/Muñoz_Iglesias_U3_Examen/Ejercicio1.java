package com.romitus;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        System.out.println("Escriba el numero de filas");
        filas = teclado.nextInt();
        System.out.println("Escriba el numero de columnas");
        columnas = teclado.nextInt();
        int vectorBidimensional[][] = new int[filas][columnas];
        for (int i = 0; i < vectorBidimensional.length; i++) {
            for (int j = 0; j < vectorBidimensional[0].length; j++) {
                vectorBidimensional[i][j] = (int) (Math.random()*1000);
            }
        }
        leerArray(vectorBidimensional);
        System.out.println();
        System.out.println(maxMatriz(vectorBidimensional));
    }
    public static int maxMatriz(int tablaBidimensional[][]){
        int maximo = 0;
        for (int i = 0; i < tablaBidimensional.length; i++) {
            for (int j = 0; j < tablaBidimensional[0].length; j++) {
                if (tablaBidimensional[i][j] > maximo){
                    maximo = tablaBidimensional[i][j];
                }
            }
        }
        return maximo;
    }

    public static void leerArray(int tablaBidimensional[][]){
        for (int i = 0; i < tablaBidimensional.length ; i++) {
            for (int j = 0; j < tablaBidimensional[0].length; j++) {
                System.out.print(tablaBidimensional[i][j]+" ");
            }
            System.out.println();
        }
    }
}
