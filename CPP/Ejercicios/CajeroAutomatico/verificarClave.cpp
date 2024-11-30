#include "funciones.h"
#include <iostream>

using namespace std;

const string RED = "\033[31m";

bool VerificarClave(string claveIngresada, string claveValidar) {
    if (claveIngresada != claveValidar) {
        cout << RED << "Clave incorrecta. Intente de nuevo. \a" << endl;
        return false;
    }
    LimpiarPantalla();
    return true;
}
