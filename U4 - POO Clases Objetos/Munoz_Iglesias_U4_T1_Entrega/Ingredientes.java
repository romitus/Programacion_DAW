package com.romitus;

/**
 * Clase Ingrediente
 * Clase que determina el comportamiento de los ingredientes.
 * @author Carlos Munoz
 * @version 0.1, 2020/01/17
 */

public class Ingredientes {
    private String nombreIngrediente;
    private int calorias;

    /**
     * Este constructor crea un objeto Ingrediente con 2 valores que se pasan por parametro.
     * @param nombreIngrediente Nombre del Ingrediente.
     * @param calorias Numero de calorias.
     */

    public Ingredientes(String nombreIngrediente, int calorias) {
        this.nombreIngrediente = nombreIngrediente;
        this.calorias = calorias;
    }

    /**
     * Este constructor construye un objeto ingrediente que llevará por defecto Queso y la caloria 250.
     */

    public Ingredientes() {
        this.nombreIngrediente = "Queso";
        this.calorias = 250;
    }

    /**
     * Metodo que devuelve una cadena con las características del ingrediente.
     * @return Devuelve en formato cadena la características del ingrediente.
     */

    public String mostrarIngrediente() {
        return nombreIngrediente + " con " + calorias + " calorías por cada 100 gramos";
    }
}
