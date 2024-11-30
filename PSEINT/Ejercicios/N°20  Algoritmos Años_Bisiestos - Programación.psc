//Algoritmo que defina si el año es bisiesto o no

Algoritmo AA_Bisiesto
	
	Definir aa, salir Como Entero;
	
	Repetir
		
		Limpiar Pantalla
		Escribir "Escriba el año";
		Leer aa
		
		Si aa mod 4 = 0 o aa mod 400 = 0 y aa mod 100 <> 0 Entonces
			
			Escribir "Es un año Bisiesto"
			
		SiNo
			
			Escribir "No es un año Bisiesto"
			
		FinSi
		
		Escribir ""
		Escribir "Presione una tecla para repetir"
		Esperar Tecla
		Limpiar Pantalla
		Escribir "Para salir presione (1). Si desea continuar presione cualquier tecla."
		Leer salir
		
		
	Hasta Que salir = 1
	
FinAlgoritmo