#include "funciones.h"
#include "variablesGlobales.h"
#include <iostream>
#include <limits>

using namespace std;

const string CR = "\033[0m";
const string RED = "\033[31m";

void MostrarMenuOpciones()
{
    int opcion = 0, opcionSalir = 0;
    do
    {
        LineasGraficas();
        cout << CR << "1. Consultar Saldo" << endl;
        cout << CR << "2. Depositar Dinero" << endl;
        cout << CR << "3. Retirar Dinero" << endl;
        cout << CR << "4. Cambiar Contrasena" << endl;
        cout << CR << "5. Salir" << endl;
        LineasGraficas();
        cout << RED << "Seleccione una opcion: ";

        while (!(cin >> opcion))
        {
            cout << RED << "Opcion invalida. Intente de nuevo: \a";
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
        }

        LimpiarPantalla();
        switch (opcion)
        {
        case 1:
            ConsultarDinero();
            break;
        case 2:
            DepositarDinero();
            break;
        case 3:
            RetirarDinero();
            break;

        case 4:
            while (true)
            {
                do
                {
                    SolicitarClave("Ingrese su clave anterior para cambiar la contrasena: ", claveMenu);
                    LimpiarPantalla();
                } while (!VerificarClave(claveMenu, clave));

                RegistrarNuevaClave();
                LimpiarPantalla();
                MostrarMenuOpciones();
            }

        case 5:

            LineasGraficas();
            cout << "Elija una opcion: " << endl;
            cout << "1. Volver al menu de inicio" << endl;
            cout << "2. Cerrar programa" << endl;
            LineasGraficas();
            while (!(cin >> opcionSalir))
            {
                cout << RED << "Opcion invalida. Intente de nuevo: \a";
                cin.clear();
                cin.ignore(numeric_limits<streamsize>::max(), '\n');
            }

            LimpiarPantalla();

            switch (opcionSalir)
            {
            case 1:
                cout << "Volviendo al menu... \a" << endl;
                LimpiarPantalla();
                Menu();
                break;

            case 2:
                cout << "Gracias por usar el cajero automatico. \a" << endl;
                exit(0);
                break;

            default:
                cout << "Opcion no valida, intente de nuevo. \a" << endl;
                break;
            }

        default:
            cout << "Opcion no valida, intente de nuevo. \a" << endl;
            break;
        }

        LimpiarPantalla();
    } while (opcion != 4);
}
