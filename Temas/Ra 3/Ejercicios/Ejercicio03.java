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

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el año actual: ");
        int anioActual = scanner.nextInt();
        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        int edadCalculada = anioActual - anioNacimiento;
        System.out.println("Tu edad es: " + edadCalculada + " años.");
        scanner.close();
    }
}  
