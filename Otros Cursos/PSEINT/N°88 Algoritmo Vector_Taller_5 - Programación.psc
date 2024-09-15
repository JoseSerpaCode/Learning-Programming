//Defina un vector de 10 posiciones, llénelos, cuente los elementos pares e impares y muestre el resultado.

Algoritmo Vector_Taller_5
	
	Definir vec, i, j, pares, impares Como Entero
	
	Dimension vec(10)
	
	Para i=0 hasta 10-1 Hacer
		
		Escribir "Leer numero"
		Leer vec(j)
		
		Si vec(j) mod 2=0 Entonces
			
			pares = pares+1
			
		SiNo
			
			impares = impares+1
			
		FinSi
		
		j=j+1
		
	FinPara
	
	Escribir ""
	Escribir "La cantida de números pares es: ", pares
	Escribir ""
	Escribir "La cantida de números impares es: ", impares
	Escribir ""
	
FinAlgoritmo
