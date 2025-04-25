# Gestión de una Huerta de Plantas Aromáticas 🌿

Este proyecto consiste en la implementación de un programa en C++ para gestionar la información básica de una huerta de plantas aromáticas.

## 🧩 Descripción del Problema

En una huerta se desea registrar, consultar y analizar las plantas cultivadas. Para ello, se debe implementar una solución que permita:

1. Registrar nuevas plantas aromáticas.
2. Consultar todas las plantas registradas.
3. Buscar una planta por su nombre común.
4. Calcular cuántas plantas están en estado óptimo de crecimiento.

## 🛠️ Requisitos Técnicos

- Utilizar `struct` para representar una planta.
- Utilizar un `vector` para almacenar las plantas.
- Implementar todas las funcionalidades mediante funciones.

## 🌱 Estructura de la Planta

Cada planta tiene los siguientes campos:

- `nombreComun` → Ej: `"Menta"`, `"Albahaca"`.
- `nombreCientifico` → Ej: `"Mentha spicata"`.
- `fechaSiembra` → Cadena de texto con la fecha (formato libre).
- `altura` → Número decimal (`float`) representando la altura en cm.
- `estadoCrecimiento` → Texto como `"Óptimo"`, `"Regular"` o `"Débil"`.

## 🧪 Funcionalidades del Programa

- ✅ **Agregar planta al vector.**
- 📋 **Mostrar todas las plantas registradas.**
- 🔍 **Buscar planta por nombre común (y mostrar sus datos).**
- 📈 **Contar y mostrar cuántas plantas tienen estado de crecimiento "Óptimo".**

## 💻 Recomendaciones

- Usar `std::vector` para la colección de plantas.
- Separar cada funcionalidad en funciones.
- Validar entradas del usuario en lo posible.

## ✍️ Autor y Créditos

Ejercicio académico propuesto por  
**Ing. Fernando Luis Carrascal Porras**  
**Universidad de Sucre – Colombia**  
[www.unisucre.edu.co](http://www.unisucre.edu.co)

---

