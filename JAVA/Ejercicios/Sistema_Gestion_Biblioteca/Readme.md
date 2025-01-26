# Sistema de Gestión de Biblioteca

Este proyecto tiene como objetivo practicar los siguientes conceptos:

- Clases y métodos.
- Herencia.
- Polimorfismo.
- Conexión a base de datos con JDBC y MySQL.

## Descripción del Proyecto

El sistema de gestión de biblioteca permite manejar libros, usuarios y préstamos. Incluye operaciones básicas como prestar libros, devolver libros y mostrar información de libros, usuarios y préstamos.

### Requisitos Funcionales

1. **Clases y Métodos**:
   - Crear una clase `Libro` con atributos: `id`, `titulo`, `autor`, `añoPublicacion`, y `disponible`.
   - Crear una clase `Usuario` que herede de `Persona` y tenga un atributo adicional `librosPrestados`.
   - Crear una clase `Prestamo` que relacione un `Usuario` con un `Libro` y tenga atributos: `idPrestamo`, `idLibro`, `idUsuario`, `fechaPrestamo`, y `fechaDevolucion`.

2. **Herencia**:
   - Crear una clase `Persona` con atributos comunes: `id`, `nombre`, y `email`.

3. **Polimorfismo**:
   - Crear una clase `GestorBiblioteca` que implemente métodos como `prestarLibro`, `devolverLibro`, y `mostrarInformacion`.

4. **Base de Datos con JDBC y MySQL**:
   - Crear una base de datos MySQL llamada `biblioteca` con tablas para `Libro`, `Usuario` y `Prestamo`.
   - Implementar una clase `DatabaseManager` para realizar operaciones CRUD en la base de datos utilizando JDBC.

### Requisitos No Funcionales

- Código bien estructurado y comentado.
- Manejo adecuado de excepciones (por ejemplo, si un libro no está disponible para préstamo).
- Conexión a la base de datos segura y eficiente.

---

## Estructura de Clases

### Clase `Persona`
```java
public class Persona {
    private int id;
    private String nombre;
    private String email;

    public Persona(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y setters
}
```

### Clase `Usuario`
```java
public class Usuario extends Persona {
    private int librosPrestados;

    public Usuario(int id, String nombre, String email, int librosPrestados) {
        super(id, nombre, email);
        this.librosPrestados = librosPrestados;
    }

    // Getters y setters
}
```

### Clase `Libro`
```java
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;

    public Libro(int id, String titulo, String autor, int añoPublicacion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = disponible;
    }

    // Getters y setters
}
```

### Clase `Prestamo`
```java
import java.util.Date;

public class Prestamo {
    private int idPrestamo;
    private int idLibro;
    private int idUsuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(int idPrestamo, int idLibro, int idUsuario, Date fechaPrestamo, Date fechaDevolucion) {
        this.idPrestamo = idPrestamo;
        this.idLibro = idLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y setters
}
```

### Clase `GestorBiblioteca`
```java
public class GestorBiblioteca {
    private DatabaseManager dbManager;

    public GestorBiblioteca(DatabaseManager dbManager) {
        this.dbManager = dbManager;
    }

    public void prestarLibro(int idLibro, int idUsuario) {
        // Verificar disponibilidad y registrar préstamo
    }

    public void devolverLibro(int idPrestamo) {
        // Registrar devolución del libro
    }

    public void mostrarInformacion() {
        // Mostrar datos de libros, usuarios y préstamos
    }
}
```

### Clase `DatabaseManager`
```java
import java.sql.*;

public class DatabaseManager {
    private Connection connection;

    public DatabaseManager(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public void cerrarConexion() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    // Métodos CRUD para Libro, Usuario y Prestamo
}
```

---

## Estructura de la Base de Datos

### Script SQL
```sql
CREATE DATABASE biblioteca;

USE biblioteca;

CREATE TABLE Libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    añoPublicacion INT NOT NULL,
    disponible BOOLEAN DEFAULT TRUE
);

CREATE TABLE Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE Prestamo (
    idPrestamo INT AUTO_INCREMENT PRIMARY KEY,
    idLibro INT NOT NULL,
    idUsuario INT NOT NULL,
    fechaPrestamo DATE NOT NULL,
    fechaDevolucion DATE,
    FOREIGN KEY (idLibro) REFERENCES Libro(id),
    FOREIGN KEY (idUsuario) REFERENCES Usuario(id)
);
```

---

## Ejemplo de Uso

1. Crear un nuevo libro y agregarlo a la base de datos.
2. Crear un nuevo usuario y agregarlo a la base de datos.
3. Prestar un libro a un usuario.
4. Devolver un libro.
5. Mostrar la información de todos los libros, usuarios y préstamos.

---

## Entregables

- Código fuente en Java.
- Scripts SQL para crear la base de datos y las tablas.
- Un archivo `README.md` con instrucciones para ejecutar el proyecto.

---

¡Buena suerte! 🎉
