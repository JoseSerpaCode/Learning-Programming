//Algoritmo que reciba tres materias, cada una con sus respectivas tres notas, Diga que materia va ganando o perdiendo, nos muestre su promedio y al final el promedio total de las tres materias

Algoritmo Materias_Escolares
	
	Definir Materia_1, Materia_1A, Materia_1B, Materia_1C, Materia_2, Materia_2A, Materia_2B, Materia_2C, Materia_3, Materia_3A, Materia_3B, Materia_3C, suma1, suma2, suma3, suma4, promedio1, promedio2, promedio3, promedio4 Como Real;
	Definir Nombre1, Nombre2, Nombre3 Como Caracter;
	Definir SePuedeConvertir Como Logico
	SePuedeConvertir<-Verdadero
	
	Escribir "Escribir nombre de la primera materia";
	Leer Nombre1;
	

	Escribir "Nota 1";
	Leer Materia_1A;
	
	Escribir "Nota 2";
	Leer Materia_1B;
	
	Escribir "Nota 3";
	Leer Materia_1C;
	
	Si Materia_1A>5 o Materia_1B>5 o Materia_1C>5 o Materia_2A>5 o Materia_2B>5 o Materia_2C>5 o Materia_3A>5 o Materia_3B>5 o Materia_3C>5 Entonces
		Escribir "El numero debe ser menor o igual a 5"
		SePuedeConvertir<-Falso
	FinSi
	
	
	Si Materia_1A<0 o Materia_1B<0 o Materia_1C<0 o Materia_2A<0 o Materia_2B<0 o Materia_2C<0 o Materia_3A<0 o Materia_3B<0 o Materia_3C<0 Entonces
		Escribir "Debe ser positivo"
		SePuedeConvertir<-Falso

	FinSi
	
	Escribir "Notas de la segunda materia";
	Escribir "Escribir nombre de la segunda materia";
	Leer Nombre2;
	
	Escribir "Nota 1";
	Leer Materia_2A;
	
	Escribir "Nota 2";
	Leer Materia_2B;
	
	Escribir "Nota 3";
	Leer Materia_2C;
	
	Si Materia_1A>5 o Materia_1B>5 o Materia_1C>5 o Materia_2A>5 o Materia_2B>5 o Materia_2C>5 o Materia_3A>5 o Materia_3B>5 o Materia_3C>5 Entonces
		Escribir "El numero debe ser menor o igual a 5"
		SePuedeConvertir<-Falso
	FinSi
	
	
	Si Materia_1A<0 o Materia_1B<0 o Materia_1C<0 o Materia_2A<0 o Materia_2B<0 o Materia_2C<0 o Materia_3A<0 o Materia_3B<0 o Materia_3C<0 Entonces
		Escribir "Debe ser positivo"
		SePuedeConvertir<-Falso
	FinSi
	
	Escribir "Notas de la tercera materia";
	Escribir "Escribir nombre de la tercera materia";
	Leer Nombre3;
	
	Escribir "Nota 1";
	Leer Materia_3A;
	
	Escribir "Nota 2";
	Leer Materia_3B;
	
	Escribir "Nota 3";
	Leer Materia_3C;
	
	Si Materia_1A>5 o Materia_1B>5 o Materia_1C>5 o Materia_2A>5 o Materia_2B>5 o Materia_2C>5 o Materia_3A>5 o Materia_3B>5 o Materia_3C>5 Entonces
		Escribir "El numero debe ser menor o igual a 5"
		SePuedeConvertir<-Falso
	FinSi
	
	
	Si Materia_1A<0 o Materia_1B<0 o Materia_1C<0 o Materia_2A<0 o Materia_2B<0 o Materia_2C<0 o Materia_3A<0 o Materia_3B<0 o Materia_3C<0 Entonces
		Escribir "Debe ser positivo"
		SePuedeConvertir<-Falso
	FinSi

	
	Si SePuedeConvertir Entonces
		
		
		suma1 = Materia_1A + Materia_1B + Materia_1C;
		promedio1 = suma1/3;
		
		suma2 = Materia_2A + Materia_2B + Materia_2C;
		promedio2 = suma2/3;
		
		suma3 = Materia_3A + Materia_3B + Materia_3C;
		promedio3 = suma3/3;
		
		suma4 = promedio1 + promedio2 + promedio3;
		promedio4 = suma4/3;
		
		
		Imprimir "Nombre de la materia:", Nombre1;
		Imprimir "El promedio es:", promedio1;
		
		Si promedio1 <= 2.9 Entonces;
			
			Escribir "Has perdido la materia";
			
		SiNo
			
			Imprimir "Has pasado la materia"
			
		FinSi;
		
		
		Imprimir ".";
		
		
		Imprimir "Nombre de la materia:", Nombre2;
		Imprimir "El promedio es:", promedio2;
		
		Si promedio2 <= 2.9 Entonces;
			
			Escribir "Te vas tirando eso";
			
		SiNo
			
			Imprimir "Has pasado la materia"
			
		FinSi;

		Imprimir ".";
		
		
		Imprimir "Nombre de la materia:", Nombre3;
		Imprimir "El promedio es:", promedio3;
		
		Si promedio3 <= 2.9 Entonces;
			
			Escribir "Vas perdiendo la materia";
			
		SiNo
			
			Imprimir "Has pasado la materia"
			
		FinSi;
		
		Imprimir ".";
		
		
		Imprimir "El promedio de tus tres materias es:", promedio4;
		
		Si promedio4 <= 2.9 Entonces;
			
			Escribir "Te vas tirando el año";
			
		FinSi;
		
		Si promedio4 = 3 Entonces;
			
			Escribir "Casi que no la cuentas";
			
		FinSi;
		
		
		Si promedio4 = 5.0 Entonces;
			
			Escribir "Felicidades, para la nasa";
			
		FinSi;
		
		Imprimir ".";
		

	FinSi


	
	
FinAlgoritmo