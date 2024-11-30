//algoritmo que defina que si una cifra es divisible entre 3 y 5

Algoritmo Divisible_3_y_5
	
	Definir cifra, menu Como Entero
	
	Repetir
		
		//menú
		Escribir "Continuar (1)"
		Escribir "Salir (2)"
		Leer menu
		Limpiar Pantalla
		
		Si menu = 1 Entonces
			
			Escribir "Escriba la cifra"
			leer cifra
			
			si cifra mod 3 = 0 y cifra mod 5 = 0 Entonces
				
				Escribir "La cifra es divisible entre 3 y 5"
				
			SiNo
				Escribir "La cifra no es divisible entre uno de los números"
				
			FinSi
			
		FinSi
		
		Escribir ""
		Escribir "<<Presione una tecla para continuar>>"
		Esperar Tecla
		Limpiar Pantalla
	Hasta Que menu = 2
	
FinAlgoritmo
