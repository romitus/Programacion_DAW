package com.romitus;

import java.util.Comparator;

    public class OrdenarEdad implements Comparator<Perros> {
        @Override
        public int compare(Perros o1, Perros o2) {
            return o1.getEdad()-o2.getEdad();
        }
    }
