/*
 * Clase principal que contiene el método main y se encarga de iniciar la aplicación.
 * Métodos Relevantes: main(String[] args): Inicia el programa creando una instancia de MenuCajero y llamando al método menuCajero().
*/

package cajero;

public class MenuCajero extends menu {

    @Override
    public void SaldoTotal() {
    }

    public static void main(String[] args) {
        MenuCajero mensajeroMenu = new MenuCajero();
        mensajeroMenu.menuCajero();
    }
}
