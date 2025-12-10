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

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numE22;
        
        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numE22 = scanner.nextInt();
            
            if (numE22 != 0) {
                String parImpar = (numE22 % 2 == 0) ? "par" : "impar";
                String signo = (numE22 > 0) ? "positivo" : "negativo";
                int cuadrado = numE22 * numE22;
                
                System.out.println("El número " + numE22 + " es " + parImpar + ", " + signo + " y su cuadrado es " + cuadrado + ".");
            }
        } while (numE22 != 0);
        System.out.println("Proceso terminado.");
        scanner.close();
    }
}
