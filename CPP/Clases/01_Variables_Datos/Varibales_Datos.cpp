    /*

    int
    float
    double
    long double
    char
    bool
    std::string

    cin -> pedir
    cout -> Mostrar
    */

#include <iostream>

int main()
{
    int y = 7;

    std::cout << y << std::endl;

    std::string nombre;
    std::cout << "Ingresa tu nombre: ";
    std::cin >> nombre;
    std::cout << "Tu nombre es: " << nombre;

    return 0;  // Indica que el programa terminó correctamente
}