/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Migue
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        for (int tabla = 1; tabla <= 10; tabla++) { // Bucle externo (Tabla)
            System.out.println("\n--- Tabla del " + tabla + " ---");
            for (int k = 1; k <= 10; k++) { // Bucle interno (Multiplicador)
                System.out.println(tabla + " x " + k + " = " + (tabla * k));
            }
        }
    }  
}
