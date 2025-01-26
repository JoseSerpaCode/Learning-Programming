package basicsyntax;

public class BasicSyntax {

    // Variable estática
    private static int variable1;
    // Variable de instancia
    private int variable2;
    private int variable3;

    public static void main(String[] args) {

        // Creación de una instancia de la clase
        BasicSyntax mensajero1 = new BasicSyntax();
        mensajero1.asignarValores(1, 2, 3);
        mensajero1.mostrarValores();
    }

    // Método para asignar valores
    public void asignarValores(int variable1, int variable2, int variable3) {
        BasicSyntax.variable1 = variable1; // Variable estática
        this.variable2 = variable2; // Variable de instancia
        this.variable3 = variable3; // Variable de instancia
    }

    // Método para mostrar valores
    public void mostrarValores() {
        System.out.println("Variable 1 (Estática): " + variable1);
        System.out.println("Variable 2 (Instancia): " + variable2);
        System.out.println("Variable 3 (Instancia): " + variable3);
    }
}
