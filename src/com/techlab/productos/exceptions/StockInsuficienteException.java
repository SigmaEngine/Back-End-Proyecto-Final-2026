package com.techlab.productos.exceptions;

public class StockInsuficienteException extends Exception {

    public StockInsuficienteException(String mensaje) {

        super(mensaje);
    }
}
