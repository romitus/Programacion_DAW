package com.romitus;

import java.util.Arrays;

public class RPG{
    Personajes[] personajes;
    int tamActual;
    int tamMaximo = 10;

    public RPG() {
        this.personajes = personajes;
        this.tamActual = tamActual;
        this.tamMaximo = tamMaximo;
    }

    public void addPersonaje(Personajes personajes1){
        if (tamActual< 10){
        personajes[tamActual] = personajes1;
        tamActual++;
        }
    }

    public void borrarMuertos(){
        for (int i = 0; i < 10; i++) {
            if (personajes[i].getEnergia() == 0 || personajes[i].getEnergia() < 0){
                personajes[i] = null;
                tamActual--;
            }
        }
    }
    public void mostrarEstado(){
        Arrays.sort(personajes);
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }

    public void mostrarAtaque(){
        Arrays.sort(personajes,new CompararAtaque());
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }

    public void mostrarDefensa(){
        Arrays.sort(personajes,new CompararDefensa());
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(personajes[i]);
        }
    }

    public void hayGanador(){
        if (tamActual == 0){
            System.out.println("Ehrorabuena tenemos un ganador");
            System.out.println(personajes[tamActual]);
        }
    }


}
