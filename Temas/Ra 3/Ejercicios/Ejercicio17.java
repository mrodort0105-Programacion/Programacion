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

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce número 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Introduce número 2: ");
        int n2 = scanner.nextInt();
        
        if (n1 == n2) {
            System.out.println("Los números son iguales.");
        } else if (n1 > n2) {
            System.out.println("El número mayor es el primero: " + n1);
        } else {
            System.out.println("El número mayor es el segundo: " + n2);
        }
        scanner.close();
    }  
}
