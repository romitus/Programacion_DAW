package com.romitus;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura de la flecha");
        int altura = teclado.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i+j == altura/2 || i-j == altura/2){
                    System.out.print("*     *");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
