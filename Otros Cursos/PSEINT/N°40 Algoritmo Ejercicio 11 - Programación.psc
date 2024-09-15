// Dado 7 números enteros, determine cuantos son negativos y cuantos  positivos, sume los positivos, sume los negativos y finalmente muestre 
//cuantos son positivos y su suma, muestre cuantos son negativos y su suma.

Algoritmo Cuantos_son_positivos_negativos
	
	Definir num, num1, num2, total1, total2, i Como Entero
	
	Para i = 1 Hasta 7 Con Paso 1 Hacer
		
		Escribir "Escriba un número ", i
		leer num
		
		Si num>0 Entonces
			
			Escribir "Es un número positivo"
			Escribir "_____________________________"
			Escribir ""
			
			num1=num1+1
			total2= total2+num
			
		SiNo
			
			Escribir "Es un número negativo"
			Escribir "_____________________________"
			Escribir ""
			
			num2=num2+1
			total1= total1+num
			
		FinSi
		
		num= num+1
		
	Fin Para
	
	Escribir "La cantidad de numeros positivos es de: ", num1
	Escribir "La suma de los numeros positivos es: ", total2
	Escribir ""
	Escribir "La cantidad de numeros negativos es de: ", num2
	Escribir "La suma de los numeros negativos es: ", total1
	Escribir ""
	
FinAlgoritmo
