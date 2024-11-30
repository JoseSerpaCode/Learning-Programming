#include <iostream>
#include <limits>
#include "funciones.h"
#include "variablesGlobales.h"

using namespace std;

extern int saldo, modificarSaldo;

const string RED = "\033[31m";
const string BLUE = "\033[36m";

void RetirarDinero()
{
    cout << RED << "RETIRAR DINERO" << endl;
    MenuDinero();
    LineasGraficas();
    if (modificarSaldo > saldo)
    {
        cout << RED << "Fondos insuficientes. \a" << endl;
    }
    else
    {
        saldo -= modificarSaldo;
        cout << BLUE << "Retiro exitoso." << endl;
    }
    LineasGraficas();
    ConsultarDinero();
}
