#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>

using namespace std;

void llenarMatriz(vector<vector<int>> matriz, int filas, int columnas){
	srand(time(NULL));
	
	for(int i = 0; i < filas; i++) {
		for(int j = 0; j < columnas; j++) {
			matriz[i][j] = rand () % 6 + 0;
		}
	}
}

void mostrarMatriz(vector<vector<int>> matriz, int filas, int columnas){
	for(int i = 0; i < filas; i++) {
		for(int j = 0; j < columnas; j++) {
			cout << matriz[i][j] << " ";
		}
		cout << endl;
	}
}

int main() {
	
	int cantEstudiantes, cantMaterias;
	cout << "Ingrese la cantidad de estudiantes: ";
	cin >> cantEstudiantes;
	cout << "Ingrese la cantidad de materias: ";
	cin >> cantMaterias;
	
	vector<vector<int>> matriz(cantEstudiantes, vector<int>(cantMaterias));
	llenarMatriz(matriz, cantEstudiantes, cantMaterias);
	mostrarMatriz(matriz, cantEstudiantes, cantMaterias);
	
	return 0;
}