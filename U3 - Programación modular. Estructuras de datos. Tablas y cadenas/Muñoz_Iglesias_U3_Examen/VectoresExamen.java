package com.romitus;

public class VectoresExamen {
    public static String[] unir(String[] tabla1, String[] tabla2){
        int sumaTablas = tabla1.length+tabla2.length;
        int contadorTabla = tabla1.length;
        String vectorResultado[] = new String[sumaTablas];

        for (int i = 0; i < tabla1.length; i++) {
            vectorResultado[i] = tabla1[i];
        }

        for (int i = 0; i < tabla2.length; i++) {
            vectorResultado[contadorTabla++] = tabla2[i];
        }
        return vectorResultado;
    }
    /*public static String[] rotar(String[] tabla1, int posicion){
        String vectorResultado[] = new String[tabla1.length];
        for (int i = 0; i < tabla1.length ; i++) {
            vectorResultado[i] =
        }
    }*/
}
