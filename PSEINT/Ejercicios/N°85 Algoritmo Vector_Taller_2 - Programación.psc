//Defina un vector de 10 posiciones, llénelo y muestre el menor de sus elementos.

Algoritmo Vector_Taller_2
	
	Definir vec, i, j, Nmenor Como Entero
	
	Dimension vec(10)
	
	Para i=1 hasta 10 Hacer
		
		Escribir "Leer numero"
		Leer vec(j)
		j=j+1
		
	FinPara
	
	Nmenor=vec(0)
	
	Para j=0 hasta j-1 Hacer
		
		Si Nmenor>vec(j) Entonces
			
			Nmenor=vec(j)
			
		FinSi
		
	FinPara
	
	Escribir ""
	Escribir "El número menor es: ", Nmenor
	
FinAlgoritmo
