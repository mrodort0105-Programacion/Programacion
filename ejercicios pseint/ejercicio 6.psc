Algoritmo media
		Definir anio_nacimiento, anio_actual, edad Como Entero;
		a�o_actual <- 2025; 
		Escribir "Introduce tu a�o de nacimiento:";
		Leer anio_nacimiento;
		edad <- a�o_actual - a�o_nacimiento;
		Si edad >= 18 Entonces
			Escribir "Con ", edad, " a�os, eres mayor de edad.";
		SiNo
			Escribir "Con ", edad, " a�os, eres menor de edad.";
		FinSi
FinAlgoritmo
