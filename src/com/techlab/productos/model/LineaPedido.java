package com.techlab.productos.model;

public class LineaPedido {

    // =========================================
    // ATRIBUTOS
    // =========================================

    private Producto producto;
    private int cantidad;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    public LineaPedido(Producto producto, int cantidad) {

        this.producto = producto;
        this.cantidad = cantidad;
    }

    // =========================================
    // GETTERS
    // =========================================

    public Producto getProducto() {

        return producto;
    }

    public int getCantidad() {

        return cantidad;
    }

    // =========================================
    // SETTERS
    // =========================================

    public void setProducto(Producto producto) {

        this.producto = producto;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;
    }

    // =========================================
    // CALCULAR SUBTOTAL
    // =========================================

    public double calcularSubtotal() {

        return producto.getPrecio() * cantidad;
    }

    // =========================================
    // toString()
    // =========================================

    @Override
    public String toString() {

        return producto.getNombre()
                + " | Cantidad: "
                + cantidad
                + " | Subtotal: $"
                + calcularSubtotal();
    }
}