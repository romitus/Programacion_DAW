package com.romitus;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el numero que desea pasar a binario");
        int numero = teclado.nextInt();
        while (numero < 0){
            System.err.println("Error, tienes que introducir un numero positivo");
            numero = teclado.nextInt();
        }
        System.out.println("Numero convertido a binario:");
        while (numero != 0){
            int binario = numero % 2;
            numero = numero / 2;
            System.out.print(binario);
        }
    }
}
