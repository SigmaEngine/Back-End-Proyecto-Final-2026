package com.techlab.productos.model;

public class Bebida extends Producto {

    // =========================================
    // ATRIBUTO EXTRA
    // =========================================

    private double litros;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    public Bebida(String nombre, double precio, int stock, double litros) {

        super(nombre, precio, stock);

        this.litros = litros;
    }

    // =========================================
    // GETTER
    // =========================================

    public double getLitros() {

        return litros;
    }

    // =========================================
    // SETTER
    // =========================================

    public void setLitros(double litros) {

        this.litros = litros;
    }

    // =========================================
    // toString()
    // =========================================

    @Override
    public String toString() {

        return super.toString()
                + " | Litros: "
                + litros + "L";
    }
}