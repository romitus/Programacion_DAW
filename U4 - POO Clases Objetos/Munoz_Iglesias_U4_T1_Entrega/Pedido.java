package com.romitus;

import java.util.Calendar;

public class Pedido {
    private Calendar momento;
    private Pizzas pizza;

    Pedido(){
        Ingredientes i1 = new Ingredientes("Jamon",150);
        Ingredientes i2 = new Ingredientes();
        Ingredientes[] ingredientes = new Ingredientes[2];
        ingredientes[0] = i1;
        ingredientes[1] = i2;
        pizza = new Pizzas(Pizzas.Size.FAMILIAR,ingredientes);
        momento = Calendar.getInstance();
    }

    Pedido(Pizzas pizza){
        momento = Calendar.getInstance();
        this.pizza = pizza;
    }
}
