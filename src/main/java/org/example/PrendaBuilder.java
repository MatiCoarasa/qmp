package org.example;

import org.example.enums.Material;
import org.example.enums.Trama;

import javax.naming.directory.InvalidAttributeValueException;

public class PrendaBuilder {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Trama trama;
    private Color colorPrincipal;
    private Color colorSecundario;

    public PrendaBuilder(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
        this.trama = Trama.LISO;
    }

    public PrendaBuilder conMaterial(Material material) {
        this.material = material;
        return this;
    }

    public PrendaBuilder conTrama(Trama trama) {
        this.trama = trama;
        return this;
    }

    public PrendaBuilder conColorPrincipal(Color color) {
        this.colorPrincipal = color;
        return this;
    }

    public PrendaBuilder conColorSecundario(Color color) {
        this.colorSecundario = color;
        return this;
    }

    public Prenda crear() {
        if (material == null || colorPrincipal == null) {
            throw new IllegalStateException("Se deben configurar todos los parámetros requeridos");
        }
        return new Prenda(
                tipoPrenda,
                material,
                trama,
                colorPrincipal,
                colorSecundario
        );
    }
}
