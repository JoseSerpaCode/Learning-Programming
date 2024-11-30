//const -> La variable no puede ser modificada en ningún momento
//Las vatiables deben estar escritas en mayúsculas

#include <iostream>

int main()
{
    const double PI = 3.1415;

    /*
    Si en algún momento queremos modificar esta variable, se mostrará un error. Por ejemplo: si queremos asignarlle otro valor:

    PI = 21212112;  //ERROR

    */

    double radio = 10;
    double circunferencia = 2 * PI * radio;
    std::cout<< "El tamaño de la circunferencia es: "<<circunferencia;


    //Otros ejemplos

    const int ancho = 1920;
    const int altura = 1080;

    return 0;  // Indica que el programa terminó correctamente
}