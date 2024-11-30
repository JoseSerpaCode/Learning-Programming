#include "funciones.h"
#include <iostream>

using namespace std;

const string GREEN = "\033[32m";

void LimpiarPantalla() {
    system("pause");
    system("cls");
}

void LineasGraficas() {
    cout << GREEN << "=====================================" << endl;
}
