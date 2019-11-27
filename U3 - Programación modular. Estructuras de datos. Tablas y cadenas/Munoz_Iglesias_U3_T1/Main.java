package com.romitus;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroMesa[][] = new int[2][10];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                numeroMesa[i][j] = (int) (Math.random() * 5);
            }
        }
        leerArray(numeroMesa);
        addComensal(numeroMesa);
        leerArray(numeroMesa);

    }

    public static void leerArray(int tablaBidimensional[][]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablaBidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addComensal(int tabla[][]) {
        Scanner teclado = new Scanner(System.in);
        int numeroComensal = 0;
        boolean clientesSentados = false;
        System.out.println("¿Cuantos comensales sois?");
        numeroComensal = teclado.nextInt();

            if (numeroComensal > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + numeroComensal + " , haga grupos de 4 personas");
            } else {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (tabla[i][j] == 0) {
                            tabla[i][j] = numeroComensal;
                            clientesSentados = true;
                        }
                        if (clientesSentados == true) {
                            break;
                        }
                    }
                    if (clientesSentados == true) {
                        break;
                    }
                }
                if (clientesSentados == false) {
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (tabla[i][j] < 4) {
                                tabla[i][j] = tabla[i][j] + numeroComensal;
                                clientesSentados = true;
                            }
                            if (clientesSentados == true) {
                                break;
                            }
                        }
                        if (clientesSentados == true) {
                            break;
                        }
                    }
                }
                if (clientesSentados = false) {
                    System.out.println("No tenemos más espacio en las mesas");
                }
            }
        }
    }

