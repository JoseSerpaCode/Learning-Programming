// La empresa JDK aplicara descuentos a sus clientes en las compras realizadas teniendo en cuenta la siguiente informacion:
// De acuerdo al monto sera aplicado el porcentaje que se esta indicando. mostrar el valor de la compra, el descuento y el valor a pagar.
// 100000 - 6%
// >150000 - 8%
// >240000 - 10%
// >=300000 - 12%
// >500000 - 15%
// >1000000 - 20%


Algoritmo Empresa_JDK

	Definir VVenta, VVenta1, Descuento Como Real
	
	Escribir "ingrese el valor de Compra";
	Leer  VVenta;
	
	Si Vventa < 100000 Entonces;
		
		Imprimir "_______________________________________________________________________"
		Imprimir "No se aplica descuento a la compra";
		Imprimir "_______________________________________________________________________"
		Imprimir "Valor a pagar: $", VVenta;
		Imprimir "_______________________________________________________________________"
		
	SiNo
		
		Si VVenta >= 100000 y VVenta <= 150000 Entonces;
			Descuento = VVenta * 0.06;
			VVenta1 = VVenta - Descuento;
			
			Imprimir "_______________________________________________________________________"
			Imprimir "su compra es de: $", VVenta, " y se aplicara un descuento del 6%";
			Imprimir "_______________________________________________________________________"
			Imprimir "Valor a pagar: $", VVenta1;
			Imprimir "_______________________________________________________________________"
			
		SiNo
			
			Si VVenta > 150000 y VVenta <= 240000 Entonces;
				Descuento = VVenta * 0.08;
				VVenta1 = VVenta - Descuento;
				
				Imprimir "_______________________________________________________________________"
				Imprimir "su compra es de: $", VVenta, " y se aplicara un descuento del 8%";
				Imprimir "_______________________________________________________________________"
				Imprimir "Valor a pagar: $", VVenta1;
				Imprimir "_______________________________________________________________________"
				
			SiNo
				
				Si VVenta > 240000 y VVenta < 300000 Entonces;
					Descuento = VVenta * 0.10;
					VVenta1 = VVenta - Descuento;
					
					Imprimir "_______________________________________________________________________"
					Imprimir "su compra es de: $", VVenta, " y se aplicara un descuento del 10%";
					Imprimir "_______________________________________________________________________"
					Imprimir "Valor a pagar: $", VVenta1;
					Imprimir "_______________________________________________________________________"
					
				SiNo
					
					Si VVenta >= 300000 y Vventa <= 500000 Entonces;
						Descuento = VVenta * 0.12;
						VVenta1 = VVenta - Descuento;
						
						Imprimir "_______________________________________________________________________"
						Imprimir "su compra es de: $", VVenta, " y se aplicara un descuento del 12%";
						Imprimir "_______________________________________________________________________"
						Imprimir "Valor a pagar: $", VVenta1;
						Imprimir "_______________________________________________________________________"
						
					SiNo
						
						Si VVenta > 500000 y Vventa <= 1000000 Entonces;
							Descuento = VVenta * 0.15;
							VVenta1 = VVenta - Descuento;
							
							Imprimir "_______________________________________________________________________"
							Imprimir "su compra es de: $", VVenta, " y se aplicara un descuento del 15%";
							Imprimir "_______________________________________________________________________"
							Imprimir "Valor a pagar: $", VVenta1;
							Imprimir "_______________________________________________________________________"
							
						SiNo
							
							Si VVenta > 1000000 Entonces;
								Descuento = VVenta * 0.20;
								VVenta1 = VVenta - Descuento;
								
								Imprimir "_______________________________________________________________________"
								Imprimir "su compra es de: $", VVenta, " y se aplicara un descuento del 20%";
								Imprimir "_______________________________________________________________________"
								Imprimir "Valor a pagar: $", VVenta1;
								Imprimir "_______________________________________________________________________"
								
							FinSi
							
						FinSi
						
					FinSi
					
				FinSi
				
			FinSi
			
		FinSi
		
	FinSi
	
	
FinAlgoritmo