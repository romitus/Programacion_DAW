package com.romitus;

public class Elfos extends Personajes implements Atacar {

    private String raza = "Elfos";

    public enum TipoElfo {BOSQUE,COSTA};
    private TipoElfo tipo;

    public Elfos(String nombre, int energia, int capAtaque, int capDefensa, boolean encantado,String raza, TipoElfo tipo ) {
        super(nombre, energia, capAtaque, capDefensa, encantado,raza);
        this.tipo = tipo;
    }

    public TipoElfo getTipo() {
        return tipo;
    }

    public void setTipo(TipoElfo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " TipoElfo:" + getTipo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elfos elfos = (Elfos) o;
        return tipo == elfos.tipo;
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
