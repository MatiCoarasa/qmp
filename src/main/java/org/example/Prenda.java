package org.example;

public class Prenda {

    private final TipoPrenda tipo;
    private final String material;
    private final String colorPrincipal;
    private String colorSecundario;

    @Override
    public String toString() {
        String string = tipo.nombre() + " hecho de " + material + " de color " + colorPrincipal;
        if(this.colorSecundario != null) string += " y " + this.colorSecundario;

        return string;
    }

    public Prenda(TipoPrenda tipo, String material, String colorPrincipal) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
    }

    public Prenda(TipoPrenda tipo, String material, String colorPrincipal, String colorSecundario) {
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }
}
