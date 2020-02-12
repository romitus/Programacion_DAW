package com.romitus;

import java.util.Comparator;

public class CompararDefensa implements Comparator<Personajes> {
    @Override
    public int compare(Personajes o1, Personajes o2) {
        return o1.getCapDefensa()-o2.getCapDefensa();
    }
}
