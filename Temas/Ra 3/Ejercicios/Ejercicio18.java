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

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        double numDecimal = scanner.nextDouble();
        
        // Casi-cero: (-1 < x < 1) Y (x != 0)
        if (numDecimal > -1.0 && numDecimal < 1.0 && numDecimal != 0.0) {
            System.out.println(numDecimal + " es un número casi-cero.");
        } else {
            System.out.println(numDecimal + " NO es un número casi-cero.");
        }
        scanner.close();
    }   
}
