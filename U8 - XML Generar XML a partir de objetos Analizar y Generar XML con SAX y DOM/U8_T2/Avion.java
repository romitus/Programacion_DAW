package com.company;

public class Avion {
    protected int id;
    protected String modelo;
    protected int year;
    protected String manufacturer;

    public Avion(int id, String modelo, int year, String manufacturer) {
        this.id = id;
        this.modelo = modelo;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}


