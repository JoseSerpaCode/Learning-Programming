//El gigante del hogar ofrece una pomocion a sus clientes por motivos del dia del padre por compras superiores a $50.000 el descuento es del 5%, si la 
//compra es igual o mayor a $100.000 el descuento es del 8% si la compra es mayor de $400.000 el descuento es del 12% y en compras superiores a $600.000 el 
//descuento es del 15%, el almacen desea llevar un control de las ventas y descuentos aplicados, se debe mostrar un informe de las mismas

Algoritmo El_Gigante_Del_Hogar
	
	Definir Vventa, Vventa1, Descuento Como real;
	
	Escribir "Ingresar el valor de la compra";
	Leer Vventa;
	
	Si Vventa < 50000 Entonces
		
		Imprimir "No se aplica descuento";
		Imprimir "Valor a pagar: $", Vventa;
		
	FinSi
	Si Vventa >= 50000 y Vventa < 100000 Entonces;
		
		Descuento = Vventa * 0.05;
		Vventa1 = Vventa - Descuento
		
		Imprimir "Su compra es de ", Vventa, " y se le aplicará un descuento del 5%";
		Imprimir "Valor a pagar: $", Vventa1;
		
		
	FinSi
		
	Si Vventa >= 100000 y Vventa < 400000 Entonces;
			
		Descuento = Vventa * 0.08;
		Vventa1 = Vventa - Descuento
		
		Imprimir "Su compra es de ", Vventa, " y se le aplicará un descuento del 8%";
		Imprimir "Valor a pagar: $", Vventa1;
			
		FinSi
		
		Si Vventa >= 400000 y Vventa < 600000 Entonces;
			
			Descuento = Vventa * 0.12;	
			Vventa1 = Vventa - Descuento
			
			Imprimir "Su compra es de ", Vventa, " y se le aplicará un descuento del 12%";
			Imprimir "Valor a pagar: $", Vventa1;

	FinSi
		
	Si Vventa > 600000 Entonces;
					
		Descuento = Vventa * 0.15;
		Vventa1 = Vventa - Descuento
		
		Imprimir "Su compra es de ", Vventa, " y se le aplicará un descuento del 15%";
		Imprimir "Valor a pagar: $", Vventa1;
					
				
	FinSi
		
			
	
FinAlgoritmo
