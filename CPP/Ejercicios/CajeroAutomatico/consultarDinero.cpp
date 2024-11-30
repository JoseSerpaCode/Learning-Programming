#include <iostream>
#include "funciones.h"
#include "variablesGlobales.h"

using namespace std;

extern int saldo;

const string BLUE = "\033[36m";

void ConsultarDinero() {
    LineasGraficas();
    cout << BLUE << "Saldo actual: $" << saldo << endl;
    LineasGraficas();
}
