package com.romitus;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        System.out.println("Introduzca su numero favorito 1:");
        Integer favorito1 = teclado.nextInt();
        System.out.println("Introduzca su numero favorito 2:");
        Integer favorito2 = teclado.nextInt();
        System.out.println("Introduzca su numero favorito 3:");
        Integer favorito3 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el numero de la loteria:");
        String numeroLoteria = teclado.nextLine();

        for (int i = 1; i <= 5; i++) {
            if (numeroLoteria.substring(i-1, i).equals(favorito1.toString()) || numeroLoteria.substring(i-1, i).equals(favorito2.toString()) || numeroLoteria.substring(i-1, i).equals(favorito3.toString())){
                contador++;
            }
        }
        if (contador > 2){
            System.out.println("Ese numero le va a dar suerte");
        } else {
            System.out.println("Ese numero no le va a dar suerte");
        }
    }
}
