package com.romitus;

import java.util.Comparator;

public class OrdenarPeso implements Comparator<Perros> {
    @Override
    public int compare(Perros o1, Perros o2) {
        return o1.getPeso()-o2.getPeso();
    }
}
