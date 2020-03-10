package com.romitus;

import java.io.Serializable;

public class Perros implements Serializable {
    private String nombre;
    private int edad;
    private int peso;
    private boolean vacunas;
    private Propietarios propietarioPerro;
    private String raza;

    public Perros(String nombre, int edad, int peso, boolean vacunas, Propietarios propietarioPerro, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.propietarioPerro = propietarioPerro;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Propietarios getPropietarioPerro() {
        return propietarioPerro;
    }

    public void setPropietarioPerro(Propietarios propietarioPerro) {
        this.propietarioPerro = propietarioPerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perros{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas=" + vacunas +
                ", propietarioPerro='" + propietarioPerro + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
