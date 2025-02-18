# Cifrado y Descifrado con Vectores en Java

## Descripción
Este ejercicio consiste en implementar un sistema de **cifrado y descifrado basado en vectores de enteros** en Java. Se utilizará un vector clave para modificar el mensaje original y generar un texto cifrado, aplicando operaciones matemáticas sobre los caracteres.

## Instrucciones
1. **Entrada del usuario:**
    - Un mensaje de texto en **mayúsculas** (sin espacios ni caracteres especiales).
    - Un **vector de enteros** de tamaño igual o menor al mensaje.

2. **Proceso de cifrado:**
    - Convertir el mensaje en un **vector de enteros**, donde cada letra se representa con su posición en el alfabeto (`A = 0, B = 1, ..., Z = 25`).
    - Aplicar el vector clave sumándolo de forma **cíclica** (cuando el vector clave termine, vuelve a empezar).
    - Si el resultado excede 25, aplicar **módulo 26** (`% 26`).
    - Convertir el vector resultante de nuevo en caracteres.

3. **Proceso de descifrado:**
    - Restar el vector clave de forma **cíclica**.
    - Si el resultado es negativo, sumarle 26.
    - Convertir el vector resultante nuevamente en caracteres.

## Ejemplo
```plaintext
Mensaje original:   "JAVA"
Clave:             [3, 1, 4]

Paso 1: Convertimos el mensaje en índices:
   JAVA → [9, 0, 21, 0]

Paso 2: Aplicamos el cifrado:
   [9+3, 0+1, 21+4, 0+3] → [12, 1, 25, 3]
   Como no hay valores mayores a 25, no aplicamos módulo.

Paso 3: Convertimos de vuelta a texto:
   [12, 1, 25, 3] → "MBZD"

Mensaje cifrado: "MBZD"

Para descifrar, hacemos la operación inversa.
```

## Requisitos
- Implementar un **método `cifrar(String mensaje, int[] clave)`** que devuelva el texto cifrado.
- Implementar un **método `descifrar(String cifrado, int[] clave)`** que devuelva el texto original.
- **No usar librerías externas** para la lógica del cifrado.
- **Manejo de errores:** Si el usuario ingresa caracteres inválidos o un vector vacío, mostrar un mensaje de error.

## Tiempo estimado: 45 minutos
Este ejercicio refuerza los siguientes conceptos en Java:
✅ Manipulación de vectores (`int[]`)
✅ Conversión de caracteres y cadenas
✅ Modularidad y uso de métodos
✅ Algoritmos de cifrado simple

