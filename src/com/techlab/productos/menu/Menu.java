package com.techlab.productos.menu;

import java.util.Scanner;

public abstract class Menu {

    // =========================================
    // SCANNER COMPARTIDO
    // =========================================

    protected Scanner scanner;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    public Menu() {

        scanner = new Scanner(System.in);
    }

    // =========================================
    // MÉTODO ABSTRACTO
    // =========================================

    public abstract void mostrarMenu();
}