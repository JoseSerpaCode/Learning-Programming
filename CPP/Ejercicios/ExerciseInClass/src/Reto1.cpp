#include <iostream>
#include <string>

using namespace std;

void rellenarVector(int vector[], int tam, string mensaje){
	cout << "\n" << mensaje << endl;
	
	for(int i = 0; i < tam; i++){
		cout << "Codigo del estudiante " << i+1 << ": ";
		cin >> vector[i];
	}
}

void mostrarVector(int vector[], int tam, string mensaje){
	cout << "\n\n" << mensaje << " { ";
	for	(int i = 0; i < tam; i++) {
		
		cout << vector[i];
		
		if (i < (tam - 1)){
			cout << ", ";
		}
	}
	cout << " }";
}

void shellSort(int vector[], int tam) {
	for (int gap = tam/2; gap > 0; gap /= 2) {
		
		for (int i = gap; i < tam; i++) {
			
			int temp = vector[i];
			int j;
			
			for (j = i; j >= gap && vector[j-gap] > temp; j -= gap)
				vector[j] = vector[j-gap];
			
			vector[j] = temp;
		}
	}
}

void elementosCoincidentes(int vectorUno[], int vectorDos[], int sizeVectorUno, int sizeVectorDos) {
	int sizeNewVector = 0;

	for (int i = 0; i < sizeVectorUno; i++) {
        bool yaContado = false;
        for (int k = 0; k < i; k++) {
            if (vectorUno[k] == vectorUno[i]) {
                yaContado = true;
                break;
            }
        }

        if (!yaContado) {
            for (int j = 0; j < sizeVectorDos; j++) {
                if (vectorUno[i] == vectorDos[j]) {
                    sizeNewVector++;
                    break;
                }
            }
        }
    }

	int vectorTres[sizeNewVector];
	int index = 0;

	for (int i = 0; i < sizeVectorUno; i++) {
		for (int j = 0; j < sizeVectorDos; j++) {
			if (vectorUno[i] == vectorDos[j]) {
				vectorTres[index++] = vectorUno[i];
				break; // Evita contar duplicados en vectorDos
			}
		}
	}

	mostrarVector(vectorTres, sizeNewVector, "Los estudiantes que fallaron en ambas materias fueron: ");
	
	if (sizeNewVector > 5) {
		cout << endl << "Se recomienda un curso intensivo de programacion en Arduino o PLC" << endl;
	} else {
		cout << endl << "Se recomienda practicar un poco mas la teoría" << endl;
	}
}

int main(){
	
	int sizeJava, sizeC;
	
	cout << "\tDiagnostico de Fallos en Circuitos Programables" << endl;
	cout << "\nIngrese el numero de estudiantes que reprobaron en Java: ";
	cin >> sizeJava;	
	cout << "\nIngrese el numero de estudiantes que reprobaron en C: ";
	cin >> sizeC;
	
	int vecJava[sizeJava];
	int vecC[sizeC];
	
	rellenarVector(vecJava, sizeJava, "A continuacion digite el codigo de cada estudiante que reprobo en Java");
	rellenarVector(vecC, sizeC, "A continuacion digite el codigo de cada estudiante que reprobo en C");
	mostrarVector(vecJava, sizeJava, "El vector original -Java- es: ");
	mostrarVector(vecC, sizeC, "El vector original -C- es: ");
	
	shellSort(vecJava, sizeJava);
	shellSort(vecC, sizeC);
	
	mostrarVector(vecJava, sizeJava, "El vector organizado -Java- es: ");
	mostrarVector(vecC, sizeC, "El vector organizado -C- es: ");
	
	elementosCoincidentes(vecJava, vecC, sizeJava, sizeC);

	return 0;
}
