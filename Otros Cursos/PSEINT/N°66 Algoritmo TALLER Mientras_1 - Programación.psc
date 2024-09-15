//Leer las 3 notas de un estudiante y muestre su promedio

Algoritmo Notas_Mientras
	
	Definir nota,total, i Como Entero
	
	Mientras i<3 Hacer
		
		Escribir "Escriba nota"
		Leer nota
		
		Total= total + nota
		nota= nota+1
		Limpiar Pantalla
		
		i=i+1
		
	FinMientras
	
	Escribir "El promedio de las notas es: ", total/3
	
FinAlgoritmo
