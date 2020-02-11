package com.romitus;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Ingredientes i1 = new Ingredientes("Jamon",150);
        Ingredientes i2 = new Ingredientes();

        Pizzas p1 = new Pizzas();
        p1.mostrarInformacion();
        System.out.println();
        Pizzas.mostrarSize();
    }
}
