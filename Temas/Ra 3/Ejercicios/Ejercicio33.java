/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Migue
 */
import java.lang.Math;

public class Ejercicio33 {

    // Sobrecarga 1: Máximo de dos números
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    
    // Sobrecarga 2: Máximo de tres números (utiliza la Sobrecarga 1)
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static void main(String[] args) {
        int resultado = max(75, 99, 50);
        System.out.println("El máximo entre 75, 99 y 50 es: " + resultado);
    }    
}
