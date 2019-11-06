package com.romitus;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura (número impar mayor o igual a 5):");
        int altura = teclado.nextInt();
        if (altura >= 5 && altura % 2 !=0 ){
            for (int y = 0; y < altura; y++) {
                for (int x = 0; x < 6; x++) {
                    if (y==0 || y == altura / 2 || y == altura -1|| x== 0 || x== 5){
                        System.out.print("M");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("La altura introducida no es correcta");
        }
    }
}
