Algoritmo ContarHastaN
    // Declaraci�n de variables
    Definir num Como Entero;
    Definir i Como Entero;
    
    // Pedir el n�mero al usuario
    Escribir "Introduce un n�mero entero positivo:";
    Leer num;
    
    // Validar que el n�mero sea positivo
    Si num > 0 Entonces
        Escribir "Contando hasta ", num, ":";
        
        // Bucle para contar desde 1 hasta 'num'
        Para i <- 1 Hasta num Con Paso 1 Hacer
            // Mostrar el n�mero. El "Sin Saltar" evita el salto de l�nea.
            Si i < num Entonces
                Escribir i, ", " Sin Saltar;
            Sino
                // �ltimo n�mero, sin coma al final
                Escribir i Sin Saltar;
            FinSi
        FinPara
        
        // Agregar un salto de l�nea al final para limpiar la salida
        Escribir ""; 
    Sino
        Escribir "El n�mero debe ser un entero positivo.";
    FinSi
FinAlgoritmo