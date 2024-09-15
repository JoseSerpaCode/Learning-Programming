//Realizar un algortimo que sume dos vectores y me muestre el resultado

Algoritmo Vector_5
	
	Definir vec_1, vec_2, i, j, n, k, l, suma_1, suma_2, suma como entero
	
	Escribir "Para vector 1"
	Escribir "__________________________________"
	Escribir "Digite la dimensión del vector"
	Leer n
	
	Dimension vec_1(n)
	
	para i=1 hasta n Hacer
		
		Escribir "Leer numero"
		leer vec_1(j)
		
		suma_1 = suma_1+vec_1(j)
		
		j=j+1
		
	FinPara
	
	Escribir ""
	Escribir "Para vector 2"
	Escribir "__________________________________"
	Escribir "Digite la dimensión del vector"
	Leer k
	
	Dimension vec_2(k)
	
	para i=1 hasta k Hacer
		
		Escribir "Leer numero"
		leer vec_2(l)
		
		suma_2 = suma_2+vec_2(l)
		
		l=l+1
		
	FinPara
	
	suma=suma_1+suma_2
	
	Escribir "__________________________________"	
	Escribir "La suma de los dos vectores es:"
	Escribir suma
	
FinAlgoritmo
