/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Migue
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        // Condiciones: (!lluvia && tareas) || biblioteca
        boolean estaLloviendo = false;
        boolean tareasFinalizadas = true;
        boolean necesitaBiblioteca = false;
        
        boolean puedeSalir = (!estaLloviendo && tareasFinalizadas) || necesitaBiblioteca;
        System.out.println("¿Puede salir a la calle? " + puedeSalir); 
    } 
}
