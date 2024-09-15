//Realizar un algoritmo que muestre en pantalla la tabla de multiplicar del número ingresado de forma decreciente y creciente

Algoritmo Creciente_y_decreciente
	
	Definir num, a Como Entero
	
	a=0
	
	Escribir "Tabla de multiplicar"
	Escribir ""
	Escribir "Ingrese el número del que desea ver su tabla de multiplicar"
	leer num
	Escribir ""
	
	mientras a<10 Hacer
		
		Escribir num, "x", a, " = ", num*a
		a=a+1
		
	FinMientras
	
	Escribir ""
	Escribir "______________________________________"
	Escribir ""
	
	mientras a>0 Hacer
		
		Escribir num, "x", a, " = ", num*a
		a=a-1
		
	FinMientras
	
	
FinAlgoritmo
