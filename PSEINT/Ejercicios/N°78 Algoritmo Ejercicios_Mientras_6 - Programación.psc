//Hacer un programa que sume los 10 números pares que le siguen a N, luego que sume los 10 Impares que le siguen a M y muestre la diferencia de ambos resultados.

Algoritmo Ejercicios_Mientras_6
	
	Definir i, suma, M, n, suma_impar, suma_par, diferencia Como Entero
	
	Escribir "Escriba un número para impares"
	leer M
	Escribir ""
	Escribir "Escriba un número para pares"
	leer n
	
	Si M mod 2 = 0 Entonces
		
		i=M+1
		
	Sino
		
		i=M+2
		
	FinSi
	
	suma_impar=0
	
	Mientras i<=M+10 Hacer
		
		suma_impar = suma_impar+i
		i=i+2
		
	FinMientras
	
	Escribir"La suma de los 10 números impares que le siguen al ", M, " es = ", suma_impar
	
	Si n mod 2 = 0 Entonces
		
		i=n
		
	Sino
		
		i=n+1
		
	FinSi
	
	suma_par=0
	
	Mientras i<=n+10 Hacer
		
		suma_par = suma_par+i
		i=i+2
		
	FinMientras
	
	Escribir"La suma de los 10 números pares que le siguen al ", n, " es = ", suma_par
	
	//La diferencia siempre debé ser positiva
	
	diferencia= suma_par-suma_impar
	
	Si diferencia<0 Entonces
		
		diferencia = diferencia-(2*diferencia)
		
	FinSi
	
	Escribir "la diferencia entre los pares y los impares es = ", diferencia
	
	
FinAlgoritmo
