// Dado la nota final de 6 estudiantes, si las notas son de 0 a 500, muestre 
//cuantos estudiantes obtuvieron notas menores e iguales a 200 puntos, 
//cuantos obtuvieron notas mayores de 200 y menores e iguales de 400 y 
//cuantos obtuvieron notas mayores de 400 puntos.


Algoritmo Notas_estudiantes
	
	Definir nota, i, nota1, nota2, nota3, nota4 Como Entero
	
	Para i = 1 Hasta 6 Con Paso 1 Hacer
		
		Escribir "Escriba la nota del estudiante ", i
		leer nota
		
		Si nota<=200 Entonces
			
			nota1=nota1+1
			
		FinSi
		
		Si nota>200 y nota<=400 Entonces
			
			nota2=nota2+1
			
		FinSi
		
		
		Si nota>400 y nota<=500 Entonces
			
			nota3=nota3+1
			
		FinSi
		
		nota= nota+1
		
	Fin Para
	
	Escribir "_________________________________________________________"
	Escribir ""
	Escribir "La cantidad de estudiantes que obtuvieron notas iguales o menores a 200 fueron: ", nota1
	
	Escribir ""
	Escribir "La cantidad de estudiantes que obtuvieron notas mayores que 200 y menores o iguales a 400 fueron: ", nota2
	
	Escribir ""
	Escribir "La cantidad de estudiantes que obtuvieron notas mayores a 400 fueron: ", nota3
	
FinAlgoritmo
