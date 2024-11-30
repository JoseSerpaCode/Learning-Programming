//Realiza un algoritmo que reciba tres numeros, si el primero es menor que el segundo los sume, si el ultimo es menor que el primero  los multiplique y nos muestre el resultado de cada operacion.

Algoritmo Menor_Mayor_que
	
	Definir N1, N2, N3, suma, mult Como Real;
	
	Escribir "El valor de N1";
	Leer N1;
	
	Escribir "El valor de N2";
	Leer N2;
	
	Escribir "El valor de N3";
	Leer N3;
	
	Si N1 < N2 Entonces;
		suma = N1 + N2;
		Imprimir "La suma es:", suma;
	FinSi;
	
	Si N3 < N1 Entonces;
		mult = N3 * N2;
		Imprimir "La multiplicacion es:", mult;
	FinSi;
	
FinAlgoritmo
