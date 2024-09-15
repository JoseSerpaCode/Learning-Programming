//Dadas las edades de 10 personas diga cuantas son mayores de edad y cuantas son menores de edad

Algoritmo Edades
	
	Definir Edad, edad_1, edad_2, i Como Entero
	
	Para i = 1 Hasta 10 Con Paso 1 Hacer
		
		Escribir "Escriba la edad de la persona número ", i
		leer Edad
		
		Si edad>=18 Entonces
			
			Escribir "La persona es mayor de edad"
			Escribir ""
			edad_1=edad_1+1
			
		SiNo
			
			Escribir "La persona es menor de edad"
			Escribir ""
			edad_2=edad_2+1
			
		FinSi
		
		edad= edad+1
		
	Fin Para
	
	Escribir "_________________________________________________________"
	Escribir ""
	Escribir "La cantidad de personas que son menores de 18 años son: ", edad_1
	
	Escribir ""
	Escribir "La cantidad de personas que son mayores a 18 años es: ", edad_2
	
	
FinAlgoritmo
