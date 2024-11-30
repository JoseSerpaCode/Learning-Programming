// Dada la Nota Definitiva de 10 estudiantes, realice un algoritmo que permita calcular y dar como salida lo siguiente: 
// - Cantidad de Alumnos Aprobados (Nota >=6)
// - Cantidad de Alumnos Reprobados (Nota <6)
// - Promedio General de Notas

Algoritmo Notas_estudiantes_promedio

	Definir nota, i, nota1, nota2, total1, total2 Como Entero
	Definir promedio Como Real

Para i = 1 Hasta 10 Con Paso 1 Hacer
	
	Escribir "Escriba la nota del estudiante ", i
	leer nota
	
	Si nota>=6 Entonces
		
		Escribir "El estudiante ha aprobado"
		Escribir "_________________________________________________________"
		Escribir ""
		
		nota1=nota1+1
		total1= total1+nota
		
	SINO
		
		Escribir "El estudiante ha reprobado"
		Escribir "_________________________________________________________"
		Escribir ""
		
		nota2=nota2+1
		total2= total2+nota
		
	FinSi
	
	nota= nota+1
	
Fin Para

Escribir "_________________________________________________________"
Escribir ""
Escribir "La cantidad de estudiantes que aprobaron fueron: ", nota1

Escribir ""
Escribir "La cantidad de estudiantes que reprobaron fueron: ", nota2

//promedio

promedio= total1+total2/5

Escribir ""
Escribir "El promedio de las notas es de: ", promedio

FinAlgoritmo

