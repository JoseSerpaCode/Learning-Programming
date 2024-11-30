//Algoritmo juego: Existen tres puertas, se debe elegir la puerta correcta. 

Algoritmo Juego_Puerta
	
	Definir puerta_elegida, puerta_correcta, puerta_random, intentos,num_secreto,num_ingresado, menu, sendero, decision_1, decision_1duende, decision_1lobos, decision_2, dado_2, moneda, moneda_decision, matematicas Como Entero
	Definir respuesta_planta_1, respuesta_planta_1B, respuesta_planta_2, respuesta_planta_3, respuesta_Madrid, respuesta_Barcelona, respuesta_Fisica, papel1, papel2, casa_final Como Entero
	Definir nombre Como caracter
	Definir ejercicio_1, ejercicio_2, ejercicio_3, ejercicio_V, ejercicio_4, ejercicio_5, ejercicio_6 Como Real
	
	Repetir
		
		intentos <- 5
		moneda <- azar(2)+1
		num_secreto <- azar(40)+1
		puerta_correcta <- azar(6)+1
		puerta_random <- azar(2)+1
		matematicas<- azar(2)+1
		dado_2 = azar (6)+1
		
		Escribir "Bienvenido a The door"
		Escribir "   Jugar (1)"
		Escribir "   Información (2)"
		Escribir "   Créditos (3)"
		Escribir "   Salir (4)"
		Escribir ""
		Leer menu
		
		Limpiar Pantalla
		
		Si menu=2 Entonces
			
			Escribir "                             -Información-"
			Escribir ""
			Escribir "-The door- es un juego creado por Jose2480 en el año 2022. Toma elementos de Azar y habilidad, ademas de contar con la posibilidad de tomar decisiones en ciertas situaciones; en este, la suerte y la lógica jugarán un papel fundamental en la vida de tu personaje."
			Escribir ""
			Escribir "Es un juego que puedes terminar en una tecla o puede que se extienda hasta el punto de toparte con seres que querrán jugar contigo, subdividiendose en pequeñas historias; al final de cada una de estas puede que consigas un logro. "
			Escribir "Creado: 9/07/22"
			
		FinSi
		
		Si menu=3 Entonces
			
			Escribir "                                -Créditos-"
			Escribir ""
			Escribir "Creado por: José Serpa M"
			Escribir ""
			Escribir "Guíon: José Serpa M"
			Escribir ""
			Escribir "Todo lo que tenga que ver con créditos: Jose Serpa M"
			
		FinSi
		
		
		Si menu=4 Entonces
			
			Limpiar Pantalla
			Escribir ""
			Escribir "Vuelve pronto :D"
			Escribir ""
			
		FinSi
		
		Si menu>=5 o menu<=0 Entonces
			Limpiar Pantalla
			Escribir "Opcion no valida"
		FinSi
		
		
		Si menu=1 Entonces
			
			Limpiar Pantalla
			Escribir "Escribe tu nombre: "
			Leer nombre
			
			
			Limpiar Pantalla
			Escribir "Deberás elegir la puerta correcta para escapar de la habitación."
			Escribir "Si fallas te enfrentarás a una aventura llena de peligros y adversidades que pueden significar tu muerte, pero si adivinas escaparás."
			Escribir ""
			Escribir "Puertas a elegir:"
			Escribir "   Puerta (1)"
			Escribir "   Puerta (2)"
			Escribir "   Puerta (3)"
			Escribir "   Puerta (4)"
			Escribir "   Puerta (5)"
			Escribir "   Puerta (6)"
			Escribir "   Salir  (7)"
			Escribir "Elija una opción (1-7): "
			Leer puerta_elegida
			
			Mientras puerta_elegida>=8 o puerta_elegida<=0 hacer
				Limpiar Pantalla
				Escribir "Deberás elegir la puerta correcta para escapar de la habitación."
				Escribir "Si fallas te enfrentarás a una aventura llena de peligros y adversidades que pueden significar tu muerte, pero si adivinas escaparás."
				Escribir ""
				Escribir "Puertas a elegir:"
				Escribir "   Puerta (1)"
				Escribir "   Puerta (2)"
				Escribir "   Puerta (3)"
				Escribir "   Puerta (4)"
				Escribir "   Puerta (5)"
				Escribir "   Puerta (6)"
				Escribir "   Salir  (7)"
				Escribir "Elija una opción (1-7): "
				Leer puerta_elegida
			FinMientras
			
			
			Segun puerta_elegida Hacer
				
				1, 2, 3, 4, 5 o 6: //eleccion puerta
					Si puerta_correcta = puerta_elegida Entonces
						
						Escribir "*Cruzas la puerta, al parecer es la correcta, porque has conseguido salir al mundo, uno real.*"
						Escribir ""
						Esperar 1 Segundos
						Escribir "*Sientes una gran satisfacción dentro de ti, pero a la vez te comienza a invadir la curiosidad por saber que más había en las demás puertas.*"
						Escribir ""
						Esperar 1 Segundos
						Escribir "<<Presione una tecla para continuar>>"
						Esperar Tecla
						Limpiar Pantalla
						Escribir ""
						Escribir "GAME OVER"
						
					FinSi
					
					Si puerta_correcta<>puerta_elegida Entonces
						
						Si puerta_elegida > puerta_correcta o puerta_elegida < puerta_correcta Entonces
							
							Escribir "*Se escucha una voz a la distancia que te dice: Puerta incorrecta, pero  aún puedes continuar*"
							Escribir "La puerta correcta era: puerta ", puerta_correcta
							
						FinSi
						
						Escribir ""
						Escribir "<<Presione una tecla para continuar>>"
						Esperar Tecla
						Limpiar Pantalla
						
						Si puerta_random=1 Entonces
							
							Esperar 1 Segundos
							Escribir "*Entras a la puerta, pero caes en un vacio que parece no acabar. Por fin  tocas suelo, no has muerto de milagro, pero ahora tendras que enfrentarte con una bestia para salvar tu vida*"
							Escribir ""
							Esperar 1 Segundos
							Escribir "-BESTIA: ","Jugaremos con un poco de azar, si aciertas el número podrás vivir, si en cambio fallas, moriras. Empecemos.*"
							Escribir ""
							Escribir "Adivine el número (de 1 a 40):"
							Leer num_ingresado
							
							Mientras num_secreto<>num_ingresado & intentos>1 Hacer
								Si num_secreto>num_ingresado Entonces
									Escribir "Muy bajo"
								SiNo 
									Escribir "Muy alto"
								FinSi
								intentos <- intentos-1
								Escribir "Le quedan ",intentos," intentos:"
								Leer num_ingresado
							FinMientras
							
							Si num_secreto=num_ingresado Entonces
								Esperar 0.5 Segundos
								Escribir ""
								Escribir "Exacto! has adivinado"
								Escribir ""
								Esperar 1 Segundos
								Escribir "*La bestia se aparta del camino y te deja continuar. Tras él, un camino aparece.*"
								Escribir ""
								Esperar 1 Segundos
								Escribir "<<Presione una tecla para continuar>>"
								
								
								Esperar Tecla
								Limpiar Pantalla
								
								Escribir "*Mientras caminas, ves como un conejo se acerca a ti*"
								Escribir ""
								Esperar 1 Segundos
								Escribir ""
								Escribir"__**_**"
								Escribir"_**___**"
								Escribir"_**___**_________****"
								Escribir"_**___**_______**___****"
								Escribir"_**__**_______*___**___**"
								Escribir"__**__*______*__**__***__**"
								Escribir"___**__*____*__**_____**__*"
								Escribir"____**_**__**_**________**"
								Escribir"____**___**__**"
								Escribir"___*___________*"
								Escribir"__*_____________*"
								Escribir"_*____0_____0____*"
								Escribir"_*_______@_______*"
								Escribir"_*_______________*"
								Escribir"___*_____U_____*"
								Escribir"_____**_____**"
								Esperar 1 Segundos
								Escribir ""
								Escribir "<<Presione una tecla para continuar>>"
								Esperar Tecla
								Limpiar Pantalla
								Esperar 1 Segundos
								Escribir "-Conejo: Juguemos con las matemáticas."
								
								Escribir ""
								Escribir "<<Presione una tecla para continuar>>"
								Esperar Tecla
								Limpiar Pantalla
								
								Si matematicas=1 Entonces
									
									Esperar 1 Segundos
									Escribir "Ejercicio 1: ¿Cuanto es 7x8?"
									Leer ejercicio_1
									
									Si ejercicio_1 = 56 Entonces
										
										Escribir "Es correcto, siguiente"
										
										Escribir ""
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										
										Escribir "Ejercicio 2: ¿Cuanto es 16 elevado al cuadrado?"
										Leer ejercicio_2
										
										Si ejercicio_2 = 256 Entonces
											
											Escribir "Es correcto, no utilices calculadora ehhh"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir "Ejercicio 3: ¿Cuanto es 230/15?"
											Leer ejercicio_3
											
											Si ejercicio_3 = 15.3 Entonces
												
												Escribir "¿No serás un genio de las matematicas?"
												Escribir ""
												
											SiNo //segundo error ejercicio 2-3
												
												Escribir "Que barbaridad, enserio no mereces estar en este mundo"
												Escribir "Menos mal que es tu primer error"
												Escribir ""
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												
											FinSi
											
											
										SiNo //primer error ejercicio 2-2
											
											Escribir "Vaya...primer error, al segundo fallo empezarás a ver la luz."
											
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir "Ejercicio 3: ¿Cuanto es 100*10/20?"
											Leer ejercicio_3
											
											Si ejercicio_3 = 5 Entonces
												
												Escribir "¿No serás un genio de las matematicas?"
												Escribir ""
												
											SiNo //segundo error ejercicio 2-3
												
												Escribir "Que barbaridad, enserio no mereces estar en este mundo"
												
												Escribir ""
												Esperar 1 Segundos
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Escribir ""
												Escribir "GAME OVER"
											FinSi
											
										FinSi
										
										
									SiNo //primer error ejercicio 1-1
										
										
										Escribir "Vaya...primer error, al segundo fallo empezarás a ver la luz."
										
										Escribir ""
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										
										Escribir "Ejercicio 2: ¿Cuanto es 23 * 20?"
										Leer ejercicio_2
										
										Si ejercicio_2 = 460 Entonces
											
											Escribir "Es correcto, no utilices calculadora ehhh"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir "Ejercicio 3: ¿Cuanto es 9/18?"
											Leer ejercicio_3
											
											Si ejercicio_3 = 0.5 Entonces
												
												Escribir "¿No serás un genio de las matematicas?"
												Escribir ""
												
											SiNo //Segundo error ejercicio 1-3
												
												Escribir "Que barbaridad, enserio no mereces estar en este mundo"
												
												Escribir ""
												Esperar 1 Segundos
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Escribir ""
												Escribir "GAME OVER"
											FinSi
											
										SiNo //segundo error ejercicio 1-2
											
											Escribir "Vaya...segundo error, Hasta luego jijiji."
											
											Escribir ""
											Esperar 1 Segundos
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											Escribir ""
											Escribir "GAME OVER"
											
										FinSi
										
									FinSi
									
									Escribir ""
									Escribir "<<Presione una tecla para continuar>>"
									Esperar Tecla
									Limpiar Pantalla
									
									
									Si ejercicio_3 = 1 Entonces
										
										Escribir "-Conejo: Bien jugado, pero antes de irme quiero que resuelvas esta adivinanza: ¿Quien está a punto de morir mientras lee esta adivinanza?"
										
										Escribir ""
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										Escribir "Nah es broma jijiji"
										Escribir ""
										Escribir "Eso si, cuanto es: ¿9099 + 1?"
										leer ejercicio_V
										
										Si ejercicio_V=9100 Entonces
											
											Escribir "Exacto, puedes continuar"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											
										SiNo
											
											Escribir ""
											Escribir "Vaya... creo que no eres tan matematico..."
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir ""
											Escribir "Logro conseguido: Albert Einstein"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
										FinSi
										
										
									FinSi
									
								FinSi
								
								Si matematicas=2 Entonces
									
									Escribir "Ejercicio 1: ¿Cuanto es 56/5?"
									Leer ejercicio_4
									
									Si ejercicio_4 = 11.2 Entonces
										
										Escribir "Es correcto, siguiente"
										
										Escribir ""
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										
										Escribir "Ejercicio 2: ¿Cuanto es 3 elevado al cubo?"
										Leer ejercicio_5
										
										Si ejercicio_5 = 27 Entonces
											
											Escribir "Es correcto, no utilices calculadora ehhh"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir "Ejercicio 3: ¿Cuanto es 89+11?"
											Leer ejercicio_6
											
											Si ejercicio_6 = 100 Entonces
												
												Escribir "¿No serás un genio de las matematicas?"
												Escribir ""
												
											SiNo //segundo error ejercicio 2-3
												
												Escribir "Que barbaridad, enserio no mereces estar en este mundo"
												Escribir "Menos mal que es tu primer error"
												
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												
											FinSi
											
											
										SiNo //primer error ejercicio 2-2
											
											Escribir "Vaya...primer error, al segundo fallo empezarás a ver la luz."
											
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir "Ejercicio 3: ¿Cuanto es 66+44?"
											Leer ejercicio_6
											
											Si ejercicio_6 = 110 Entonces
												
												Escribir "¿No serás un genio de las matematicas?"
												Escribir ""
												
											SiNo //segundo error ejercicio 2-3
												
												Escribir "Que barbaridad, enserio no mereces estar en este mundo"
												
												Escribir ""
												Esperar 1 Segundos
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Escribir ""
												Escribir "GAME OVER"
											FinSi
											
										FinSi
										
										
									SiNo //primer error ejercicio 1-1
										
										
										Escribir "Vaya...primer error, al segundo fallo empezarás a ver la luz."
										
										Escribir ""
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										
										Escribir "Ejercicio 2: ¿Cuanto es 3 elevado al cubo?"
										Leer ejercicio_5
										
										Si ejercicio_5 = 27 Entonces
											
											Escribir "Es correcto, no utilices calculadora ehhh"
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir "Ejercicio 3: ¿Cuanto es 180/3?"
											Leer ejercicio_6
											
											Si ejercicio_6 = 60 Entonces
												
												Escribir "¿No serás un genio de las matematicas?"
												Escribir ""
												
											SiNo //Segundo error ejercicio 1-3
												
												Escribir "Que barbaridad, enserio no mereces estar en este mundo"
												
												Escribir ""
												Esperar 1 Segundos
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Escribir ""
												Escribir "GAME OVER"
											FinSi
											
										SiNo //segundo error ejercicio 1-2
											
											Esperar 1 Segundos
											Escribir "Vaya...segundo error, Hasta luego jijiji."
											Escribir ""
											Esperar 1 Segundos
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											Escribir ""
											Escribir "GAME OVER"
											
										FinSi
										
									FinSi
									
									Escribir ""
									Escribir "<<Presione una tecla para continuar>>"
									Esperar Tecla
									Limpiar Pantalla
									
									
									Si ejercicio_6 = 100 Entonces
										
										Escribir "-Conejo: Bien jugado, pero antes de irme quiero que resuelvas esta adivinanza: ¿Quien está a punto de morir mientras lee esta adivinanza?"
										
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										Escribir "Nah es broma jijiji"
										Escribir ""
										Escribir "Eso si, cuanto es: ¿9099 + 1?"
										leer ejercicio_V
										
										Si ejercicio_V=9100 Entonces
											
											Escribir "Exacto, puedes continuar"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											
										SiNo
											
											Escribir ""
											Esperar 1 Segundos
											Escribir "Vaya... creo que no eres tan matematico..."
											Escribir ""
											Esperar 1 Segundos
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir ""
											Esperar 1 Segundos
											Escribir "Logro conseguido: Un genio a medias"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
										FinSi
										
									FinSi
									
								FinSi
								
								Si ejercicio_V=9100 Entonces
									
									Esperar 0.7 Segundos
									Escribir "*El conejo te guia por un sendero muy colorido con flores*"
									Escribir ""
									Esperar 1 Segundos
									Escribir "En el camino, una planta toma tu pierna y te arrastra hasta ella"
									Escribir ""
									Esperar 1 Segundos
									Escribir "-", nombre,": Conejo!! Ayuda"
									Escribir ""
									Esperar 1 Segundos
									Escribir "-Conejo: Si dices mi nombre te ayudaré"
									Escribir ""
									Esperar 1 Segundos
									Escribir "Toma una decisión: Inventar nombre (1) o seguir pidiendo ayuda (2)"
									Esperar 1 Segundos
									Escribir ""
									Escribir "<<Presione una tecla para continuar>>"
									Esperar Tecla
									Limpiar Pantalla
									
									Esperar 1 Segundos
									Escribir "*Ningún llamado funciona*"
									Esperar 0.7 Segundos
									Escribir "*La planta saca una lista de preguntas*"
									Escribir "<<Presione una tecla para continuar>>"
									Esperar Tecla
									Limpiar Pantalla
									
									Escribir "¿Quién es más rapida: La liebre (1) o la tortuga (2)?"
									Leer respuesta_planta_1
									
									Mientras respuesta_planta_1>=3 o respuesta_planta_1<=0 hacer
										Limpiar Pantalla
										Escribir "¿Quién es más rapida: La liebre (1) o la tortuga (2)?"
										Leer respuesta_planta_1
										Limpiar Pantalla
									FinMientras
									
									Si respuesta_planta_1=1 Entonces
										
										Escribir "¿Acaso no vista el magnifico cuento de la tortuga y la liebre?"
										Escribir ""
										Escribir "Te daré otra oportunidad"
										Escribir ""
										Escribir "¿Quién es más rapida: La liebre (1) o la tortuga (2)?"
										Leer respuesta_planta_1B
										
										Mientras respuesta_planta_1B>=3 o respuesta_planta_1B<=0 hacer
											Limpiar Pantalla
											Escribir "¿Quién es más rapida: La liebre (1) o la tortuga (2)?"
											Leer respuesta_planta_1B
											Limpiar Pantalla
										FinMientras
										
										Si respuesta_planta_1B=1 Entonces
											
											Escribir ""
											Esperar 1 Segundos
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											Escribir ""
											Esperar 1 Segundos
											Escribir "Has muerto"
											Escribir ""
											Esperar 1 Segundos
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											Esperar 1 Segundos
											Escribir "Has conseguido el logro: Poca cultura"
											Escribir ""
											Esperar 1 Segundos
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											Escribir ""
											Escribir "GAME OVER"
											
										FinSi
										
									FinSi
									
									Si respuesta_planta_1=2 o respuesta_planta_1B=2 Entonces
										
										Escribir "Muy bien, siguiente pregunta"
										Escribir ""
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										
									FinSi
									
									Escribir "¿Quién es más grande: El Real Madrid (1) o El Barcelona (2)?"
									leer respuesta_planta_2
									Limpiar Pantalla
									
									Mientras respuesta_planta_2>=3 o respuesta_planta_2<=0 hacer
										Limpiar Pantalla
										Escribir "¿Quién es más grande: El Real Madrid (1) o El Barcelona (2)?"
										leer respuesta_planta_2
										Limpiar Pantalla
									FinMientras
									
									si respuesta_planta_2=1 Entonces
										
										Escribir "¿Acaso eres un madridista?"
										Escribir ""
										Esperar 1 Segundos
										Escribir "Si (1) No(2)"
										Leer respuesta_Madrid
										Limpiar Pantalla
										
										Mientras respuesta_Madrid>=3 o respuesta_Madrid<=0 hacer
											Limpiar Pantalla
											Escribir "¿Acaso eres un madridista?"
											Escribir ""
											Escribir "Si (1) No(2)"
											Leer respuesta_Madrid
											Limpiar Pantalla
										FinMientras
										
										Si respuesta_Madrid=1 Entonces
											
											Escribir "Lo suponia..."
											
										FinSi
										
										Si respuesta_Madrid=2 Entonces
											
											Escribir "Si claro..."
											
										FinSi
									FinSi
									
									si respuesta_planta_2=2 Entonces
										
										Escribir "¿Acaso eres un Culé?"
										Escribir ""
										Esperar 1 Segundos
										Escribir "Si (1) No(2)"
										Leer respuesta_Barcelona
										Limpiar Pantalla
										
										Mientras respuesta_Barcelona>=3 o respuesta_Barcelona<=0 hacer
											Limpiar Pantalla
											Escribir "¿Acaso eres un madridista?"
											Escribir ""
											Escribir "Si (1) No(2)"
											Leer respuesta_Barcelona
											Limpiar Pantalla
										FinMientras
										
										Si respuesta_Barcelona=1 Entonces
											
											Escribir "Lo suponia..."
											
										FinSi
										
										Si respuesta_Barcelona=2 Entonces
											
											Escribir "Si claro..."
											
										FinSi
									FinSi
									
									Esperar 1 Segundos
									Escribir ""
									Escribir "En verdad da igual o tal vez no..."
									Escribir ""
									Esperar 1 Segundos
									Escribir "<<Presione una tecla para continuar>>"
									Esperar Tecla
									Limpiar Pantalla
									Esperar 1 Segundos
									Escribir "Si fallas no tendrás una segunda oportunidad. Vamos con fisica, Si dos objetos, un yunke y un marcador (tamaño normal) caen desde la misma altura ¿Qué caé primero?"
									Escribir ""
									Esperar 1 Segundos
									Escribir "El Yunke (1)"
									Escribir "El marcador (2)"
									Escribir "Caen a la vez (3)"
									Esperar 1 Segundos
									Escribir ""
									leer respuesta_planta_3
									
									Si respuesta_planta_3=3 Entonces
										
										Esperar 1 Segundos
										Escribir ""
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										Escribir "Estas en lo correcto, solo me gustaria saber si respondiste porque en verdad sabes fisica o solo por intuición. Tranqui no moriras"
										Escribir ""
										Esperar 1 Segundos
										Escribir "Sé algo de fisica (1)"
										Escribir "Intuición (2)"
										Leer respuesta_Fisica
										
										Mientras respuesta_Fisica>=3 o respuesta_Fisica<=0 hacer
											Limpiar Pantalla
											Esperar 0.7 Segundos
											Escribir ""
											Escribir "Estas en lo correcto, solo me gustaria saber si respondiste porque en verdad sabes fisica o solo por intuición. Tranqui no moriras"
											Escribir ""
											Escribir "Sé algo de fisica (1)"
											Escribir "Intuición (2)"
											Escribir ""
											Leer respuesta_Fisica
											Limpiar Pantalla
											
										Finmientras
										
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										
										Segun respuesta_Fisica Hacer
											
											1:
												
												Escribir "*Has muerto*"
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Esperar 1 Segundos
												Escribir "Nah era broma"
												Escribir ""
												Escribir "Bueno es algo bastante básico de la fisica, pero igual esta bien que lo sepas."
												
											2:
												Escribir "*Has muerto*"
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Esperar 1 Segundos
												Escribir "Nah era broma"
												Escribir ""
												Escribir "Quizas tuviste un poco de suerte esta vez, pero debes conocer mas sobre estos temas para no arriesgarte tanto."
												
										FinSegun
										
										Escribir ""
										Esperar 1 Segundos
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										
										Si respuesta_Fisica=1 o respuesta_Fisica=2 Entonces
											
											Esperar 1 Segundos
											Escribir "*La planta te deja libre*"
											Escribir ""
											Esperar 1 Segundos
											Escribir "-", nombre, ": Que planta mas rara..."
											Escribir ""
											Esperar 1 Segundos
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
										FinSi
										
										Esperar 1 Segundos
										Escribir "*Empiezas a ver tu alrededor y un gran agujero se abre a tus pies*"
										Escribir ""
										Esperar 1 Segundos
										Escribir "*Caes en lo que parece ser el lago trasero de tu casa*"
										Esperar 1 Segundos
										Escribir "*Te encuentras confundido y decides entrar a tu casa*"
										Escribir ""
										Esperar 1 Segundos
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										Escribir "*Observas en tu mesa unos papeles, los cuales te indican dos cosas*"
										Escribir ""
										Escribir "Papel 1: Si tomas este papel jugaremos con los dados"
										Escribir "Papel 2: Si tomas este papel jugaremos 21 BlackJack"
										Escribir ""
										Escribir "¿Cual decides tomar?"
										Escribir ""
										Escribir "Papel 1 (1) o papel 2 (2)"
										leer casa_final
										
										Mientras casa_final>=3 o casa_final<=0 hacer
											Limpiar Pantalla
											Esperar 0.7 Segundos
											Escribir ""
											Escribir "*Observas en tu mesa unos papeles, los cuales te indican dos cosas*"
											Escribir ""
											Escribir "Papel 1: Si tomas este papel jugaremos con los dados"
											Escribir "Papel 2: Si tomas este papel jugaremos 21 BlackJack"
											Escribir ""
											Escribir "¿Cual decides tomar?"
											Escribir ""
											Escribir "dados (1) o moneda (2)"
											leer casa_final
											Limpiar Pantalla
											
										Finmientras
										
										Esperar 1 Segundos
										Escribir ""
										
										Segun casa_final Hacer
											
											1:
												Escribir "Del papel salen un par de dados"
												Escribir ""
												Escribir "Si sacas 6 o 1 sobrevives, si sacas cualquier otro numero moriras"
												Escribir ""
												Esperar 1 Segundos
												Escribir "<<Presione una tecla para lanzar los dados>>"
												Esperar Tecla
												Limpiar Pantalla
												Esperar 0.9 Segundos
												Escribir "*Lanzas el dado*"
												Escribir ""
												Esperar 1 Segundos
												Escribir "El numero del dado es: "
												Esperar 1.5 Segundos
												Escribir dado_2
												Escribir ""
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Esperar 1 Segundos
												
												Si dado_2<>6 o dado_2<>1 Entonces
													
													Escribir "De la oscuridad se escucha una risa malevola que te dice: vaya vaya..."
													Escribir ""
													Esperar 1 Segundos
													Escribir "*En ese momento empiezas a ver borroso, caes lentamente al suelo y mueres*"
													Escribir ""
													Esperar 1 Segundos
													Escribir "<<Presione una tecla para continuar>>"
													Esperar Tecla
													Limpiar Pantalla
													Escribir "has conseguido el logro: Good game"
													Escribir "<<Presione una tecla para continuar>>"
													Esperar Tecla
													Limpiar Pantalla
													Escribir ""
													Escribir "GAME OVER"
													
												FinSi
												
												Si dado_2=6 o dado_2=1 Entonces
													
													Escribir "*El ambiente se torna frio y pesado, pero sientes una gran satisfacción dentro de ti*"
													Escribir "Es como si todo se hubiera acabado..."
													Escribir ""
													Escribir "<<Presione una tecla para continuar>>"
													Esperar Tecla
													Limpiar Pantalla
													Esperar 1 Segundos
													Escribir "Has conseguido el logro: Skill, habilidad y un poco de suerte"
													Escribir ""
													Esperar 1 Segundos
													Escribir "<<Presione una tecla para continuar>>"
													Esperar Tecla
													Limpiar Pantalla
													Escribir ""
													Escribir "GAME OVER"
													
												FinSi
												
												
											2:
												Escribir "Será un juego de cara o sello"
												Escribir ""
												Escribir "Que eliges: Cara (1) o Sello (2)"
												Leer moneda_decision
												
												Mientras moneda_decision>=3 o moneda_decision<=0 hacer
													Limpiar Pantalla
													Escribir "Será un juego de cara o sello"
													Escribir ""
													Escribir "Que eliges: Cara (1) o Sello (2)"
													Leer moneda_decision
												FinMientras
												
												Segun moneda_decision Hacer
													
													1 o 2:
														
														Escribir ""
														Escribir "La moneda ha caido en: "
														Esperar 1.5 Segundos
														Escribir moneda;
														Escribir ""
														Esperar 1 Segundos
														
														Si moneda_decision=moneda Entonces
															
															Esperar 1 Segundos
															Escribir "*El ambiente se torna frio y pesado, pero sientes una gran satisfacción dentro de ti*"
															Escribir "Es como si todo se hubiera acabado..."
															Escribir ""
															Esperar 1 Segundos
															Escribir "<<Presione una tecla para continuar>>"
															Esperar Tecla
															Limpiar Pantalla
															Escribir "Has conseguido el logro: Una gran Aventura"
															Escribir ""
															Esperar 1 Segundos
															Escribir "<<Presione una tecla para continuar>>"
															Esperar Tecla
															Limpiar Pantalla
															Escribir ""
															Escribir "GAME OVER"
															
														FinSi
														
														Si moneda_decision<>moneda Entonces
															
															Escribir "De la oscuridad se escucha una risa malevola que te dice: vaya vaya..."
															Escribir ""
															Esperar 1 Segundos
															Escribir "*En ese momento empiezas a ver borroso, caes lentamente al suelo y mueres*"
															Escribir ""
															Esperar 1 Segundos
															Escribir "<<Presione una tecla para continuar>>"
															Esperar Tecla
															Limpiar Pantalla
															Escribir "has conseguido el logro: Buenas decisiones, mala suerte"
															Escribir "<<Presione una tecla para continuar>>"
															Esperar Tecla
															Limpiar Pantalla
															Escribir ""
															Escribir "GAME OVER"
															
															
														FinSi
												FinSegun
										FinSegun
										
										
									SiNo
										
										Escribir ""
										Esperar 1 Segundos
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										Esperar 1 Segundos
										Escribir "Este es tu final..."
										Escribir ""
										Esperar 1 Segundos
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										Esperar 1 Segundos
										Escribir "Has conseguido el logro: Las cuestiones"
										Escribir ""
										Esperar 1 Segundos
										Escribir "<<Presione una tecla para continuar>>"
										Esperar Tecla
										Limpiar Pantalla
										Escribir ""
										Escribir "GAME OVER"
										
									FinSi
									
									
								FinSi
								
								
							SiNo
								
								Esperar 1 Segundos
								Escribir "*Mientras tu cuerpo se estremece de dolor, la bestia rie, rie tanto que todo el planeta la podría escuchar; en esa risa te dice: Hasta la vista aventurero*"
								Esperar 1 Segundos
								Escribir "El número secreto era: ",num_secreto
								Escribir ""
								Esperar 1 Segundos
								Escribir "<<Presione una tecla para continuar>>"
								Esperar Tecla
								Limpiar Pantalla
								Esperar 1 Segundos
								Escribir "Has conseguido el logro: Una muerte prematura"
								Escribir ""
								Esperar 1 Segundos
								Escribir "<<Presione una tecla para continuar>>"
								Esperar Tecla
								Limpiar Pantalla
								Escribir ""
								Escribir "GAME OVER"
								
							FinSi
								
								
						FinSi
						
						Si puerta_random=2 Entonces
							
							Esperar 1 Segundos
							Escribir "*Aún sabiendo que te equivocaste, decides cruzar la tenebrosa puerta, que al abrirse rechina de una forma estrepitosa.*"
							Escribir ""
							Esperar 1 Segundos
							Escribir "*Observas un sendero desolado, desertico y oscuro, con una luna al fondo, pero sin ser totalmente de noche.*"
							Escribir ""
							Esperar 1 Segundos
							Escribir "Deberás tomar una decisión: Seguir (1) o volver (2)"
							Leer sendero
							
							Limpiar Pantalla
							
							Mientras sendero>=3 o sendero<=0 hacer
								Limpiar Pantalla
								Escribir "*Aún sabiendo que te equivocaste, decides cruzar la tenebrosa puerta, que al abrirse rechina de una forma estrepitosa.*"
								Escribir ""
								Escribir "*Observas un sendero desolado, desertico y oscuro, con una luna al fondo, pero sin ser totalmente de noche.*"
								Escribir ""
								Escribir "Deberás tomar una decisión: Seguir (1) o volver (2)"
								Leer sendero
								Limpiar Pantalla
								
							Finmientras
							
							Segun sendero Hacer
								
								1: //sendero 1
									
									Esperar 1 Segundos
									Escribir "*Te quedas viendo el sendero, aún así, decides continuar*"
									Esperar 1 Segundos
									Escribir "*Luego de un largo viaje, y a punto de volver, logras ver a la distancia una casa. LLegas a la puerta, pero no hay nadie*"
									Escribir ""
									Esperar 1 Segundos
									Escribir "Tocar puerta y entrar (1)"
									Escribir "volver (2)"
									Escribir ""
									Leer decision_1
									Limpiar Pantalla
									
									Mientras decision_1>=3 o decision_1<=0 hacer
										Limpiar Pantalla
										Esperar 0.7 Segundos
										Escribir "*Te quedas viendo el sendero, aún así, decides continuar*"
										Esperar 0.7 Segundos
										Escribir "*Luego de un largo viaje, logras ver a la distancia una casa. LLegas a la puerta, pero no hay nadie*"
										Escribir ""
										Esperar 0.7 Segundos
										Escribir "Tocar puerta y entrar (1)"
										Escribir "volver (2)"
										Escribir ""
										Leer decision_1
										Limpiar Pantalla
									FinMientras
									
									Segun decision_1 Hacer
										
										1: //casa seguir
											
											Escribir "-", nombre, ": Al parecer no hay nada. Ni siquiera muebles"
											Esperar 1 Segundos
											Escribir ""
											Escribir "De un pequeño agujero sale un raton, lo sigues rapidamente, llevandote al segundo piso. Allí, ves algo brillando, que al tocarlo te trasnporta a otra dimensión"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											
											Escribir "En la nueva dimensión observas todo tipo de animales, pero un mono es quien se acerca a jugar"
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											Escribir "Será un juego de cara o sello, o mejor dicho, banana o cascara"
											Escribir ""
											Escribir "Que eliges: Banana (1) o Cascara (2)"
											Leer moneda_decision
											
											Mientras moneda_decision>=3 o moneda_decision<=0 hacer
												Limpiar Pantalla
												Escribir "Será un juego de cara o sello, o mejor dicho, banana o cascara"
												Escribir ""
												Escribir "Que eliges: Banana (1) o Cascara (2)"
												Leer moneda_decision
											FinMientras
											
											Segun moneda_decision Hacer
												
												1 o 2:
													
													Escribir ""
													Escribir "La moneda ha caido en: "
													Esperar 1.5 Segundos
													Escribir moneda;
													Escribir ""
													Esperar 1 Segundos
													
													Si moneda_decision=moneda Entonces
														
														Escribir "El mono te mira, lentamente se echa a un lado y delante de ti observas luz. Te acercas..."
														Esperar 1 Segundos
														Escribir "Es una puerta, decides abrirla y cruzarla"
														Escribir ""
														Escribir "<<Presione una tecla para continuar>>"
														Esperar Tecla
														Limpiar Pantalla
														
														Esperar 1 Segundos
														Escribir "Caes tendido al suelo y al levantarte te encuentras en medio de la ciudad"
														Esperar 1 Segundos
														Escribir "Estas confundido, pero rapidamente te levantas y vas de vuelta a casa"
														Escribir ""
														Esperar 1 Segundos
														Escribir "<<Presione una tecla para continuar>>"
														Esperar Tecla
														Limpiar Pantalla
														Escribir "Has conseguido el logro: En linea recta"
														Escribir ""
														Esperar 1 Segundos
														Escribir "<<Presione una tecla para continuar>>"
														Esperar Tecla
														Limpiar Pantalla
														Escribir ""
														Escribir "GAME OVER"
														
													FinSi
													
													Si moneda_decision<>moneda Entonces
														
														Esperar 1 Segundos
														Escribir "Todos los animales se juntan y te empiezan a ver. Por ultimo te atacan hasta que tu alma se aleje de tu cuerpo"
														Escribir ""
														Esperar 1 Segundos
														Escribir "<<Presione una tecla para continuar>>"
														Esperar Tecla
														Limpiar Pantalla
														Esperar 1 Segundos
														Escribir "Has conseguido el logro: por el pelo de un calvo"
														Escribir ""
														Esperar 1 Segundos
														Escribir "<<Presione una tecla para continuar>>"
														Esperar Tecla
														Limpiar Pantalla
														Escribir ""
														Escribir "GAME OVER"
														
													FinSi
											FinSegun
											
											
										2: //casa volver
											Limpiar Pantalla
											Escribir "-", nombre ": Creo que es mejor volver."
											Escribir ""
											Esperar 1 Segundos
											Escribir "Al poco tiempo te encuentras con un pequeño duende"
											Escribir ""
											Esperar 1.5 Segundos
											Escribir "-Duende: Pero bueno!, que hace tu aqui, ¿no deberias estar en la casa?"
											Escribir ""
											Esperar 1 Segundos
											Escribir "-", nombre, ": ¿Tú quien eres y como sabes lo de la casa?"
											Escribir ""
											Esperar 1 Segundos
											Escribir "-Duende: Ah si cierto, soy Juanito y ¿Tú?"
											Escribir ""
											Esperar 1 Segundos
											Escribir "-", nombre, ": Respondeme lo de la casa."
											Escribir ""
											Esperar 1 Segundos
											Escribir "-Juanito (Duende): Que agresivo, pero no te lo puedo decir, eso sí, si no vuelves moriras, yo que tu volveria."
											Escribir ""
											Esperar 1 Segundos
											Escribir ""
											Escribir "Volver a la casa (1)"
											Escribir "Seguir en el lugar (2)"
											Leer decision_1duende
											Esperar 0.5 Segundos
											
											
											Mientras decision_1duende>=3 o decision_1duende<=0 hacer
												Limpiar Pantalla
												Escribir "-Juanito (Duende): Que agresivo, pero no te lo puedo decir, eso sí, si no vuelves moriras, yo que tu volveria"
												Escribir ""
												Escribir "Volver a la casa (1)"
												Escribir "Seguir en el lugar (2)"
												Escribir ""
												Leer decision_1duende
											FinMientras
											
											Segun decision_1duende Hacer
												
												1: //volver a casa (duende)
													
													Limpiar Pantalla
													
													Escribir "Decides volver y entras a la casa"
													Escribir ""
													Esperar 1 Segundos
													Escribir "-", nombre, ": Al parecer no hay nada. Ni siquiera muebles"
													Escribir ""
													Esperar 1 Segundos
													Escribir "De un pequeño agujero sale un raton, lo sigues rapidamente, llevandote al segundo piso. Allí, ves algo brillando, que al tocarlo te trasnporta a otra dimensión"
													Escribir ""
													Esperar 1 Segundos
													Escribir "<<Presione una tecla para continuar>>"
													Esperar Tecla
													Limpiar Pantalla
													Esperar 1 Segundos
													Escribir "En la nueva dimensión observas todo tipo de animales, pero un mono es quien se acerca a jugar"
													Escribir ""
													Esperar 1 Segundos
													Escribir "<<Presione una tecla para continuar>>"
													Esperar Tecla
													Limpiar Pantalla
													Esperar 1 Segundos
													Escribir "Será un juego de cara o sello, o mejor dicho, banana o cascara"
													Escribir ""
													Esperar 1 Segundos
													Escribir "Que eliges: Banana (1) o Cascara (2)"
													Leer moneda_decision
													
													
													Mientras moneda_decision>=3 o moneda_decision<=0 hacer
														Limpiar Pantalla
														Escribir "Será un juego de cara o sello, o mejor dicho, banana o cascara"
														Escribir ""
														Escribir "Que eliges: Banana (1) o Cascara (2)"
														Leer moneda_decision
														
													FinMientras
													
													Segun moneda_decision Hacer
														
														1 o 2:
															
															Escribir ""
															Escribir "La moneda ha caido en: "
															Esperar 1.5 Segundos
															Escribir moneda;
															Escribir ""
															Esperar 1 Segundos
															
															Si moneda_decision=moneda Entonces
																
																Escribir "El mono te mira, lentamente se echa a un lado y delante de ti observas luz. Te acercas."
																Esperar 1 Segundos
																Escribir "Es una puerta, decides abrirla y cruzarla"
																Escribir ""
																Esperar 1 Segundos
																Escribir "<<Presione una tecla para continuar>>"
																Esperar Tecla
																Limpiar Pantalla
																Esperar 1 Segundos
																Escribir "Caes tendido al suelo y al levantarte te encuentras en medio de la ciudad"
																Esperar 1 Segundos
																Escribir "Estas confundido, pero rapidamente te levantas y vas de vuelta a casa"
																Escribir ""
																Esperar 1 Segundos
																Escribir "<<Presione una tecla para continuar>>"
																Esperar Tecla
																Limpiar Pantalla
																Escribir ""
																Escribir "GAME OVER"
																
															FinSi
															
															Si moneda_decision<>moneda Entonces
																
																Escribir "Todos los animales se juntan y te empiezan a ver. Por ultimo te atacan hasta que tu alma se aleje de tu cuerpo"
																Escribir ""
																Esperar 1 Segundos
																Escribir "<<Presione una tecla para continuar>>"
																Esperar Tecla
																Limpiar Pantalla
																Esperar 1 Segundos
																Escribir "Has conseguido el logro: por el pelo de un calvo"
																Escribir ""
																Esperar 1 Segundos
																Escribir "<<Presione una tecla para continuar>>"
																Esperar Tecla
																Limpiar Pantalla
																Escribir ""
																Escribir "GAME OVER"
															FinSi
													FinSegun
													
													
												2: //quedarte en el lugar (duende)
													
													Limpiar Pantalla
													Escribir "*Decides quedarte y a la distancia observas unos lobos*"
													Esperar 1 Segundos
													Escribir "El duende desaparece"
													Escribir ""
													Esperar 1 Segundos
													Escribir "-", nombre, ": Y ahora que hago, DUENDEEEEE!!!"
													Esperar 1 Segundos
													Escribir "Correr (1)"
													Escribir "Quedarte a luchar (2)"
													Leer decision_1lobos
													Limpiar Pantalla
													
													Segun decision_1lobos Hacer
														
														1: //lobo vulves
															
															
															Escribir "*Correr no sirve de nada*"
															Escribir ""
															Esperar 1 Segundos
															Escribir "Los lobos te alcanzan y mueres"
															Escribir ""
															Esperar 1 Segundos
															Escribir "<<Presione una tecla para continuar>>"
															Esperar Tecla
															Limpiar Pantalla
															Escribir "Has conseguido el logro: Corre!!"
															Escribir ""
															Esperar 1 Segundos
															Escribir "<<Presione una tecla para continuar>>"
															Esperar Tecla
															Limpiar Pantalla
															Escribir ""
															Escribir "GAME OVER"
														2: //lobo te quedas
															
															Escribir "¿Luchar contra lobos? ¿es enserio?"
															Escribir ""
															Esperar 1 Segundos
															Escribir "Los lobos te matan"
															Escribir ""
															Esperar 1 Segundos
															Escribir "<<Presione una tecla para continuar>>"
															Esperar Tecla
															Limpiar Pantalla
															Escribir "Has conseguido el logro: La manada"
															Escribir ""
															Esperar 1 Segundos
															Escribir "<<Presione una tecla para continuar>>"
															Esperar Tecla
															Limpiar Pantalla
															Escribir ""
															Escribir "GAME OVER"
															
													FinSegun
													
											FinSegun
											
									FinSegun
									
								2: //sendero 2
									
									Escribir "*Regresas a la habitación, la puerta se cierra e intentas abrir las demás pero nada funciona. Las paredes empiezan a cambiar a un color gris.*"
									Escribir ""
									Esperar 1 Segundos
									Escribir "Aparece un clon delante de ti y te empieza a hablar"
									Escribir ""
									Esperar 1 Segundos
									Escribir "-", nombre, "(Clon): Te daré una oportunidad para vivir, ¿quieres jugar?"
									Escribir ""
									Esperar 1 Segundos
									Escribir "Si (1) No (2)"
									Leer decision_2
									Escribir ""
									Esperar 1 Segundos
									
									Mientras decision_2>=3 o decision_2<=0 hacer
										Limpiar Pantalla
										Escribir ""
										Escribir "-", nombre, "(Clon): Te daré una oportunidad para vivir, ¿quieres jugar?"
										Escribir ""
										Escribir "Si (1) No (2)"
										Leer decision_2
									FinMientras
									
									Limpiar Pantalla
										
									Segun decision_2 Hacer
										
										1:
											Escribir "-", nombre, "(Clon): Está bien, juguemos con los dados. Si sacas 6 o 1 sobrevives y podras tomar de nuevo el sendero, si sacas cualquier otro numero moriras"
											Escribir ""
											Esperar 1 Segundos
											Escribir "*Te da un dado*"
											
											Escribir ""
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											Esperar 0.6 Segundos
											Escribir "*Lanzas el dado*"
											Escribir ""
											Esperar 1 Segundos
											Escribir "El numero del dado es: "
											Esperar 1.5 Segundos
											Escribir dado_2
											Escribir ""
											
											Si dado_2<>6 o dado_2<>1 Entonces
												
												Escribir "-", nombre, "(Clon): vaya vaya, al aparecer has perdido. -rie-"
												Escribir ""
												Esperar 1 Segundos
												Escribir "*En ese momento empiezas a ver borroso, caes lentamente al suelo y mueres*"
												Escribir ""
												Esperar 1 Segundos
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Escribir "Has conseguido el logro: Malas decisiones"
												Escribir ""
												Esperar 1 Segundos
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Escribir ""
												Escribir "GAME OVER"
												
											FinSi
											
											Si dado_2=6 o dado_2=1 Entonces
												
												Escribir "-", nombre, "(Clon): vaya, pero que suerte, que lastima. Bueno, continua con tu camino pequeño aventurero"
												
												//sendero 1
												
												Escribir ""
												Escribir "<<Presione una tecla para continuar>>"
												Esperar Tecla
												Limpiar Pantalla
												Escribir "*Te quedas viendo el sendero, aún así, decides continuar*"
												Esperar 1 Segundos
												Escribir "*Luego de un largo viaje, y a punto de volver, logras ver a la distancia una casa. LLegas a la puerta, parece desolada*"
												Escribir ""
												Esperar 1 Segundos
												Escribir "Tocar puerta y entrar(1)"
												Escribir "volver (2)"
												Escribir ""
												Leer decision_1
												
												Mientras decision_1>=3 o decision_1<=0 hacer
													Limpiar Pantalla
													Escribir "*Te quedas viendo el sendero, aún así, decides continuar*"
													Escribir "*Luego de un largo viaje, y a punto de volver, logras ver a la distancia una casa. LLegas a la puerta, parece desolada*"
													Escribir ""
													Escribir "Tocar puerta y entrar (1)"
													Escribir "Volver (2)"
													Escribir ""
													Leer decision_1
												FinMientras
												
												Segun decision_1 Hacer
													
													1 o 2: //casa seguir
														
														Escribir "-", nombre, ": Ni loco voy a volver. *Entra* Al parecer no hay nada, ni siquiera muebles"
														Escribir ""
														Esperar 1 Segundos
														Escribir "De un pequeño agujero sale un raton, lo sigues rapidamente, llevandote al segundo piso. Allí, ves algo brillando, que al tocarlo te trasnporta a otra dimensión"
														Escribir ""
														Esperar 1 Segundos
														Escribir "<<Presione una tecla para continuar>>"
														Esperar Tecla
														Limpiar Pantalla
														Escribir "En la nueva dimensión observas todo tipo de animales, pero un mono es quien se acerca a jugar"
														Escribir ""
														Esperar 1 Segundos
														Escribir "<<Presione una tecla para continuar>>"
														Esperar Tecla
														Limpiar Pantalla
														Escribir "Será un juego de cara o sello, o mejor dicho, banana o cascara"
														Escribir ""
														Esperar 1 Segundos
														Escribir "Que eliges: Banana (1) o Cascara (2)"
														Leer moneda_decision
														
														Mientras moneda_decision>=3 o moneda_decision<=0 hacer
															Limpiar Pantalla
															Escribir "Será un juego de cara o sello, o mejor dicho, banana o cascara"
															Escribir ""
															Escribir "Que eliges: Banana (1) o Cascara (2)"
															Leer moneda_decision
														FinMientras
														
														Segun moneda_decision Hacer
															
															1 o 2:
																
																Escribir ""
																Escribir "La moneda ha caido en: "
																Esperar 1.5 Segundos
																Escribir moneda;
																Escribir ""
																Esperar 1 Segundos
																
																Si moneda_decision=moneda Entonces
																	
																	Escribir "El mono te mira, lentamente se echa a un lado y delante de ti observas luz. Te acercas."
																	Esperar 1 Segundos
																	Escribir "Es una puerta, decides abrirla y cruzarla"
																	Escribir ""
																	Esperar 1 Segundos
																	Escribir "<<Presione una tecla para continuar>>"
																	Esperar Tecla
																	Limpiar Pantalla
																	
																	Escribir "Caes tendido al suelo y al levantarte te encuentras en medio de la ciudad"
																	Esperar 1 Segundos
																	Escribir "Estas confundido, pero rapidamente te levantas y vas de vuelta a casa"
																	Escribir ""
																	Esperar 1 Segundos
																	Escribir "<<Presione una tecla para continuar>>"
																	Esperar Tecla
																	Limpiar Pantalla
																	Esperar 1 Segundos
																	Escribir "Has conseguido el logro: Un final de suerte"
																	Escribir ""
																	Esperar 1 Segundos
																	Escribir "<<Presione una tecla para continuar>>"
																	Esperar Tecla
																	Limpiar Pantalla
																	Escribir ""
																	Escribir "GAME OVER"
																	
																FinSi
																
																Si moneda_decision<>moneda Entonces
																	
																	Escribir "Todos los animales se juntan y te empiezan a ver. Por ultimo te atacan hasta que tu alma se aleje de tu cuerpo"
																	Escribir ""
																	Esperar 1 Segundos
																	Escribir "<<Presione una tecla para continuar>>"
																	Esperar Tecla
																	Limpiar Pantalla
																	Esperar 1 Segundos
																	Escribir "Has conseguido el logro: por el pelo de un calvo"
																	Escribir ""
																	Esperar 1 Segundos
																	Escribir "<<Presione una tecla para continuar>>"
																	Esperar Tecla
																	Limpiar Pantalla
																	Escribir ""
																	Escribir "GAME OVER"
																	
																FinSi
																
														FinSegun
														
														
												FinSegun
												
												
											FinSi
											
										2:
											Esperar 1 Segundos
											Escribir "El clon se acerca a tí y te mata"
											Escribir ""
											Esperar 1 Segundos
											Escribir "<<Presione una tecla para continuar>>"
											Esperar Tecla
											Limpiar Pantalla
											Escribir ""
											Escribir "GAME OVER"
									FinSegun
									
							FinSegun
							
						FinSi
						
					FinSi
				7:
					Escribir "Gracias por jugar"
					
			FinSegun
		FinSi
		
		Escribir ""
		Escribir "<<Presione una tecla para volver al menú>>"
		Esperar Tecla
		Limpiar Pantalla
		
	Hasta Que menu=4 o puerta_elegida=7
	
FinAlgoritmo