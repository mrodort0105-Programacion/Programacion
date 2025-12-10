/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Migue
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        // Ejemplo de expresiones lógicas:
        boolean resultado1 = true || (10 == 5); // true (evaluación perezosa)
        boolean resultado2 = false && (10 != 10); // false (evaluación perezosa)
        
        System.out.println("true || (10 == 5): " + resultado1); 
        System.out.println("false && (10 != 10): " + resultado2); 
    }   
}
