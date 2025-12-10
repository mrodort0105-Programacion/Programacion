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

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edadComprobar = scanner.nextInt();
        // La expresión >= 18 devuelve un boolean
        boolean esMayorDeEdad = edadComprobar >= 18;
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        scanner.close();
    }   
}
