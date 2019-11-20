package com.romitus;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor introduzca un numero entero positivo: ");
        int numeroEntero = teclado.nextInt();

        for (int i = 0; i < 5; i++) {
            if (primo(numeroEntero) == true){
                System.out.println(numeroEntero + " es primo");
            } else{
                System.out.println(numeroEntero + " no es primo");
            }
            numeroEntero++;
        }
    }
    public static boolean primo (int num1){
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
