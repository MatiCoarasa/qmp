package org.example;

import org.example.enums.Categoria;
import org.example.enums.Material;
import org.example.enums.Trama;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TipoPrenda tipoRemera = new TipoPrenda("Remera", Categoria.PARTE_SUPERIOR);
        TipoPrenda tipoJean = new TipoPrenda("Jean", Categoria.PARTE_INFERIOR);
        TipoPrenda tipoGorra = new TipoPrenda("Gorra", Categoria.ACCESORIO);
        TipoPrenda tipoZapatillas = new TipoPrenda("Zapatillas", Categoria.CALZADO);

        Prenda remeraAzul = new PrendaBuilder(tipoRemera)
                .conMaterial(Material.ALGODON)
                .conTrama(Trama.LISO)
                .conColorPrincipal(new Color(0, 0, 255))
                .crear();

        System.out.print(remeraAzul);
    }
}