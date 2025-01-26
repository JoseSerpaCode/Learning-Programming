//  Clase que extiende Menu y se encarga de realizar operaciones de depósito.

package cajero;

import java.util.Scanner;

/**
 * @author joses
 */
public class DepositoEfectivo extends menu {

    Scanner depositar = new Scanner(System.in); //Objeto Scanner utilizado para la entrada de datos. En este caso, el saldo que se depositará

    @Override
    public void SaldoTotal() {
        System.out.println("""
        =====================================
        Cuanto dinero deseas depositar?: """);

        saldo += depositar.nextInt();   // Al saldo se le sumará la cantidad depositada

        System.out.println("""
        Tu saldo actual es: """ + saldo + """
                                          
        ========================""");   // Muestra el saldo actual al usuario.
    }
}
