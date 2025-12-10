/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Migue
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        short maxShort = Short.MAX_VALUE;
        // Se requiere casting para forzar la operación cíclica
        short siguienteA_max = (short) (maxShort + 1); 
        System.out.println("Valor máximo de short: " + maxShort);
        System.out.println("Valor máximo de short + 1: " + siguienteA_max); 
    }   
}
