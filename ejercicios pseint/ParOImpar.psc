Algoritmo ParOImpar
	// 1. Definir la variable. Usamos Entero.
	Definir numero Como Entero;
	
	// 2. Solicitar y leer el n�mero.
	Escribir "Introduce un n�mero entero:";
	Leer numero;
	
	// 3. Evaluar el m�dulo (resto) de la divisi�n por 2.
	Si (numero MOD 2) = 0 Entonces
		// Si el resto es 0, es par.
		Escribir "El n�mero ", numero, " es PAR.";
	SiNo
		// Si el resto NO es 0 (ser� 1 en n�meros enteros), es impar.
		Escribir "El n�mero ", numero, " es IMPAR.";
	FinSi
FinAlgoritmo
