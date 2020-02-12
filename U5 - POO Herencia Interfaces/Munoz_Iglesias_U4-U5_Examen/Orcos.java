package com.romitus;

public class Orcos extends Personajes implements Atacar {
    private int tonelaje;

    public Orcos(String nombre, int energia, int capAtaque, int capDefensa, boolean encantado,String raza, int tonelaje) {
        super(nombre, energia, capAtaque, capDefensa, encantado, raza);
        this.tonelaje = tonelaje;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return super.toString() + " Tonelaje:" + getTonelaje();
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
