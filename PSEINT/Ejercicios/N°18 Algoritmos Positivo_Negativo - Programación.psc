Algoritmo Positivo_Negativo
	// Leer dos numeros, si son positivos los multiplique y los sume, de lo contrario los divida y los reste, debe mmostrar el resultado
	
	Definir Mul, Suma, Div, Resta, N1, N2 Como Real
	
	Escribir "ingresar el valor de Num1";
	Leer N1;
	
	Escribir "ingresar el valor de Num2";
	Leer N2;
	
	Si N1>0 y N2>0 Entonces
		
		Mul = N1 * N2;
		Suma = N1 + N2;
		
		Imprimir "los numeros son positivos";
		Imprimir "El resultado de la multiplicacion es: ", Mul;
		Imprimir "El resultado de la suma es: ", Suma;
		
	SiNo
		
		Div = N1/N2
		Resta = N1 + N2
		
		Imprimir "El resultado de la divicion es: ", Div;
		Imprimir "El resultado de la resta es: ", Resta;
		
	FinSi
	
FinAlgoritmo
