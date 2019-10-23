package com.romitus;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la primera nota");

        double nota1 = teclado.nextInt(); //Escribo la nota 1 por teclado
        System.out.println("Introduce la segunda nota");
        double nota2 = teclado.nextInt(); //Escribo la nota 2 por teclado
        System.out.println("Introduce la tercera nota");
        double nota3 = teclado.nextInt(); //Escribo la nota 3 por teclado
        teclado.nextLine();               // Creo lectura para luego hacer la lectura
        double media = (nota1 + nota2 + nota3) / 3;
        String notaFinal = "";
        String recuperacion ="";

        if (media >= 9){
            notaFinal = "Sobresaliente"; //Escribo la nota escrita en caso que se cumpla la media
        }
        if (media > 7 && media < 9){   //Escribo la nota escrita en caso que se cumpla la media
            notaFinal = "Notable";
        }
        if (media >= 6 && media < 7){  //Escribo la nota escrita en caso que se cumpla la media
            notaFinal = "Bien";
        }
        if (media  >=5 && media < 6){  //Escribo la nota escrita en caso que se cumpla la media
            notaFinal = "Suficiente";
        }

        System.out.println("Nota del primer control: " + nota1); //Muestro el resultado
        System.out.println("Nota del segundo control: " + nota2); //Muestro el resultado
        System.out.println("Nota del tercer control: " + nota3); //Muestro el resultado

        if (media < 5) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            recuperacion = teclado.nextLine();
            if (recuperacion.equals("apto")) { //Si lo que he introducio por teclado es igual a apto le asigna 5 a la media
                media = 5;
            }
            if (media  >=5 && media < 6){
                notaFinal = "Suficiente"; //muestro la nota escrita como suficiente ya que en este punto no se mostrara otra nota.
            }
        }
        System.out.println("Tu nota de programacion es " + media + " " + notaFinal); //Resultado final de la asignatura
    }
}
