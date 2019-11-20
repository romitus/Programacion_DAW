package com.romitus;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la hora");
        int horas = teclado.nextInt();
        System.out.println("Introduce los minutos");
        int minutos = teclado.nextInt();
        System.out.println("Introduce los segundos");
        int segundos = teclado.nextInt();
        System.out.println("Introduce los segundos a aumentar");
        int segundosAumentar = teclado.nextInt();

        System.out.println("Aumentando la hora...");
        for (int i = 0; i < segundosAumentar; i++) {
            segundos = segundos + 1;
            if (segundos > 59){
                segundos = 0;
                minutos = minutos + 1;
            }
            if (minutos > 59){
                minutos = 0;
                horas = horas + 1;
            }
            if (horas > 23){
                horas = 0;
                minutos = 0;
                segundos = 0;
            }
            System.out.println(horas+":"+minutos+":"+segundos);
        }

    }
}
