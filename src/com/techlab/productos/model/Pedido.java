package com.techlab.productos.model;

import java.util.ArrayList;

public class Pedido {

    // =========================================
    // ATRIBUTOS
    // =========================================

    private static int contadorId = 1;

    private int id;

    private ArrayList<LineaPedido> lineas;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    public Pedido() {

        this.id = contadorId;
        contadorId++;

        this.lineas = new ArrayList<>();
    }

    // =========================================
    // GETTERS
    // =========================================

    public int getId() {

        return id;
    }

    public ArrayList<LineaPedido> getLineas() {

        return lineas;
    }

    // =========================================
    // AGREGAR LÍNEA AL PEDIDO
    // =========================================

    public void agregarLinea(LineaPedido linea) {

        lineas.add(linea);
    }

    // =========================================
    // CALCULAR TOTAL
    // =========================================

    public double calcularTotal() {

        double total = 0;

        for (LineaPedido linea : lineas) {

            total += linea.calcularSubtotal();
        }

        return total;
    }

    // =========================================
    // MOSTRAR PEDIDO
    // =========================================

    public void mostrarPedido() {

        System.out.println("\n==============================");
        System.out.println("PEDIDO #" + id);
        System.out.println("==============================");

        for (LineaPedido linea : lineas) {

            System.out.println(linea);
        }

        System.out.println("------------------------------");
        System.out.println("TOTAL: $" + calcularTotal());
    }
}
