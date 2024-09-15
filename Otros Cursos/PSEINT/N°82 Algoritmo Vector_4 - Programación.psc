//Realizar un Algoritmo que almacene en un vector de tamaño N, los numeros digitados por el usuario los muestre en el orden en que fueron indicados y del ultimo al primero

Algoritmo Vector_4
	
	Definir vec, i, j, n como entero
	
	Escribir "Digite la dimensión del vector"
	Leer n
	
	Dimension vec(n)
	
	para i=1 hasta n Hacer
		
		Escribir "Leer numero"
		leer vec(j)
		j=j+1
		
	FinPara
	
	Escribir "__________________________________"
	Escribir "En el orden en que fueron indicados"
	
	para j=0 hasta j-1 Hacer
		
		Escribir vec(j)
		
	FinPara
	
	Escribir "__________________________________"
	Escribir "Del ultimo al primero"
	
	Para j=j-1 hasta 0 Hacer
		
		Escribir vec(j)
		
	FinPara
	
	
FinAlgoritmo