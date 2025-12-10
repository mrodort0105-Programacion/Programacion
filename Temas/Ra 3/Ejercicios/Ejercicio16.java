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
import java.util.Random;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int a = random.nextInt(10) + 1; // [1, 10]
        int b = random.nextInt(10) + 15; // [15, 24]
        
        System.out.print("Introduce un número entero: ");
        int numE16 = scanner.nextInt();
        
        if (numE16 >= a && numE16 <= b) {
            System.out.println("¡CORRECTO! El número " + numE16 + " está dentro del rango [" + a + ", " + b + "].");
        } else {
            System.out.println("INCORRECTO. Fuera del rango [" + a + ", " + b + "].");
        }
        scanner.close();
    }    
}
