package com.romitus;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorPrimo = 0;
        int contador = 0;
        double suma = 0;
        int min = 0;
        int max = 0;
        double media = 0;
        int numUser = teclado.nextInt();
        boolean primo = false;
        for (int i = 1; i <= numUser; i++) {  //El numero primo no llega a salir.
            if (i%numUser == 0){
                contadorPrimo++;
            }
        }
        if (contadorPrimo <= 2){
            primo = true;
        }
        while (primo != true ){
            contador++;

            if (numUser > max){
                max = numUser;
            }
            if (numUser < min){
                min = numUser;
            }
            suma = suma + numUser;
            media = suma / contador;
            numUser = teclado.nextInt();
        }
        System.out.println("Ha introducido " + contador + " números no primos.");
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        System.out.println("Media: " + media);
    }
}
