package com.romitus;

public class Magos extends Hombres implements Magia {
    private int longitudBarba;
    public Magos(String nombre, int energia, int capAtaque, int capDefensa, boolean encantado, int longitudBarba, String raza) {
        super(nombre, energia, capAtaque, capDefensa, encantado,raza);
        this.longitudBarba = longitudBarba;
    }

    public int getLongitudBarba() {
        return longitudBarba;
    }

    public void setLongitudBarba(int longitudBarba) {
        this.longitudBarba = longitudBarba;
    }

    @Override
    public String toString() {
        return super.toString() + " LongitudBarba:"+ getLongitudBarba();
    }

    @Override
    public void encantar(Personajes p1) {
        p1.setEncantado(true);
    }

    @Override
    public void desencantar(Personajes p1) {
        p1.setEncantado(false);
    }
}
