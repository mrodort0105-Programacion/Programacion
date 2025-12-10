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

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura;
        int alturaMax = Integer.MIN_VALUE; 
        boolean arbolesRegistrados = false;

        System.out.println("Introduce la altura de los árboles en cm (-1 para terminar):");
        
        while (true) {
            System.out.print("Altura: ");
            if (scanner.hasNextInt()) {
                altura = scanner.nextInt();
                
                if (altura == -1) {
                    break; 
                }
                
                if (altura > 0) {
                    if (altura > alturaMax) {
                        alturaMax = altura; 
                    }
                    arbolesRegistrados = true;
                }
            } else {
                scanner.next(); // Limpiar entrada inválida
            }
        }

        if (arbolesRegistrados) {
            System.out.println("La altura del árbol más alto registrado es: " + alturaMax + " cm.");
        } else {
            System.out.println("No se registraron árboles válidos.");
        }
        scanner.close();
    }    
}
