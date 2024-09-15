//Dadas las edades de 10 personas, muestre cuantas personas están en edades menores o iguales a 18 años, cuantas personas hay mayores
//de 28 y menor e igual a 32 años y cuantas personas hay mayres de 32 años

Algoritmo Edades_Determinacion_2_para
	
	Definir Edad, i, edad_1, edad_2, edad_3 Como Entero
	
	Para i = 1 Hasta 10 Con Paso 1 Hacer
		
		Escribir "Escriba la edad de la persona número ", i
		leer Edad
		
		Si edad<=18 Entonces
			
			Escribir "La persona es menor de edad"
			Escribir "_________________________________________________________"
			Escribir ""
			
			edad_1=edad_1+1
			
		FinSi
		
		Si edad>18 y edad<=32 Entonces
			
			Escribir "La persona es mayor de edad y tiene entre 19 y 32 años"
			Escribir "_________________________________________________________"
			Escribir ""
			edad_2=edad_2+1
			
		FinSi
		
		Si edad>32 Entonces
			
			Escribir "La persona es mayor de edad y tiene entre 32 años o más"
			Escribir "_________________________________________________________"
			Escribir ""
			edad_3=edad_3+1
			
		FinSi
		
		edad= edad+1
		
	Fin Para
	
	Escribir "_________________________________________________________"
	Escribir ""
	Escribir "La cantidad de personas que son menores de 18 años son: ", edad_1
	
	Escribir ""
	Escribir "La cantidad de personas que tienen entre 19 años y 32 años son: ", edad_2
	
	Escribir ""
	Escribir "La cantidad de personas que tienen entre 32 años o más: ", edad_3
	
	
	
FinAlgoritmo