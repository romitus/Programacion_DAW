package com.romitus;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad1 = teclado.nextLine();
        String vocales = "aeiou";
        int numVocal = 0;
        for (int i = 1; i <= cad1.length(); i++) {
            for (int j = 1; j <= vocales.length(); j++) {
                if (vocales.substring(j-1, j).equalsIgnoreCase(cad1.substring(i-1, i))){
                    numVocal = numVocal + 1;
                }
            }
        }
        System.out.println("La cantidad de vocales es " + numVocal);
    }
}
