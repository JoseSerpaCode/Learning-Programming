# Ejercicio: Ordenar nombres con puntajes aleatorios

## Instrucciones

1. Crea un **array** de **estructuras** donde cada estructura contenga:
   - Un **nombre** de jugador (tipo `std::string`).
   - Un **puntaje** generado aleatoriamente entre **1 y 100**.

2. Usa la biblioteca `<random>` para generar los puntajes de cada jugador.

3. Muestra la lista de jugadores con sus puntajes **antes de ordenar**.

4. Implementa un algoritmo de **ordenamiento por selección** (`Selection Sort`) para ordenar a los jugadores **de mayor a menor puntaje**.

5. Muestra la lista de jugadores ordenada.

## Ejemplo de salida esperada

### Antes de ordenar:

Juan - 45
María - 78
Carlos - 90
Ana - 62
Pedro - 15

### Después de ordenar:

Carlos - 90
María - 78
Ana - 62
Juan - 45
Pedro - 15

### Notas
- No puedes usar la biblioteca `<vector>`, solo arrays tradicionales.
- Usa `std::string` para manejar los nombres de los jugadores.
- La generación de números aleatorios debe hacerse con `<random>`, no con `rand()`.
