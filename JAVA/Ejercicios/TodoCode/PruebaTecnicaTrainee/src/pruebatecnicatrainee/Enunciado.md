# Prueba técnica TRAINEE

## 1era Parte

Suponer un **sistema de reserva de asientos** para un anfiteatro. El teatro cuenta con **10 filas de 10 asientos cada una**. Se necesita desarrollar un sistema (sin uso de bases de datos, únicamente manejo de datos de forma lógica) que permita llevar a cabo lo siguiente:

1. **Cargar el "mapa" de las filas y asientos.**  
   Indicando con una "X" los asientos ocupados y con una "L" los asientos libres. Al iniciar el programa, todos los asientos deben estar libres.

2. **Manejar la reserva de asientos contemplando que un asiento SOLO PUEDE SER RESERVADO si se encuentra en estado "L".**  
   Una vez que el asiento es reservado, debe pasar automáticamente al estado "X".  
   - Se deberá permitir al comprador elegir el asiento deseado.  
   - En caso de que el asiento esté ocupado, se deberá indicar que el asiento está en estado "X" y no se puede reservar.

3. **Para finalizar el programa se deberá ingresar un valor en específico.**  
   Comprobar que solo se pueda finalizar cada vez que el programa se pueda ejecutar.

### Restricciones:
- Suponer que **SOLO EXISTEN 10 FILAS y 10 ASIENTOS.** No se pueden "vender" asientos fuera de esas numeraciones. No se permite "sobrenumerar".

### Consideraciones:
- No es necesaria implementación de ni de IGU ni de BD. Se evaluarán 100% el manejo lógico del desarrollo de la aplicación.

### Extra:
- En caso de que un cliente solicite visualizar cuáles son los asientos libres, el sistema debe permitir mostrar de forma gráfica el mapa con los asientos ocupados y libres en pantalla.  
- Utilizar **ÚNICAMENTE lógica y la salida por consola.**
