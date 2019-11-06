package com.romitus;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero entero:");
        long num1 = teclado.nextLong();
        String numeroIntroducido = String.valueOf(num1);
        String digitos = "0123456789";
        System.out.print("Dígitos que aparecen en el número: ");
        for (int i = 1; i <= numeroIntroducido.length() ; i++) {
            for (int j = 1; j <= digitos.length(); j++) {
                if (digitos.substring(j-1,j).equals(numeroIntroducido.substring(i-1,i))){

                }
            }
        }
    }
}
