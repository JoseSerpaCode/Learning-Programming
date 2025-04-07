#include <iostream>
#include <String>
#include <cstdlib>
#include <ctime>

using namespace std;

void setVector(int vector[], int size){
	srand(time(NULL));
	for (int i = 0; i < size; i++) {
		vector[i] = rand () % 200 - 100;
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

void buscarValor(int vector[], int size, int valorBuscado) {
	bool valorEncontrado = false;
	int posicionValorBuscado;
	
	for (int i = 0; i < size; i++) {
		if (valorBuscado == vector[i]) {
			valorEncontrado = true;
			posicionValorBuscado = i;
			break;
		}
	}
	
	if (valorEncontrado) {
		cout << "El valor se ha encontrado en el vector y se encuentra en la posición: " << posicionValorBuscado << endl;
	} else {
		cout << "El valor no se encuentra en el vector" << endl;
	}
}

void multiplosTres(int vector[], int size) {
	int cantMultiplos = 0;
	for (int i = 0; i < size; i++) {
		if (i % 3 == 0 && i/3 > 0) {
			cantMultiplos++;
		}
	}
	
	cout << "La cantidad de voltajes multiplos de 3 es: " << cantMultiplos << endl;
	
	if (cantMultiplos > 15) {
		cout << "Se recomienda mejorar: los filtros electrónicos o ajustar el diseño del circuito ";
	}
}

void posicionesImpares(int vector[], int size) {
	int sizeNewVector = 0;
	int index = 0;
	
	for (int i = 0; i < size; i++) {
		if (i % 2 != 0) {
			sizeNewVector++;
		}
	}
	
	int newVector[sizeNewVector];
	for (int i = 0; i < size; i++) {
		if (i % 2 != 0) {
			newVector[index++] = vector[i];
		}
	}	
	
	getVector(newVector, sizeNewVector, "El nuevo vector es: ");
	multiplosTres(newVector, sizeNewVector);
}


int main () {
	int vecMediciones[125];
	int valorIngresado;
	
	cout << "\tOptimizacion de voltaje en un circuito" << endl;
	setVector(vecMediciones, 125);
	getVector(vecMediciones, 125, "Vector mediciones");
	cout << "Escriba el valor de un voltaje X: ";
	cin >> valorIngresado;
	buscarValor(vecMediciones, 125, valorIngresado);
	posicionesImpares(vecMediciones, 125);
	
	return 0;
}
