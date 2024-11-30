#include <iostream>
#include <limits>
#include "funciones.h"

using namespace std;

extern int saldo, modificarSaldo;

const string BLUE = "\033[36m";
const string RED = "\033[31m";
const string CR = "\033[0m";

void MenuDinero()
{
    LineasGraficas();
    cout << BLUE << "Seleccione la cantidad:" << endl;
    cout << BLUE  << "1. $ 20.000" << endl;
    cout << BLUE  << "2. $ 50.000" << endl;
    cout << BLUE  << "3. $ 100.000" << endl;
    cout << BLUE  << "4. $ 200.000" << endl;
    cout << BLUE  << "5. $ 300.000" << endl;
    cout << BLUE  << "6. $ 500.000" << endl;
    cout << BLUE  << "7. Valor diferente" << endl;

    int opcion;
    cout << CR << "Seleccione una opcion: ";
    while (!(cin >> opcion) || opcion < 1 || opcion > 7)
    {
        cout << RED << "Opcion invalida. Intente de nuevo: \a";
        cin.clear();
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }

    if (opcion == 7)
    {
        LimpiarPantalla();
        cout << "Ingrese un valor mayor a $20.000 y multiplo de 10: ";
        while (!(cin >> modificarSaldo) || modificarSaldo < 20000 || modificarSaldo % 10 != 0)
        {
            cout << RED << "Monto invalido. Intente de nuevo: \a";
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
        }
    }
    else
    {
        modificarSaldo 
        = opcion == 1 ? 20000 
        : opcion == 2 ? 50000  
        : opcion == 3   ? 100000
        : opcion == 4   ? 200000
        : opcion == 5   ? 300000
        : 500000;
    }
}