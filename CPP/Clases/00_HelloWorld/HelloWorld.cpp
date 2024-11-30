#include <iostream> //importar librerias

int main()
{ // Corazón del programa - main función principal

    std::cout << "Hola Mundo" << std::endl;

    /*
    ______________________________________________________________________________
    - Para dar un salto de linea se puede emplear '\n' o std::endl;
    - Para evitar utilizar std, se puede usar --> using namespace std;
    ______________________________________________________________________________

    ______________________________________________________________________________
    - std es como una caja donde están guardadas las cosas de la biblioteca estándar.
    - :: es para decirle al programa que saque algo de esa caja.
    - endl: Final de la linea, ir a la siguiente

    - cout: Significa "enviar algo a la salida", o más específicamente, enviar un 
    valor a la consola. No está uniendo o concatenando textos, sino que está 
    mandando datos a la consola para que se muestren.

    - Concatenar: Concatenar cadenas de texto se usa +

        std::string saludo = "Hola, " + std::string("mundo!");
        std::cout << saludo << std::endl;
    ______________________________________________________________________________
    */

    return 0;  // Indica que el programa terminó correctamente
}