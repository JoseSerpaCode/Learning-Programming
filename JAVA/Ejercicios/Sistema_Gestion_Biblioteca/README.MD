# Sistema de Gestión de Biblioteca

Este ejercicio tiene como objetivo practicar los siguientes conceptos:
- Clases y métodos
- Herencia
- Polimorfismo
- Conexión a base de datos con JDBC y MySQL

## Descripción del Ejercicio

Debes implementar un sistema de gestión de biblioteca que permita manejar libros, usuarios y préstamos. El sistema debe ser capaz de realizar las siguientes operaciones:

### Requisitos Funcionales

1. **Clases y Métodos**:
   - Crear una clase `Libro` con atributos como `id`, `titulo`, `autor`, `añoPublicacion`, y `disponible`.
   - Crear una clase `Usuario` con atributos como `id`, `nombre`, `email`, y `librosPrestados`.
   - Crear una clase `Prestamo` que relacione un `Usuario` con un `Libro` y tenga atributos como `idPrestamo`, `idLibro`, `idUsuario`, `fechaPrestamo`, y `fechaDevolucion`.

2. **Herencia**:
   - Crear una clase `Persona` con atributos comunes como `id`, `nombre`, y `email`. Luego, hacer que `Usuario` herede de `Persona`.

3. **Polimorfismo**:
   - Crear una interfaz `OperacionesBiblioteca` con métodos como `prestarLibro()`, `devolverLibro()`, y `mostrarInformacion()`.
   - Implementar esta interfaz en las clases `Libro` y `Usuario` de manera que cada una tenga su propia implementación de los métodos.

4. **Base de Datos con JDBC y MySQL**:
   - Crear una base de datos MySQL llamada `biblioteca` con tablas para `Libro`, `Usuario`, y `Prestamo`.
   - Implementar métodos en una clase `DatabaseManager` para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos utilizando JDBC.

### Requisitos No Funcionales

- El código debe estar bien estructurado y comentado.
- Debes manejar excepciones adecuadamente (por ejemplo, si un libro no está disponible para préstamo).
- La conexión a la base de datos debe ser segura y eficiente.

## Estructura de la Base de Datos

### Tabla `Libro`
| Columna          | Tipo        |
|------------------|-------------|
| id               | INT (PK)    |
| titulo           | VARCHAR(100)|
| autor            | VARCHAR(100)|
| añoPublicacion   | INT         |
| disponible       | BOOLEAN     |

### Tabla `Usuario`
| Columna          | Tipo        |
|------------------|-------------|
| id               | INT (PK)    |
| nombre           | VARCHAR(100)|
| email            | VARCHAR(100)|

### Tabla `Prestamo`
| Columna          | Tipo        |
|------------------|-------------|
| idPrestamo       | INT (PK)    |
| idLibro          | INT (FK)    |
| idUsuario        | INT (FK)    |
| fechaPrestamo    | DATE        |
| fechaDevolucion  | DATE        |

## Ejemplo de Uso

1. Crear un nuevo libro y agregarlo a la base de datos.
2. Crear un nuevo usuario y agregarlo a la base de datos.
3. Prestar un libro a un usuario.
4. Devolver un libro.
5. Mostrar la información de todos los libros, usuarios y préstamos.

## Entregables

- Código fuente en Java.
- Scripts SQL para crear la base de datos y las tablas.
- Un archivo `README.md` con instrucciones para ejecutar el proyecto.

¡Buena suerte!