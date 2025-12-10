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

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño 'n' del lado del triángulo: ");
        int n = scanner.nextInt();
        
        for (int fila = 1; fila <= n; fila++) {
            // El bucle interno depende del contador del bucle externo (fila)
            for (int estrella = 1; estrella <= fila; estrella++) {
                System.out.print("*");
            }
            System.out.println(); // Salto de línea
        }
        scanner.close();
    }   
}
