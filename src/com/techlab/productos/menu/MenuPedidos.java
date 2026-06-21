package com.techlab.productos.menu;

public class MenuPedidos extends Menu {

    // =========================================
    // CONSTRUCTOR
    // =========================================

    public MenuPedidos() {

        super();
    }

    // =========================================
    // MENÚ PEDIDOS
    // =========================================

    @Override
    public void mostrarMenu() {

        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println(" MENÚ DE PEDIDOS");
            System.out.println("==============================");
            System.out.println("1) Crear pedido");
            System.out.println("2) Listar pedidos");
            System.out.println("0) Volver");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    crearPedido();
                    break;

                case 2:
                    listarPedidos();
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
    // CREAR PEDIDO
    // =========================================

    private void crearPedido() {

        System.out.println("Función crear pedido en construcción.");
    }

    // =========================================
    // LISTAR PEDIDOS
    // =========================================

    private void listarPedidos() {

        System.out.println("Función listar pedidos en construcción.");
    }
}
