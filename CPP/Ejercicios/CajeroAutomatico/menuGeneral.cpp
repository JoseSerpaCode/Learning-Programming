#include "funciones.h"
#include "variablesGlobales.h"
#include <iostream>

using namespace std;

void Menu() {
    LineasGraficas();
    cout << "Bienvenido al Cajero Automatico" << endl;
    LineasGraficas();

    if (menuL == 0) {
        do {
            LimpiarPantalla();
            SolicitarClave("Ingrese la clave por defecto (123): ", claveMenu);
        } while (!VerificarClave(claveMenu, clave));
        
        RegistrarNuevaClave();
    }

    while (true) {
        do {
            LimpiarPantalla();
            SolicitarClave("Ingrese su clave para ingresar al cajero: ", claveMenu);
        } while (!VerificarClave(claveMenu, clave));

        MostrarMenuOpciones();
    }
}
