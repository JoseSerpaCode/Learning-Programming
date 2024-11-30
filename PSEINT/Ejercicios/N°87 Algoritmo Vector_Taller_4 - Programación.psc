//Defina un vector de 5 posiciones, llénelos y muestre la suma de sus elementos.

Algoritmo Vector_Taller_4
	
	Definir vec, i, j, suma Como Entero
	
	Dimension vec(5)
	
	Para i=1 hasta 5 Hacer
		
		Escribir "Leer numero"
		Leer vec(j)
		
		suma= suma+vec(j)
		
		j=j+1
		
	FinPara
	
	Escribir "La suma de los elementos dentro del vector es: ", suma
	
FinAlgoritmo
