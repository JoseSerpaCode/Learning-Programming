//Leer las 3 notas de un estudiante y muestre su promedio

Algoritmo Notas_para
	
	Definir nota,total, i Como Entero
	
	Para i=1 Hasta 3 Con Paso 1 Hacer
		
		Escribir "Escriba nota"
		Leer nota
		
		Total= total + nota
		nota= nota+1
		Limpiar Pantalla
		
	FinPara
	
	Escribir "El promedio de las notas es: ", total/3
	
FinAlgoritmo
