package com.techlab.productos.utils;

public class Validaciones {

    // =========================================
    // VALIDAR PRECIO
    // =========================================

    public static boolean precioValido(double precio) {

        return precio > 0;
    }

    // =========================================
    // VALIDAR STOCK
    // =========================================

    public static boolean stockValido(int stock) {

        return stock >= 0;
    }
}