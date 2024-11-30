#include <iostream>
using namespace std;

void suma(int n1, int n2, int n3) {
    int resultado = n1 + n2 + n3;
    cout << "La suma de los numeros es: " << resultado << endl;
}

void resta(int n1, int n2, int n3) {
    int resultado = n1 - n2 - n3;
    cout << "La resta de los numeros es: " << resultado << endl;
}

void division(int n1, int n2, int n3) {
    if (n2 == 0) {
        cout << "Error: División por cero no permitida (n2)" << endl;
        return;
    }
    int resultado = n1 / n2 - n3;
    cout << "La division de los numeros es: " << resultado << endl;
}

void multiplicacion(int n1, int n2, int n3) {
    int resultado = n1 * n2 * n3;
    cout << "La multiplicacion de los numeros es: " << resultado << endl;
}

void potencia(int n1, int n2) {
    int resultado = 1;
    for (int i = 0; i < n2; i++) {
        resultado *= n1;
    }
    cout << n1 << " elevado a " << n2 << " es: " << resultado << endl;
}

void raiz(int n1){
    double resultado = n1;
}

int main() {
    suma(4, 5, 6);
    resta(10, 3, 2);
    division(12, 4, 2);
    multiplicacion(3, 4, 5);
    potencia(2, 3);

    return 0;
}
