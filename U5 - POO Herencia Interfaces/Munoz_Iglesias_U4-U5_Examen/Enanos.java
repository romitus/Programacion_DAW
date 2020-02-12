package com.romitus;

public class Enanos extends Personajes implements Atacar {
    private double altura;

    public Enanos(String nombre, int energia, int capAtaque, int capDefensa, boolean encantado, String raza, double altura) {
        super(nombre, energia, capAtaque, capDefensa, encantado, raza);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + " Altura:" + getAltura();
    }

    @Override
    public void atacarPersonaje(Personajes p1) {
        int ataque =getCapAtaque()+p1.getCapDefensa();
        System.out.println(getNombre() + " - ATACANDO");
        if (getRaza().equals(p1.getRaza())){
            System.out.printf("No se ha infligido daño");
        }
        if (p1.isEncantado()){
            p1.setEnergia(p1.getEnergia() - ataque*2);
        }
        if (!p1.isEncantado()){
            p1.setEnergia(p1.getEnergia() - ataque);
        }
    }
}
