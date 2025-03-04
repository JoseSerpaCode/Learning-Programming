#include <iostream>
#include <random>
#include <ctime>
#include <stdlib.h>

using namespace std;

void setTemperaturas(double vector[], int tam)
{
    srand(time(0));
    for (int i = 0; i < tam; i++)
    {
        vector[i] = 35.0 + static_cast<float>(rand()) / (RAND_MAX / (40.0 - 35.0));
    }
}

double buscarTemperatura(double vector[], int tam)
{
    int posicion = rand() % tam;
    return vector[posicion];
}

bool esPrimo(int num) {
    if (num < 2) return false;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) return false;
    }
    return true;
}

/*
int filtrarPrimos(float temperaturas[], int n) {
    int contador = 0;
    for (int i = 0; i < n; i++) {
        int parteEntera = static_cast<int>(temperaturas[i]);
        if (esPrimo(parteEntera)) {
            primos[contador++] = parteEntera;
        }
    }
    return contador;
}
    */


void deteccionFiebre(double vector[], int tam)
{
    int tamanoNuevoVector = 0;

    for (int i = 0; i < tam; i++)
    {
        if (vector[i] > 38)
        {
            tamanoNuevoVector++;
        }
    }

    double nuevoVector[tamanoNuevoVector];
    int j = 0;

    for (int i = 0; i < tam; i++)
    {
        if (vector[i] > 38.0)
        {
            nuevoVector[j++] = vector[i];
        }
    }

    for (int i = 0; i < tamanoNuevoVector; i++)
    {
        cout << nuevoVector[i] << endl;
    }
}

int validarNumero(string mensaje)
{
    int numero;
    string entrada;

    while (true)
    {
        cout << mensaje;
        cin >> entrada;

        bool esEntero = true;
        for (char c : entrada)
        {
            if (!isdigit(c))
            {
                esEntero = false;
                break;
            }
        }

        if (esEntero)
        {
            numero = stoi(entrada);
            if (numero > 0)
                return numero;
        }

        cout << "Entrada invalida. Debe ser un numero entero positivo. Intentalo de nuevo.\n";
    }
}

int main()
{

    int cantidadTemperaturas = validarNumero("-> Ingrese la cantidad de temperaturas a almacenar: ");

    double temperaturas[cantidadTemperaturas];
    setTemperaturas(temperaturas, cantidadTemperaturas);

    cout << string(50, '_') << endl;
    cout << "Busqueda de temperatura aleatoria: " << buscarTemperatura(temperaturas, cantidadTemperaturas) << endl;    
    cout << string(50, '_') << endl;
    cout << "Temperaturas que indican fiebre: " << endl;
    deteccionFiebre(temperaturas, cantidadTemperaturas);
    cout << string(50, '_') << endl;
    /*cout << "Filtrado de numeros primos: " << filtrarPrimos(temperaturas, cantidadTemperaturas)<< endl;*/
    cout << string(50, '_') << endl;

    return 0;
}