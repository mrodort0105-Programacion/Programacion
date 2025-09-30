Algoritmo CalculadoraBasica
	// 1. Definir variables. Usamos Reales para permitir la divisi�n con decimales.
	Definir num1, num2, resultado Como Real;
	Definir operacion Como Caracter;
	
	// 2. Pedir y leer los dos n�meros.
	Escribir "--- CALCULADORA B�SICA ---";
	Escribir "Introduce el primer n�mero:";
	Leer num1;
	Escribir "Introduce el segundo n�mero:";
	Leer num2;
	
	// 3. Pedir y leer la operaci�n.
	Escribir "Introduce la operaci�n (+, -, *, /):";
	Leer operacion;
	
	// 4. Evaluar la operaci�n seleccionada.
	Segun operacion Hacer
		"+":
			resultado = num1 + num2;
			Escribir "Resultado de la SUMA: ", resultado;
		"-":
			resultado = num1 - num2;
			Escribir "Resultado de la RESTA: ", resultado;
		"*":
			resultado = num1 * num2;
			Escribir "Resultado de la MULTIPLICACI�N: ", resultado;
		"/":
			// Manejar el caso especial de divisi�n por cero
			Si num2 <> 0 Entonces
				resultado = num1 / num2;
				Escribir "Resultado de la DIVISI�N: ", resultado;
			SiNo
				Escribir "�ERROR! No se puede dividir por cero.";
			FinSi
		De Otro Modo:
			Escribir "�ERROR! Operaci�n no v�lida.";
	FinSegun
FinAlgoritmo