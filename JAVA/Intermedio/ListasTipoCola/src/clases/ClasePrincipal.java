package clases;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion = 0, nodo_informacion;
        Cola cola = new Cola();
        
        do {            
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    """
                    Menu de Opciones
                    
                    1. Insertar Nodo
                    2. Extraer un Nodo
                    3. Mostrar contenido de la cola
                    4. Salir
                    
                    """));
                
                switch(opcion){
                    case 1 -> {
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Por favor ingrese el valor a guardar en el nodo."));
                        cola.Insertar(nodo_informacion);
                    }
                        
                    case 2 -> {
                        if (!cola.ColaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " + cola.Extraer());
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola está vacía");
                        }
                    }
                        
                    case 3 -> cola.MostrarContenido();
                        
                    case 4 -> opcion = 4;
                        
                    default -> JOptionPane.showMessageDialog(null, "Opción no disponible");
                }
            } catch (NumberFormatException e) {
            }
        } while (opcion !=4);
    }
}
