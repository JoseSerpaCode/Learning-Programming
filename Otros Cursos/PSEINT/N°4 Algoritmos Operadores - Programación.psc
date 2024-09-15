//Realizar un aslgoritmo que reciba 2 numeros, los sume, y el resultado de la suma lo quintuplique, los multiplique los dos numeros iniciales y al resultado de la multiplicacion le obtenga el 35%. Que Imprimir la suma, la multiplicacion, porcentajey quintuple.

Algoritmo Operadores
	
	Definir N1, N2, Sum, Mult, Quint, porcent Como Real;
	
	Escribir "El valor de N1";
	Leer N1;
	
	Escribir "El valor de N2";
	Leer N2;
	
	Sum = N1 + N2;
	Mult = N1 * N2;
	Quint = Sum * (5);
	porcent = (Mult * 35) / 100;
	
	Imprimir "	La suma es:",sum;
	Imprimir "La multiplicacion es",Mult;
	Imprimir "La quintuple es",Quint;
	Imprimir "El porcentaje es",porcent;
	
FinAlgoritmo
