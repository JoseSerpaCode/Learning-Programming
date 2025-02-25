# Ejercicio: Contar Números Pares e Impares

## Descripción
Escribe un programa en C++ que permita al usuario ingresar una cantidad determinada de números enteros y almacene estos valores en un vector. Luego, el programa debe calcular y mostrar cuántos de estos números son pares y cuántos son impares.

## Instrucciones
1. Solicitar al usuario la cantidad de números que desea ingresar.
2. Leer los números y almacenarlos en un `vector<int>`.
3. Implementar una función `contarParesImpares` que:
   - Reciba el vector con los números ingresados.
   - Devuelva la cantidad de números pares e impares.
4. Mostrar en pantalla los resultados obtenidos.

## Ejemplo de Entrada/Salida
```
Ingrese la cantidad de números: 6
Ingrese el número 1: 10
Ingrese el número 2: 5
Ingrese el número 3: 8
Ingrese el número 4: 7
Ingrese el número 5: 12
Ingrese el número 6: 3

Cantidad de números pares: 3
Cantidad de números impares: 3
```

## Pistas
- Utiliza un `vector<int>` para almacenar los números.
- Recorre el vector y usa `num % 2 == 0` para verificar si un número es par.
- Usa **paso por referencia** en la función para modificar las variables `pares` e `impares` correctamente.

## Desafío Adicional
- Modifica el programa para que, además de contar pares e impares, muestre los números en dos listas separadas.

