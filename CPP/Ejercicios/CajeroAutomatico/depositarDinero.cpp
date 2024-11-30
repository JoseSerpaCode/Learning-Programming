#include <iostream>
#include <limits>
#include "funciones.h"
#include "variablesGlobales.h"

using namespace std;

extern int saldo, modificarSaldo;

const string CR = "\033[0m";
const string BLUE = "\033[36m";

void DepositarDinero() {
    
    cout << CR << "DEPOSITAR DINERO" << endl;
    MenuDinero();
    LineasGraficas();
    saldo += modificarSaldo;
    cout << BLUE << "Deposito exitoso." << endl;
    LineasGraficas();
    ConsultarDinero();
}
