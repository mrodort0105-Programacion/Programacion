Algoritmo MayorOMenorOIgual
	// 1. Definir las variables como Reales para permitir decimales, aunque Entero tambi�n funcionar�a.
	Definir num1, num2 Como Real;
	
	// 2. Solicitar y leer los dos n�meros.
	Escribir "Introduce el primer n�mero:";
	Leer num1;
	Escribir "Introduce el segundo n�mero:";
	Leer num2;
	
	// 3. Evaluar las condiciones.
	Si num1 > num2 Entonces
		Escribir "El n�mero mayor es: ", num1;
		SinoSi num2 > num1 Entonces
		Escribir "El n�mero mayor es: ", num2;
	SiNo
		// Si no se cumple ni num1 > num2, ni num2 > num1, 
		// la �nica opci�n restante es que sean iguales.
		Escribir "Los n�meros son iguales: ", num1;
	FinSi
FinAlgoritmo