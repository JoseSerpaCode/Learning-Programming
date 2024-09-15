// Dado 5 números determine cuantos son divisibles por 3 y muestre el resultado.

Algoritmo Divisible_entre_3
	
	Definir i, num Como entero
	
	Para i = 1 Hasta 5 Con Paso 1 Hacer
		
		Escribir "Escriba un número ", i
		leer num
		
		Si num mod 3 = 0 Entonces
			
			Escribir "El número es divisible entre tres y su división es: ", num/3
			Escribir "_________________________________________________________"
			Escribir ""
			
		SiNo
			
			Escribir "El número no es divisible de tres"
			Escribir "_________________________________________________________"
			Escribir ""
			
		FinSi
		
		num=num+1
		
	FinPara
	
FinAlgoritmo
