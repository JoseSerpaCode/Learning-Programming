//Hacer un programa que sume los 10 primeros números pares, luego que sume los 10 primeros Impares y muestre la diferencia de ambos resultados.

Algoritmo Ejercicios_Mientras_5
	
	Definir i, par_, impar_, n, diferencia Como Entero
	
	n=10
	
	Mientras i mod 2=0 y i<=n Hacer
		
		par_ = par_+i
		i=i+2
		
	FinMientras
	
	i=1
	
	Mientras i<=n Hacer
		
		impar_ = impar_+i
		i=i+2
		
	FinMientras
	
	
	Escribir "La suma de los 10 primeros números pares es = ", par_
	Escribir "La suma de los 10 primeros números impares es = ", impar_
	
	diferencia= par_-impar_
	
	Escribir "la diferencia entre los pares y los impares es = ", diferencia
	
FinAlgoritmo
