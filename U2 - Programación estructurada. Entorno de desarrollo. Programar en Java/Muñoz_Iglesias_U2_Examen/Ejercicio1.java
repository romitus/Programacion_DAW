package com.romitus;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la altura de los calcetines");

        int altura = teclado.nextInt();

        while (altura < 4){
            System.out.print("Numero incorrecto, el numero ha de ser mayor o igual que 4");
            System.out.println(); //Salto de linea necesario para que sea mas intuitivo para el usuario
            altura = teclado.nextInt();
        }
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < 14; x++) {
                if (x < 3 || (x > 7 && x < 11 ) || (y == altura -2 && x < 6) || (y == altura -1 && x < 6) || (y == altura -2 && x > 7) || (y == altura -1 && x > 7)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
