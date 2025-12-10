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

public class Ejercicio32 {

    // Función que devuelve el máximo de dos enteros
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int resultado = max(40, 10);
        System.out.println("El máximo entre 40 y 10 es: " + resultado);
    }   
}
