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
import java.util.Random;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctas = 0;
        boolean juegoContinua = true;
        
        while (juegoContinua) {
            int num1 = random.nextInt(100) + 1; 
            int num2 = random.nextInt(100) + 1;
            int respuestaCorrecta = num1 + num2;
            
            System.out.print("¿Cuánto es " + num1 + " + " + num2 + "? ");
            int respuestaUsuario = scanner.nextInt();
            
            if (respuestaUsuario == respuestaCorrecta) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("¡Incorrecto! La respuesta era " + respuestaCorrecta + ".");
                juegoContinua = false; 
            }
        }
        System.out.println("Operaciones correctas: " + correctas);
        scanner.close();
    }   
}
