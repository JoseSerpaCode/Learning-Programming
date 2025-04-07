#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

void setVector(int vector[], int tam) {
    srand(time(NULL));
    for (int i = 0; i < tam; i++) {
        vector[i] = rand() % 100 + 1;
    }
}

void getVector(int vector[], int tam, string mensaje) {
    cout << endl << mensaje << "{ ";
    for (int i = 0; i < tam; i++) {
        cout << vector[i];
        if (i < (tam - 1)) {
            cout << ", ";
        }
    }
    cout << " }" << endl;
}

int sumaElementos(int vector[], int tam, int referenciaInicio, int referenciaFin) {
    int suma = 0;
    for (int i = 0; i < tam; i++) {
        if (vector[i] > referenciaInicio && vector[i] < referenciaFin) {
            suma += vector[i];
        }
    }
    return suma;
}

void shellSort(int vector[], int tam) {
    for (int gap = tam / 2; gap > 0; gap /= 2) {
        for (int i = gap; i < tam; i++) {
            int temp = vector[i];
            int j;
            for (j = i; j >= gap && vector[j - gap] > temp; j -= gap)
                vector[j] = vector[j - gap];
            vector[j] = temp;
        }
    }
}

int main() {
    int vectorMuestras[40];

    cout << "\tEstabilidad de una Fuente de Alimentación" << endl;
    
    setVector(vectorMuestras, 40);

    // Capturar valores de referencia ANTES de ordenar
    int referenciaInicio = vectorMuestras[0];
    int referenciaFin = vectorMuestras[25];

    // Calcular la suma antes de ordenar
    int suma = sumaElementos(vectorMuestras, 40, referenciaInicio, referenciaFin);

    shellSort(vectorMuestras, 40);
    getVector(vectorMuestras, 40, "El vector de las muestras (organizadas) es: \n");

    cout << "-------------------------------------------------------" << endl;
    cout << "\n\tLa suma de los elementos es: " << suma << endl;
    cout << "-------------------------------------------------------" << endl;

    if (suma >= 650) {
        cout << "\nLa fuente de alimentación **requiere revisión** (posible fallo en condensadores o reguladores)" << endl;
    } else {
        cout << "\nLa fuente de alimentación **es estable**." << endl;
    }

    return 0;
}

