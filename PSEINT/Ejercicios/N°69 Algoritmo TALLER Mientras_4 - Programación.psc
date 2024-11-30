//Dadas las edades de 15 personas, muestre cuantas personas son mayores de edad y cuantas son menores

Algoritmo Edades_Determinacion_1_para
	
	Definir Edad, i, edad_1, edad_2 Como Entero
	
	i=1
	
	mientras i < 15 hacer
		
		Escribir "Escriba la edad de la persona número ", i
		leer Edad
		
		Si edad<18 Entonces
			
			Escribir "La persona es menor de edad"
			Escribir "_________________________________________________________"
			Escribir ""
			
			edad_1=edad_1+1
			
		FinSi
		
		Si edad>=18 Entonces
			
			Escribir "La persona es mayor de edad"
			Escribir "_________________________________________________________"
			Escribir ""
			edad_2=edad_2+1
			
		FinSi
		
		i=i+1
		
	Finmientras
	
	Escribir "_________________________________________________________"
	Escribir ""
	Escribir "La cantidad de personas que son menores de 18 años son: ", edad_1
	
	Escribir ""
	Escribir "La cantidad de personas que son mayores de edad son: ", edad_2
	
FinAlgoritmo
