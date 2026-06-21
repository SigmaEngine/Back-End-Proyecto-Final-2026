package com.techlab.productos.repository;

import java.util.ArrayList;

import com.techlab.productos.model.Pedido;

public class PedidoRepository {

    // =========================================
    // LISTA DE PEDIDOS
    // =========================================

    private ArrayList<Pedido> pedidos;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    public PedidoRepository() {

        pedidos = new ArrayList<>();
    }

    // =========================================
    // AGREGAR PEDIDO
    // =========================================

    public void agregarPedido(Pedido pedido) {

        pedidos.add(pedido);
    }

    // =========================================
    // LISTAR PEDIDOS
    // =========================================

    public void listarPedidos() {

        if (pedidos.isEmpty()) {

            System.out.println("No hay pedidos registrados.");
            return;
        }

        for (Pedido pedido : pedidos) {

            pedido.mostrarPedido();
        }
    }

    // =========================================
    // BUSCAR PEDIDO POR ID
    // =========================================

    public Pedido buscarPorId(int id) {

        for (Pedido pedido : pedidos) {

            if (pedido.getId() == id) {

                return pedido;
            }
        }

        return null;
    }

    // =========================================
    // GET LISTA
    // =========================================

    public ArrayList<Pedido> getPedidos() {

        return pedidos;
    }
}
