package com.romitus;

import java.util.Comparator;

public class CompararAtaque implements Comparator<Personajes> {
    @Override
    public int compare(Personajes o1, Personajes o2) {
        return o1.getCapAtaque()-o2.getCapAtaque();
    }
}
