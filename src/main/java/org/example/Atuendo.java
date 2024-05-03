package org.example;

import java.util.List;

public class Atuendo {

    private final List<Prenda> prendas;

    public Atuendo(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    @Override
    public String toString() {
        List<String> prendasString = this.prendas.stream().map(Prenda::toString).toList();
        return String.join("\n", prendasString);
    }
}
