//Defina un vector de 10 posiciones , llénelo y muestre el mayor de sus elementos

Algoritmo Vector_Taller_3
	
	Definir vec, i, j, Nmayor Como Entero
	
	Dimension vec(10)
	
	Para i=1 hasta 10 Hacer
		
		Escribir "Leer numero"
		Leer vec(j)
		j=j+1
		
	FinPara
	
	Nmayor=vec(0)
	
	Para j=0 hasta j-1 Hacer
		
		Si Nmayor<vec(j) Entonces
			
			Nmayor=vec(j)
			
		FinSi
		
	FinPara
	
	Escribir ""
	Escribir "El número mayor es: ", Nmayor
	
FinAlgoritmo