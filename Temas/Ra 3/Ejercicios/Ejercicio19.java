/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Migue
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        int x = 8, y = 15, z = 3; 
        int mayor, medio, menor;
        
        if (x >= y && x >= z) {
            mayor = x;
            if (y >= z) { medio = y; menor = z; } else { medio = z; menor = y; }
        } else if (y >= x && y >= z) {
            mayor = y;
            if (x >= z) { medio = x; menor = z; } else { medio = z; menor = x; }
        } else { 
            mayor = z;
            if (x >= y) { medio = x; menor = y; } else { medio = y; menor = x; }
        }
        System.out.println("Números (8, 15, 3) ordenados: " + mayor + ", " + medio + ", " + menor);
    }   
}
