# Agenda Electrónica

Este proyecto consiste en el desarrollo de un programa para gestionar los contactos de una agenda electrónica.

## Descripción

La agenda electrónica permitirá a los usuarios ingresar y gestionar datos de contacto de manera eficiente utilizando vectores para almacenar la información.

## Requisitos del Programa

1. **Ingreso de Datos**  
   La agenda debe permitir ingresar los siguientes datos para cada contacto:
   - DNI
   - Nombre
   - Apellido
   - Fecha de nacimiento
   - Teléfono
   - Dirección  
   Cada uno de estos datos se debe ingresar en su correspondiente `TextField`.

2. **Almacenamiento de Datos**  
   - Los datos de 10 personas deben almacenarse en un vector, utilizando un vector para cada campo.  
   - Cada índice del vector representará la información de una persona específica en todos los vectores.  
   - Ejemplo de estructura:  
     - Vector de DNI: `[123, 456, 789]`
     - Vector de nombres: `["Juan", "María", "Pedro"]`
     - Vector de apellidos: `["Pérez", "Gómez", "López"]`  

3. **Carga de Datos**  
   - El programa debe permitir cargar valores en una posición específica del vector al hacer clic en el botón **Cargar**.
   - También debe recorrer el vector mostrando los datos almacenados.  
   - Ejemplo de funcionamiento:  
     Si se carga el DNI `123` en la posición 0, el programa debe mostrar el nombre, apellido, etc., correspondientes a esa posición.

## Funcionalidades

- Ingreso de datos de contacto en tiempo real.
- Almacenamiento de información de hasta 10 personas.
- Posibilidad de actualizar y visualizar datos en cualquier posición.

---

¡Explora y desarrolla esta práctica aplicación para mejorar tus habilidades de programación en Java!
