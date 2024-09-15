//Realizar un algoritmo anterior para que funcione para 10 estudiantes

Algoritmo Notas_10_estudiantes_para
	
	Definir nota,total, i,e,n Como Real
	
	e=1
	
	Mientras e<=10 Hacer
		
		i=1
		
		Mientras i<=3 Hacer
			
			Escribir "Notas del estudiante numero: ", e
			Leer nota
			
			Total= (total+nota)
			nota= nota+1
			Limpiar Pantalla
			
			i=i+1
			
		FinMientras
		
		Total= total/3
		
		Escribir ""
		Escribir "El promedio de las notas del estudiante ", e, " es: ", total
		Escribir ""
		Escribir "<<presione una tecla para continuar"
		Esperar Tecla
		Limpiar Pantalla
		
		Total=0
		nota=0
		e=e+1
		
	FinMientras
	
FinAlgoritmo
