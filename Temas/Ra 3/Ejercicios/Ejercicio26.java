/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Migue
 */
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        
        System.out.println("Aplicación Eco iniciada. Escribe 'salir' para terminar.");
        
        do {
            System.out.print(">> ");
            entrada = scanner.nextLine();
            if (!entrada.equalsIgnoreCase("salir")) {
                System.out.println("Eco: " + entrada);
            }
        } while (!entrada.equalsIgnoreCase("salir"));
        
        System.out.println("Aplicación Eco terminada.");
        scanner.close();
    }  
}
