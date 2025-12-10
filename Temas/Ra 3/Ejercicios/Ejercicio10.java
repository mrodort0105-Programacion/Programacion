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

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ventas Peras 1er Semestre (Kg): ");
        double perasS1 = scanner.nextDouble();
        System.out.print("Ventas Manzanas 2do Semestre (Kg): ");
        double manzanasS2 = scanner.nextDouble();
        
        // Se necesitarían los precios y otros semestres para completar el cálculo.
        double precioPeras = 1.5; // Supuesto
        double precioManzanas = 2.0; // Supuesto
        
        double beneficioTotal = (perasS1 * precioPeras) + (manzanasS2 * precioManzanas);
        
        System.out.printf("Beneficio Total (Parcial): %.2f€%n", beneficioTotal);
        scanner.close();
    }   
}
