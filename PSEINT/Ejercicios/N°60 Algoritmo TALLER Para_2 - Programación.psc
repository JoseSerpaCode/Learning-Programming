//Realizar un algoritmo anterior para que funcione para 10 estudiantes

Algoritmo Notas_10_estudiantes_para
	
	Definir nota,total, i,e Como Real
	
	Para e=1 Hasta 10 Hacer
		
		Para i=1 Hasta 3 Con Paso 1 Hacer
		
			Escribir "Notas del estudiante numero: ", e
			Leer nota
			
			Total= (total+nota)
			nota= nota+1
			Limpiar Pantalla
			
		FinPara
		
		Total= (total+nota)/3
		
		Escribir ""
		Escribir "El promedio de las notas del estudiante ", e, " es: ", total
		
		Escribir ""
		Escribir "<<presione una tecla para continuar"
		Esperar Tecla
		Limpiar Pantalla
		
		
	FinPara

FinAlgoritmo
