/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Migue
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        // AND (&&): requiere que ambos sean true
        boolean logicaAND = (10 > 5) && (20 < 10); // true && false -> false
        
        // OR (||): requiere que solo uno sea true
        boolean logicaOR = (10 > 5) || (20 < 10); // true || false -> true
        
        System.out.println("Resultado AND: " + logicaAND);
        System.out.println("Resultado OR: " + logicaOR);
    }    
}
