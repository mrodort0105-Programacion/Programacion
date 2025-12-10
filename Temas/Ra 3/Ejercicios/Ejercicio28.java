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

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int numFactorial = scanner.nextInt();
        long factorial = 1;
        
        if (numFactorial < 0) {
            System.out.println("Factorial no definido para números negativos.");
        } else {
            for (int j = 1; j <= numFactorial; j++) {
                factorial *= j;
            }
            System.out.println("El factorial de " + numFactorial + " es: " + factorial);
        }
        scanner.close();
    }    
}
