/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad actual: ");
        int edadActual = scanner.nextInt();
        int edadProximoAnio = edadActual + 1;
        System.out.println("El año que viene tendrás " + edadProximoAnio + " años.");
        scanner.close();
    }
}