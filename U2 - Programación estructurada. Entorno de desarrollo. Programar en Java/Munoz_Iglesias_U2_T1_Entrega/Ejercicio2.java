package com.romitus;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es capicua");
        int numero = teclado.nextInt();
        int alReves = 0;
        int auxiliar = numero;
        while (auxiliar!=0){
            int cifra = auxiliar % 10;
            alReves = alReves * 10 + cifra;
            auxiliar = auxiliar / 10;
        }
        if(numero == alReves){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}
