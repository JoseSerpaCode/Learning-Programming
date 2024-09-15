// Algoritmo que reciba 3 numeros y devuelva el mayor de ellos 

Algoritmo El_Mayor_de_3
	Definir N1, N2, N3 Como Real;
	
	Escribir "ingrese el primer número";
	Leer N1;
	
	Escribir "ingrese el segundo número";
	Leer N2; 
	
	Escribir "ingrese el tercer número";
	Leer N3;
	
	
	si N1 > N2 Entonces
		si N1 > N3 Entonces
			Imprimir "el número mayor es:" N1;
		SiNo
			Imprimir "el número mayor es:" N3;
		FinSi
	FinSi
	
	si N2 > N1 Entonces
		si N2 > N3 Entonces
			Imprimir "el número mayor es:" N2;
		SiNo
			Imprimir "el número mayor es:" N3;
		FinSi
	FinSi
	
FinAlgoritmo
