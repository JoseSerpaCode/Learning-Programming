// Dado un  grupo de 10 números (diferentes a cero), realice un algoritmo que permita determinar y dar como salida lo sgte:
// - # Mayor y # menor encontrado en el grupo
// - Cantidad de numeros mayores a 150
// - Cantidad de números negativos encontrados
// - Promedio de los positivos encontrados

Algoritmo Grupo_de_10_numeros_Mientras
	
	Definir numero_, i, numero_1, numero_2, total1, total, Nmayor, Nmenor Como Entero
	Definir promedio Como Real
	
	i=1
	
	Mientras i<=10 Hacer
		
		Escribir "Escriba la nota del numero ", i
		leer numero_
		
		Si numero_> Nmayor Entonces
			
			Nmayor=numero_
			
		FinSi		
		Si numero_>0 Entonces
			
			total=total+1
			total1= total1+numero_
			
		FinSi
		
		Si numero_>=150 Entonces
			
			numero_1=numero_1+1
			
		FinSi
		
		Si numero_<0 Entonces
			
			numero_2=numero_2+1
			
		FinSi
		
		numero_= numero_+1
		
		i=i+1
		
	FinMientras
	
	
	Escribir "_________________________________________________________"
	Escribir ""
	Escribir "El número mayor es: ", Nmayor
	Escribir ""
	Escribir "El número menor es: ", Nmenor
	Escribir ""
	Escribir "La cantidad de numeros mayores a 150 es de: ", numero_1
	Escribir ""
	Escribir "La cantidad de numeros negativos es de: ", numero_2
	
	//promedio
	
	promedio= total1/total
	
	Escribir ""
	Escribir "El promedio de los positivos es de: ", promedio
	
FinAlgoritmo
