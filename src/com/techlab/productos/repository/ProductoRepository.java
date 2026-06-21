package com.techlab.productos.repository;

import java.util.ArrayList;

import com.techlab.productos.model.Producto;

public class ProductoRepository {

    // =========================================
    // LISTA DE PRODUCTOS
    // =========================================

    private ArrayList<Producto> productos;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    public ProductoRepository() {

        productos = new ArrayList<>();
    }

    // =========================================
    // AGREGAR PRODUCTO
    // =========================================

    public void agregarProducto(Producto producto) {

        productos.add(producto);
    }

    // =========================================
    // LISTAR PRODUCTOS
    // =========================================

    public void listarProductos() {

        if (productos.isEmpty()) {

            System.out.println("No hay productos cargados.");
            return;
        }

        for (Producto producto : productos) {

            System.out.println(producto);
        }
    }

    // =========================================
    // BUSCAR PRODUCTO POR ID
    // =========================================

    public Producto buscarPorId(int id) {

        for (Producto producto : productos) {

            if (producto.getId() == id) {

                return producto;
            }
        }

        return null;
    }

    // =========================================
    // ELIMINAR PRODUCTO
    // =========================================

    public boolean eliminarProducto(int id) {

        Producto producto = buscarPorId(id);

        if (producto != null) {

            productos.remove(producto);
            return true;
        }

        return false;
    }

    // =========================================
    // OBTENER LISTA
    // =========================================

    public ArrayList<Producto> getProductos() {

        return productos;
    }
}