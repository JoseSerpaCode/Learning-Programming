#include "funciones.h"
#include "variablesGlobales.h"
#include <iostream>

using namespace std;

const string RED = "\033[31m";

void RegistrarNuevaClave() {
    string nuevaClave, confirmacionClave;
    do {
        LineasGraficas();
        cout << "*  REGISTRO DE NUEVAS CONTRASENAS    *" << endl;
        LineasGraficas();
        cout << "Ingrese su nueva clave: ";
        cin >> nuevaClave;
        LineasGraficas();
        cout << "Confirme su nueva clave: ";
        cin >> confirmacionClave;
        LineasGraficas();

        if (nuevaClave != confirmacionClave) {
            cout << RED << "Las claves no coinciden. Intente de nuevo. \a" << endl;
            LimpiarPantalla();
        }
    } while (nuevaClave != confirmacionClave);

    clave = nuevaClave;
    menuL = 1;
}

void SolicitarClave(const string& mensaje, string& entrada) {
    LineasGraficas();
    cout << mensaje;
    cin >> entrada;
    LineasGraficas();
}
