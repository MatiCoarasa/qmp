package org.example;

import org.example.enums.Material;
import org.example.enums.Trama;

public class Prenda {

    private final TipoPrenda tipo;
    private final Material material;
    private final Trama trama;
    private final Color colorPrincipal;
    private Color colorSecundario;

    public Prenda(TipoPrenda tipo, Material material, Trama trama, Color colorPrincipal, Color colorSecundario) {
        this.tipo = tipo;
        this.material = material;
        this.trama = trama;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    @Override
    public String toString() {
        String string = tipo.nombre() + " hecho de " + material + " de color " + colorPrincipal;
        if(this.colorSecundario != null) string += " y " + this.colorSecundario;

        return string;
    }
}
