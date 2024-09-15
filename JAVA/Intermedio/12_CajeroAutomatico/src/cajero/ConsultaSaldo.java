// Clase que extiende Menu y se encarga de mostrar el saldo actual al usuario.

package cajero;

/**
 * @author joses
 */
public class ConsultaSaldo extends menu{
    
    @Override
    public void SaldoTotal() { // Muestra el saldo actual al usuario.
        System.out.println("""
            ======================== 
            Tu saldo actual es: """ + saldo + """
                                              
            ========================""" );
    }
}
