package com.romitus;

import java.io.Serializable;

public class Propietarios implements Serializable {
    private String nombre;
    private String apellidos;
    private String numeroscm;
    private String pais;

    public Propietarios(String nombre, String apellidos, String numeroscm, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroscm = numeroscm;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroscm() {
        return numeroscm;
    }

    public void setNumeroscm(String numeroscm) {
        this.numeroscm = numeroscm;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Propietarios{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroscm='" + numeroscm + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
