Algoritmo CalificacionPorNota
	// 1. Definir la variable de la nota como Real (para permitir decimales).
	Definir nota Como Real;
	
	// 2. Solicitar y leer la nota.
	Escribir "Introduce la nota num�rica (0 a 10):";
	Leer nota;
	
	// 3. Evaluar la nota contra la escala.
	
	// Primero, comprobamos que la nota est� dentro del rango v�lido (0 a 10).
	Si (nota >= 0) Y (nota <= 10) Entonces
		
		// 9-10: Sobresaliente
		Si nota >= 9 Entonces
			Escribir "La calificaci�n es: Sobresaliente ";
			
			// 7-8: Notable
			SinoSi nota >= 7 Entonces
			Escribir "La calificaci�n es: Notable ";
			
			// 6: Bien
			SinoSi nota >= 6 Entonces
			Escribir "La calificaci�n es: Bien ";
			
			// 5: Suficiente
			SinoSi nota >= 5 Entonces
			Escribir "La calificaci�n es: Suficiente ";
			
			// 0-4: Insuficiente (el resto, ya que filtramos de 5 en adelante)
		SiNo
			Escribir "La calificaci�n es: Insuficiente ";
		FinSi
		
	SiNo
		// Manejo de errores si la nota est� fuera del rango 0-10
		Escribir "Error: La nota debe estar entre 0 y 10.";
	FinSi
FinAlgoritmo