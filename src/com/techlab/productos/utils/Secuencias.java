package com.techlab.productos.utils;

public class Secuencias {

    private static int secuenciaProducto = 1;

    public static int siguienteProductoId() {

        return secuenciaProducto++;
    }
}
