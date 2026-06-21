package com.techlab.productos;

import java.util.Scanner;

import com.techlab.productos.menu.MenuPedidos;
import com.techlab.productos.menu.MenuProductos;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MenuProductos menuProductos = new MenuProductos();

        MenuPedidos menuPedidos = new MenuPedidos();

        int opcion;

        do {

            System.out.println("\n================================");
            System.out.println(" SISTEMA DE GESTIÓN TECHLAB");
            System.out.println("================================");
            System.out.println("1) Menú Productos");
            System.out.println("2) Menú Pedidos");
            System.out.println("0) Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    menuProductos.mostrarMenu();
                    break;

                case 2:
                    menuPedidos.mostrarMenu();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}