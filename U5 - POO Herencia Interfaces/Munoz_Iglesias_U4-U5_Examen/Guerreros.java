package com.romitus;

public class Guerreros extends Hombres implements Atacar {
    private int edad;
    public Guerreros(String nombre, int energia, int capAtaque, int capDefensa, boolean encantado, String raza, int edad) {
        super(nombre, energia, capAtaque, capDefensa, encantado, raza);
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + " Edad:"+ getEdad();
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
