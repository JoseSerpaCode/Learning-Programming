// Defina 2 vectores de 10 posiciones, llene el primer vector con números enteros, luego llene el segundo vector con los elementos del primer vector de tal manera que el elementos de la posición 0 quede en la posición 9, 
//el elemento de la posición 1 quede en la posición 8 y así sucesivamente.

Algoritmo Vector_Taller_10
	
	Definir vec, vec_2, i, j, l Como Entero
	
	Dimension vec(10), vec_2(10)
	
	Para i=0 hasta 10-1 Hacer
		
		Escribir "Leer numero"
		Leer vec(j)
		
		Escribir "posición ", i " Vector 1: ", vec(j)
		Escribir "____________________________________"
		Escribir ""
		
		j=j+1
	FinPara
	
	para j=10 hasta 1 Hacer
		
		vec_2(l) = vec(j-1)
		
		Escribir "posición ", l " Vector 2: ", vec_2(l)
		Escribir ""
		
		l=l+1
	FinPara
	
FinAlgoritmo
