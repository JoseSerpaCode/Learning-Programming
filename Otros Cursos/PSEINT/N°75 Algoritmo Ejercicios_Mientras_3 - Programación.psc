//Hacer un programa que sume los 10 impares que le siguen al numero n

Algoritmo Ejercicios_Mientras_3
	
	Definir i, suma, n Como Entero
	
	Escribir "Escriba un número"
	leer n
	
	Si n mod 2 = 0 Entonces
		
		i=n+1
		
	Sino
		
		i=n+2
		
	FinSi
	
	suma=0
	
	Mientras i<=n+10 Hacer
		
		Suma = suma+i
		i=i+2
		
	FinMientras
	
	Escribir"La suma de los 10 números impares que le siguen al ", n, " es = ", suma
	
FinAlgoritmo