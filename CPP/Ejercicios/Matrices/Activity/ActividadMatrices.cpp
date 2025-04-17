#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

//Funcion para Calcular la multiplicacion de dos matrices
void multiplicarMatrices(vector<vector<int>> matrizA, vector<vector<int>> matrizB, vector<vector<int>> &resultado, int filasA, int columnasA, int filasB, int columnasB) {
    for (int i = 0; i < filasA; i++) {
        for (int j = 0; j < columnasB; j++) {
            resultado[i][j] = 0;
            for (int k = 0; k < columnasA; k++) {
                resultado[i][j] += matrizA[i][k] * matrizB[k][j];
            }
        }
    }
}

//Funcion para mostrar la matriz
void mostrarMatriz(vector<vector<int>> matriz, int filas, int columnas) {
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            cout << matriz[i][j] << "\t";
        }
        cout << endl;
    }
    cout << "------------------------" << endl;
}

//Extraer diagonal de una matriz y Asignar a una nueva matriz
vector<int> extraerDiagonal(vector<vector<int>> matriz) {
    vector<int> diagonal;
    for (int i = 0; i < 3; i++) {
        diagonal.push_back(matriz[i][i]);
    }
    return diagonal;
}

//Triangulo inferior de la matriz
void trianguloInferior(vector<vector<int>> matriz) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i < j) {
                matriz[i][j] = 0;
            }
        }
    }
    mostrarMatriz(matriz, 3, 3);

    //extraer los elementos diferentes a cero de la matriz y almacenarlos en un vector
    vector<int> elementosTriangularInferior;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i >= j) {
                elementosTriangularInferior.push_back(matriz[i][j]);
            }
        }
    }

    //ordenar el vector de menor a mayor
    sort(elementosTriangularInferior.begin(), elementosTriangularInferior.end());

    //Mostrar los elementos de la triangular inferior
    cout << "Elementos de la triangular inferior: " << endl;
    for (int i = 0; i < elementosTriangularInferior.size(); i++) {
        cout << elementosTriangularInferior[i] << "\t";
    }

}

//Ordenar la matriz de menor a mayor
void ordenarMatriz(vector<vector<int>> &matriz) {
    vector<int> elementos;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            elementos.push_back(matriz[i][j]);
        }
    }
    sort(elementos.begin(), elementos.end());
    int index = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = elementos[index++];
        }
    }
}

//Funcion principal
int main() {
    // Definicion de las matrices A, B, C y D
    vector<vector<int>> matrizA(3, vector<int>(3)), 
    matrizB(3, vector<int>(3)),
    matrizC(3, vector<int>(3)),
    matrizD(3, vector<int>(3));

    matrizA = {{1, 2, 1}, {5, 4, 3}, {7, 1, 0}};
    matrizB = {{-2, 5, 7}, {4, 3, 1}, {8, -1, 3}};

    // Punto 1: Multiplicacion de Matrices
    cout << "Multiplicacion de Matrices: AxB" << endl;
    multiplicarMatrices(matrizA, matrizB, matrizC, 3, 3, 3, 3);
    cout << "Matriz A:" << endl;
    mostrarMatriz(matrizA, 3, 3);
    cout << "Matriz B:" << endl;
    mostrarMatriz(matrizB, 3, 3);
    cout << "Resultado de la Multiplicacion --> Matriz C:" << endl;
    mostrarMatriz(matrizC, 3, 3);

    // Punto 2: Extraer la diagonal de las matrices A, B y C
    cout << "Extraccion de las diagonales principales almacenadas en una cuarta matriz:" << endl;
    matrizD = {{extraerDiagonal(matrizA)}, {extraerDiagonal(matrizB)}, {extraerDiagonal(matrizC)}};
    cout << "Matriz D:" << endl;
    mostrarMatriz(matrizD, 3, 3);

    // Punto 3: Transformación de la Matriz D
    cout << "Matriz D transformada:" << endl;
    trianguloInferior(matrizD);

    //Punto 4: Buscar elemento en cualquiera de las tres matrices (A, B o C)
    int elementoBuscado;
    cout << "\n-------------------------" << endl;
    cout << "Buscador de Elementos en Matrices" << endl;
    cout << "\nIngrese el elemento a buscar en las matrices A, B o C: ";
    cin >> elementoBuscado;
    bool encontrado = false, encontradoMatrizA = false, encontradoMatrizB = false, encontradoMatrizC = false;
    
    cout << endl;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (matrizA[i][j] == elementoBuscado){
                cout << "Elemento encontrado en la matriz A: " << endl;
                cout << "Fila: " << i << ", Columna: " << j << endl;
                encontradoMatrizA = true;
                encontrado = true;
            }
            
            if (matrizB[i][j] == elementoBuscado){
                cout << "Elemento encontrado en la matriz B: " << endl;
                cout << "Fila: " << i << ", Columna: " << j << endl;
                encontradoMatrizB = true;
                encontrado = true;
            }
            
            if(matrizC[i][j] == elementoBuscado) {
                cout << "Elemento encontrado en la matriz C: " << endl;
                cout << "Fila: " << i << ", Columna: " << j << endl;
                encontradoMatrizC = true;
                encontrado = true;
            }
        }
    }

    if (!encontrado) {
        cout << "Elemento no encontrado en ninguna de las matrices." << endl;
    }

    if (encontradoMatrizA && encontradoMatrizB && encontradoMatrizC) {
        cout << "-------------------------" << endl;
        cout << "La suerte, mala o buena, siempre esta con nosotros. Pero tiene una manera de favorecer a los inteligentes y darle la espalda a la estupidez" << endl;
    }

    // Punto 5: Ordenar las matrices de menor a mayor
    cout << "\n-------------------------" << endl;
    cout << "Ordenar las matrices de menor a mayor" << endl;
    cout << "Matriz A ordenada:" << endl;
    ordenarMatriz(matrizA);
    mostrarMatriz(matrizA, 3, 3);
    cout << "Matriz B ordenada:" << endl;
    ordenarMatriz(matrizB);
    mostrarMatriz(matrizB, 3, 3);
    cout << "Matriz C ordenada:" << endl;
    ordenarMatriz(matrizC);
    mostrarMatriz(matrizC, 3, 3);
    cout << "Matriz D ordenada:" << endl;
    ordenarMatriz(matrizD);
    mostrarMatriz(matrizD, 3, 3);

    return 0;
}