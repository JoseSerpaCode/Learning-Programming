//Realizar un vector de tamaño N y llenar las posiciones. Imprimir al revés

Algoritmo Vector_3
	
	Definir vec, i, j, n como entero
	
	Escribir "Digite la dimensión del vector"
	Leer n
	
	Dimension vec(n)
	
	para i=n-1 hasta 0 Hacer
		
		vec(j)=i
		j=j+1
		
	FinPara
	
	Para j=0 hasta j-1 Hacer
		
		Escribir vec(j)
		
	FinPara
	
	
FinAlgoritmo
