package com.romitus;

import java.io.*;
import java.util.HashMap;

public class Concurso {
    HashMap<Perros, String> concurso = new HashMap<Perros, String>();
    private String nombreConcurso;
    private String localidad;
    private Perros perros;

    public Concurso(String nombreConcurso, String localidad) {
        this.nombreConcurso = nombreConcurso;
        this.localidad = localidad;
    }

    public void addDog(String raza, Perros perros){
        if (!perros.getRaza().equals(raza)){
            System.out.println("Error la raza del perro es diferente a la propuesta");
        }
        concurso.put(perros,raza);
    }

    public void disqualifyDog(Perros perros){
        if (!concurso.containsKey(perros)){
            System.out.println("Perro no inscrito");
        }
        concurso.remove(perros);
    }

    /*public void ownerDogs(){ //Placeholder
        for (Perros i : concurso.keySet()) {
            System.out.println("key: " + i + " value: " + concurso.get(i));
        }
    }*/

    public void ownerDogs(String numeroscm){
        boolean perrosInscritos = false;
        for (Perros i : concurso.keySet()) {
            Propietarios p = (Propietarios) i.getPropietarioPerro();
            if (numeroscm.equals(p.getNumeroscm())){
                perrosInscritos = true;
                System.out.println("key: " + i + " value: " + concurso.get(i));
            }
        }
        if (perrosInscritos == false){
            System.out.println("Este socio no tiene perros inscritos");
        }
    }

    public void perrosporPeso(){
        //Collections.sort(concurso,new OrdenarPeso());
    }

    public void perrosporEdad(){
        //Collections.sort(concurso,new OrdenarEdad());
    }

    public void cargarPerros(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("perros.dat"));
            while (true){
                Perros p = (Perros) ois.readObject();
                concurso.put(p,p.getRaza());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void guardarPerros(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("perros.dat"));
            for (Perros i : concurso.keySet()) {
                oos.writeObject(i);
            }
            System.out.println("Guardado de datos finalizado");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Perros getPerros() {
        return perros;
    }

    public void setPerros(Perros perros) {
        this.perros = perros;
    }
}


