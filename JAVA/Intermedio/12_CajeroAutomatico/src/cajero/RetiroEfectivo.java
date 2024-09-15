// Clase que extiende Menu y se encarga de realizar operaciones de retiro.

package cajero;

import java.util.Scanner;

/**
 * @author joses
 */
public class RetiroEfectivo extends menu{
    
    Scanner retirar = new Scanner(System.in); //Objeto Scanner utilizado para la entrada de datos. En este caso, el saldo que se retirará
    
    @Override
    public void SaldoTotal() {
        System.out.print("""
        =====================================
        Cuanto dinero deseas retirar?: """);

        saldo -= retirar.nextInt(); // Al saldo se le resta la cantidad retirada

        System.out.println("""
        Tu saldo actual es: """ + saldo + """
                                          
        ========================""");   // Muestra el saldo actual al usuario.
    }
}
