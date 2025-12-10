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

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 15;
        int numE23;
        
        System.out.println("Rango a acertar: [" + a + ", " + b + "]");
        
        do {
            System.out.print("Introduce tu intento: ");
            numE23 = scanner.nextInt();
            
            if (numE23 < a || numE23 > b) {
                System.out.println("Fallaste. Inténtalo de nuevo.");
            }
        } while (numE23 < a || numE23 > b);
        
        System.out.println("¡Acertaste!");
        scanner.close();
    }
}   

