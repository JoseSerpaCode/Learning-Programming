# Ejercicios de Matrices en C++

Este documento contiene dos ejercicios prácticos diseñados para ayudarte a prepararte en el manejo de matrices en C++. Cada uno está pensado para resolverse en aproximadamente **una hora**.

---

## 🧪 Ejercicio 1: Simulador de Calificaciones de Estudiantes

### 📝 Descripción:
Se desea simular el registro de calificaciones de estudiantes en diferentes materias. El programa debe manejar una **matriz de NxM** donde cada fila representa un estudiante y cada columna una materia.

### ✅ Requisitos:
1. Solicitar al usuario la cantidad de estudiantes (N) y materias (M).
2. Generar aleatoriamente calificaciones entre 0.0 y 5.0 para cada estudiante.
3. Mostrar la matriz generada.
4. Calcular el promedio por estudiante y mostrar cuál fue el estudiante con mejor promedio.
5. Calcular el promedio por materia.
6. Usar funciones para:
   - Llenar la matriz.
   - Mostrar la matriz.
   - Calcular promedios por fila y columna.
   - Determinar el mejor promedio.

### 💡 Sugerencia:
Utiliza la librería `<iomanip>` para mostrar los promedios con dos cifras decimales.

### 📈 Ejemplo de salida:
```
Ingrese número de estudiantes: 3
Ingrese número de materias: 4

Matriz de calificaciones:
[3.1 4.0 2.5 4.5]
[2.0 3.5 4.0 3.8]
[5.0 5.0 4.9 4.8]

Promedio por estudiante:
Estudiante 1: 3.53
Estudiante 2: 3.33
Estudiante 3: 4.93

-> El mejor promedio fue del estudiante 3

Promedio por materia:
Materia 1: 3.37
Materia 2: 4.17
Materia 3: 3.80
Materia 4: 4.37
```

---

## 🫪 Ejercicio 2: Multiplicación de Matrices

### 📝 Descripción:
Crea un programa que permita **multiplicar dos matrices** A y B ingresadas por el usuario, verificando previamente que la multiplicación es válida.

### ✅ Requisitos:
1. Solicitar al usuario las dimensiones de A (NxM) y B (MxP).
2. Ingresar manualmente o llenar automáticamente las matrices.
3. Verificar si se puede realizar la multiplicación.
4. Realizar la multiplicación de matrices.
5. Mostrar la matriz resultado C (NxP).
6. Usar funciones para:
   - Ingresar o llenar matrices.
   - Mostrar matrices.
   - Multiplicar matrices.

### 🤔 Tip extra:
Agrega una opción para llenar las matrices automáticamente con números aleatorios si el usuario lo desea (ideal para pruebas rápidas).

### 📈 Ejemplo:
```
Matriz A (2x3):
[1 2 3]
[4 5 6]

Matriz B (3x2):
[7 8]
[9 10]
[11 12]

Resultado C (2x2):
[58 64]
[139 154]
```

---

