package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Categoria catSuperior = new Categoria("Superior");
        Categoria catInferior = new Categoria("Inferior");
        Categoria catAccesorios = new Categoria("Accesorios");
        Categoria catCalzado = new Categoria("Calzado");

        TipoPrenda tipoRemera = new TipoPrenda("Remera", catSuperior);
        TipoPrenda tipoJean = new TipoPrenda("Jean", catInferior);
        TipoPrenda tipoGorra = new TipoPrenda("Gorra", catAccesorios);
        TipoPrenda tipoZapatillas = new TipoPrenda("Zapatillas", catCalzado);

        Prenda remeraAzul = new Prenda(tipoRemera, "algodon", "azul");
        Prenda jeanNegro = new Prenda(tipoJean, "jean", "negro", "azul oscuro");
        Prenda gorraFachera = new Prenda(tipoGorra, "poliester", "mostaza");
        Prenda zapatosDeCueroEcologico = new Prenda(tipoZapatillas, "cuero ecologico", "negro");

        Atuendo altoAtuendo = new Atuendo(Arrays.asList(remeraAzul, jeanNegro, gorraFachera, zapatosDeCueroEcologico));

        System.out.print(altoAtuendo);
    }
}