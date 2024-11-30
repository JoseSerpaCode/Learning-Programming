//Realizar un algoritmo que reciba una hora con formato 24 horas y que devuelva la hora transcurrido un segundo

Algoritmo Horas
	Definir hh, mm, ss, suma, dd Como Real;
	
	Escribir "Ingresar Segundos";
	Leer ss;
	
	Escribir "Ingresar Minutos";
	Leer mm;
	
	Escribir "Ingresar Horas";
	Leer hh;
	
	dd = 0
	ss = ss + 1;
	
	Si ss = 60 Entonces;
		ss = 00;
		mm = mm + 1;
		
	FinSi;
	
	Si ss >= 61 Entonces;
		ss = ss - 60;
		mm = mm + 1;
		
	FinSi
	
	Si mm >= 60 Entonces;
		mm = 00;
		hh = hh + 1;
		
	FinSi;
	
	Si mm >= 61 Entonces;
		mm = mm - 60;
		hh = hh + 1;
		
	FinSi
	
	Si hh >= 24 Entonces;
		hh = 00
		dd = dd + 1
		
	FinSi
	
	Imprimir "El tiempo es:", dd, ":", hh, ":", mm, ":", ss;
	
FinAlgoritmo