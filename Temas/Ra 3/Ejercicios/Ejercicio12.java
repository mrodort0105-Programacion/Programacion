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

public class Ejercicio12 {
    public static void main(String[] args) {
        int valor = -5;
        
        // Opción 1: Clase Math
        int absMath = Math.abs(valor);
        
        // Opción 2: Operador Ternario
        int absTernario = (valor < 0) ? -valor : valor;
        
        System.out.println("Absoluto (Math): " + absMath);
        System.out.println("Absoluto (Ternario): " + absTernario);
    }   
}
