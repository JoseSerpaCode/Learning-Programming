//Defina un vector de 10 posiciones, llénelo con las edades de 10 personas luego cuente cuantas personas son menores de edad, cuantas son mayores de edad y muestre el resultado.

Algoritmo Vector_Taller_8
	
	Definir vec, i, j, edad_1, edad_2 Como Entero
	
	Dimension vec(10)
	
	Para i=1 hasta 10 Hacer
		
		Escribir "Leer la edad de la persona ", i
		Leer vec(j)
		
		Si vec(j)<18 Entonces
			
			Escribir "La persona es menor de edad"
			Escribir "_________________________________________________________"
			Escribir ""
			
			edad_1=edad_1+1
			
		FinSi
		
		Si vec(j)>=18 Entonces
			
			Escribir "La persona es mayor de edad"
			Escribir "_________________________________________________________"
			Escribir ""
			edad_2=edad_2+1
			
		FinSi
		
		j=j+1
		
	FinPara
	
	Escribir "_________________________________________________________"
	Escribir ""
	Escribir "La cantidad de personas que son menores de 18 años son: ", edad_1
	
	Escribir ""
	Escribir "La cantidad de personas que son mayores de edad son: ", edad_2

	
FinAlgoritmo
