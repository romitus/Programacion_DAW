package com.romitus;

/**
 * Clase Pizzas
 * Clase que determina el comportamiento de las pizzas.
 * @author Carlos Munoz
 * @version 0.1, 2020/01/17
 */

public class Pizzas {


    public enum Size{MEDIANA, FAMILIAR};
    private Ingredientes[] ingredientes;
    private Size size;
    private int numIngredientes;

    /**
     *  Este constructor crea un objeto Pizza donde se le pasa 2 valores por parametro.
     * @param size Tamaño de la pizza.
     * @param ingredientes Ingredientes que tiene la pizza.
     */

    public Pizzas(Size size, Ingredientes[] ingredientes) {
        this.size = size;
        this.ingredientes = new Ingredientes[3];
        for (int i = 0; i < ingredientes.length; i++) {
            addIngrediente(ingredientes[i]);
        }
    }

    /**
     *  Este constructor crea un objeto Pizza donde se le pasa un valor por parametro.
     * @param ingredientes Ingredientes que tiene la pizza.
     */

    public Pizzas(Ingredientes[] ingredientes) {
        this.size = Size.FAMILIAR;
        this.ingredientes = ingredientes;
    }

    /**
     * Este constructor crea un objeto Pizza por defecto que tienen por parametro familiar con jamon y queso.
     */

    public Pizzas(){
        this.size = Size.FAMILIAR;
        this.numIngredientes = 0;
        this.ingredientes = new Ingredientes[3];
    }

    /**
     * Este metodo muestra todos los tamaós de pizzas existentes.
     */

    public static void mostrarSize(){
        System.out.println("Tamaños de la pizza:");
        System.out.println(Size.FAMILIAR);
        System.out.println(Size.MEDIANA);
    }

    /**
     * Este metodo muestra toda la informacion de Pizza.
     */

    public void mostrarInformacion(){
        System.out.println(size);
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null) {
                System.out.println(ingredientes[i].mostrarIngrediente());
            }
        }
    }
    public boolean addIngrediente(Ingredientes ingredientes){
        if (this.numIngredientes < this.ingredientes.length){
            this.ingredientes[numIngredientes] = ingredientes;
            this.numIngredientes++;
            return true;
        }else{
            return false;
        }
    }

    public int getNumIngredientes(){
        return numIngredientes;
    }
}
