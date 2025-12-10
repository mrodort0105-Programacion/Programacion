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

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        int edadMax = Integer.MIN_VALUE;
        int edadMin = Integer.MAX_VALUE;
        
        System.out.print("Introduce una edad (-1 para terminar): ");
        edad = scanner.nextInt();
        
        while (edad != -1) {
            if (edad > 0) {
                if (edad > edadMax) { edadMax = edad; }
                if (edad < edadMin) { edadMin = edad; }
            }
            System.out.print("Introduce otra edad (-1 para terminar): ");
            edad = scanner.nextInt();
        }
        
        if (edadMax != Integer.MIN_VALUE) {
            System.out.println("Edad máxima: " + edadMax);
            System.out.println("Edad mínima: " + edadMin);
        }
        scanner.close();
    }   
}
