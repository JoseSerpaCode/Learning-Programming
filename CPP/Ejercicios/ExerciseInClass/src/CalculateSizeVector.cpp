#include <iostream>

int main() {
    int numeros[] = {10, 20, 30, 40, 50};

    int tamaño = sizeof(numeros) / sizeof(numeros[0]);

    std::cout << "El tamaño del array es: " << tamaño << std::endl;

    return 0;
}