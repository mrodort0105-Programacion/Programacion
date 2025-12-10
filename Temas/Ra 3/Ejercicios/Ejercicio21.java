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

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();
        
        int dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28; // Simplificado, sin contar bisiestos
            default -> 0; 
        };
        
        if (dias > 0) {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes inválido.");
        }
        scanner.close();
    }    
}
