package com.romitus;

public abstract class Hombres extends Personajes {
    public Hombres(String nombre, int energia, int capAtaque, int capDefensa,boolean encantado,String raza) {
        super(nombre, energia, capAtaque, capDefensa, encantado,raza);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
