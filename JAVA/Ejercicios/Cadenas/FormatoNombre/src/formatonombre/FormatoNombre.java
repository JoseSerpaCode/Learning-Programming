package formatonombre;

import java.util.Scanner;

public class FormatoNombre {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombreCompleto, nombre, apellido;
        
        System.out.print("Escribe tu nombre y apellido: ");
        nombreCompleto = entrada.nextLine();
        
        int indiceEspacio = nombreCompleto.indexOf(' ');
        
        if (indiceEspacio != -1) {
            nombre = nombreCompleto.substring(0, indiceEspacio);
            apellido = nombreCompleto.substring(indiceEspacio + 1);
            
            System.out.println("Nombre en el formato deseado: " + apellido + ", " + nombre);
        } else {
            System.out.println("Formato incorrecto. Por favor, ingrese el nombre completo incluyendo el apellido.");
        }
    }
    
}
