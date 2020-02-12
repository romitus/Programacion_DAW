package com.romitus;

public abstract class Personajes implements Comparable{
    private String nombre;
    private int energia = 1;
    private int capAtaque = 1;
    private int capDefensa = 1;
    private boolean encantado;
    private String raza;

    public Personajes(String nombre, int energia, int capAtaque, int capDefensa, boolean encantado, String raza) {
        this.nombre = nombre;
        if (energia > 0 && energia <1000){
            this.energia = energia;
        }
        if (capAtaque > 0 && capAtaque < 100){
            this.capAtaque = capAtaque;
        }
        if (capDefensa > 0 && capDefensa < 100){
            this.capDefensa = capDefensa;
        }
        this.encantado = encantado;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCapAtaque() {
        return capAtaque;
    }

    public void setCapAtaque(int capAtaque) {
        this.capAtaque = capAtaque;
    }

    public int getCapDefensa() {
        return capDefensa;
    }

    public void setCapDefensa(int capDefensa) {
        this.capDefensa = capDefensa;
    }

    public boolean isEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public int compareTo(Object o) {
        Personajes p = (Personajes) o;
        return (getEnergia()-p.getEnergia());
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", capAtaque=" + capAtaque +
                ", capDefensa=" + capDefensa +
                ", encantado=" + encantado +
                '}';
    }


}
