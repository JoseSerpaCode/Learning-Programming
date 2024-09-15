package listas_tipo_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0, nodo;
        Pila pila = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Menu de Opciones
                    
                    1. Insertar un nodo
                    2. Eliminar un nodo
                    3. ¿La Pila esta vacia?
                    4. ¿Cual es el ultimo valo ingresado en la Pila?
                    5. ¿Cuantos nodos tiene la Pila?
                    6. Vaciar Pila
                    7. Mostrar contenido de la Pila
                    8. Salir
                    
                    """));

                switch (opcion) {
                    case 1 -> {
                        try {
                            nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, ingresa el valor a guardar en el nodo: "));
                            pila.InsertarNodo(nodo);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor numérico válido.");
                        }
                        break;
                    }

                    case 2 -> {
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha elimando un nodo con el valor: "
                                    + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                    }

                    case 3 -> {
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila no está vacía");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                    }

                    case 4 -> {
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es "
                                    + pila.MostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                    }

                    case 5 ->
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamanoPila());

                    case 6 -> {
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                    }

                    case 7 ->
                        pila.MostrarValores();

                    case 8 -> {
                        JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                        opcion = 8;
                        break;
                    }

                    default ->
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelve a intentarlo de nuevo.");
                }

            } catch (NumberFormatException e) {
            }
        } while (opcion != 8);
    }
}
