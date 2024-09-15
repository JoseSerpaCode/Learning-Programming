//Defina 2 vectores de 10 posiciones, llene el primer vector con números enteros, luego llene el segundo vector con el cuadrado de los elementos del primer vector.

Algoritmo Vector_Taller_7

	Definir vec, vec_2, i, j, l Como Entero
	
	Dimension vec(10), vec_2(10)
	
	Para i=0 hasta 10-1 Hacer
		
		Escribir "Leer numero"
		Leer vec(j)
		
		Escribir "Numero Vector 1: ", vec(j)
		Escribir ""
		
		j=j+1
	FinPara
	
	Escribir "_______________________________________"
	Escribir ""
	
	para j=0 hasta j-1 Hacer
		
		vec_2(l) = vec(j)^2
		
		Escribir "Numero Vector 2: ", vec_2(l)
		Escribir ""
		
		l=l+1
	FinPara
	
FinAlgoritmo
