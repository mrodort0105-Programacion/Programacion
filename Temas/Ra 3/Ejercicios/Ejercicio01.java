/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Migue
 */
package Ejercicios;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Declaración e Inicialización
        byte b = 100;
        short s = 30000;
        int i = 2000000;
        long l = 9000000000L;
        float f = 10.5f;
        double d = 20.75;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + b + ", short: " + s + ", int: " + i + ", long: " + l);
        System.out.println("float: " + f + ", double: " + d + ", char: " + c + ", boolean: " + bool);

        // Desbordamiento (Overflow)
        b = (byte) (Byte.MAX_VALUE + 1); 
        System.out.println("byte después de 127 + 1: " + b); 
    }
}
