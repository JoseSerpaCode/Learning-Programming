 * Crea un programa que calcule el daño de un ataque durante
 * una batalla Pokémon.
 * - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
 * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico (buscar su efectividad)
 * - El programa recibe los siguientes parámetros:
 * - Tipo del Pokémon atacante.
 * - Tipo del Pokémon defensor.
 * - Ataque: Entre 1 y 100.
 * - Defensa: Entre 1 y 100.


 Efectividad de los tipos:

 * Agua:

 x2: Fuego
 x1: Planta
 x0.5: Agua, Electrico

  * Fuego:

 x2: Planta
 x1:
 x0.5: Fuego, Agua

  * Planta:

 x2:
 x1:
 x0.5: Planta, Agua

  * Electrico:

 x2: Agua
 x1: Fuego
 x0.5: Electrico, Planta