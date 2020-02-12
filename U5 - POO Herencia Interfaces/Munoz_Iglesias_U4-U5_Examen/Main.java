package com.romitus;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	    Elfos e1 = new Elfos("Carlos",400,50,60,false, "Elfo", Elfos.TipoElfo.BOSQUE);
        Elfos e2 = new Elfos("Jose",400,50,60,false,"Elfo" ,Elfos.TipoElfo.COSTA);
	    Magos m1 = new Magos("Ilona",900,90,30,true,0,"Mago");

        e1.atacarPersonaje(m1);
        m1.encantar(e1);
        m1.desencantar(e1);
        System.out.println(m1);
    }
}
