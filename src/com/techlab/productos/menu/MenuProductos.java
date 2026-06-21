package com.techlab.productos.menu;

import com.techlab.productos.model.Producto;
import com.techlab.productos.repository.ProductoRepository;

public class MenuProductos extends Menu {

    // =========================================
    // REPOSITORY
    // =========================================

    private ProductoRepository productoRepository;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    public MenuProductos() {

        productoRepository = new ProductoRepository();
    }

    // =========================================
    // MENÚ
    // =========================================

    @Override
    public void mostrarMenu() {

        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println(" MENÚ DE PRODUCTOS");
            System.out.println("==============================");
            System.out.println("1) Agregar producto");
            System.out.println("2) Listar productos");
            System.out.println("3) Buscar producto");
            System.out.println("4) Eliminar producto");
            System.out.println("0) Volver");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    agregarProducto();
                    break;

                case 2:
                    productoRepository.listarProductos();
                    break;

                case 3:
                    buscarProducto();
                    break;

                case 4:
                    eliminarProducto();
                    break;

                case 0:
                    System.out.println("Volviendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }

    // =========================================
    // AGREGAR PRODUCTO
    // =========================================

    private void agregarProducto() {

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Producto producto = new Producto(nombre, precio, stock);

        productoRepository.agregarProducto(producto);

        System.out.println("Producto agregado correctamente.");
    }

    // =========================================
    // BUSCAR PRODUCTO
    // =========================================

    private void buscarProducto() {

        System.out.print("Ingrese ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Producto producto = productoRepository.buscarPorId(id);

        if (producto != null) {

            System.out.println(producto);

        } else {

            System.out.println("Producto no encontrado.");
        }
    }

    // =========================================
    // ELIMINAR PRODUCTO
    // =========================================

    private void eliminarProducto() {

        System.out.print("Ingrese ID del producto a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean eliminado = productoRepository.eliminarProducto(id);

        if (eliminado) {

            System.out.println("Producto eliminado.");

        } else {

            System.out.println("Producto no encontrado.");
        }
    }
}