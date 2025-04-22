#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Funcion para Calcular la multiplicacion de dos matrices
void multiplicarMatrices(vector<vector<int>> matrizA, vector<vector<int>> matrizB, vector<vector<int>> &resultado, int filasA, int columnasA, int filasB, int columnasB)
{
    for (int i = 0; i < filasA; i++)
    {
        for (int j = 0; j < columnasB; j++)
        {
            resultado[i][j] = 0;
            for (int k = 0; k < columnasA; k++)
            {
                resultado[i][j] += matrizA[i][k] * matrizB[k][j];
            }
        }
    }
}

// Funcion para mostrar la matriz
void mostrarMatriz(vector<vector<int>> matriz, int filas, int columnas)
{
    for (int i = 0; i < filas; i++)
    {
        for (int j = 0; j < columnas; j++)
        {
            cout << matriz[i][j] << "\t";
        }
        cout << endl;
    }
    cout << "------------------------" << endl;
}

// Extraer diagonal de una matriz y Asignar a una nueva matriz
vector<int> extraerDiagonal(vector<vector<int>> matriz)
{
    vector<int> diagonal;
    for (int i = 0; i < 3; i++)
    {
        diagonal.push_back(matriz[i][i]);
    }
    return diagonal;
}

// Triangulo inferior de la matriz
void trianguloInferior(vector<vector<int>> matriz)
{
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (i < j)
            {
                matriz[i][j] = 0;
            }
        }
    }
    mostrarMatriz(matriz, 3, 3);

    // extraer los elementos diferentes a cero de la matriz y almacenarlos en un vector
    vector<int> elementosTriangularInferior;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (i >= j)
            {
                elementosTriangularInferior.push_back(matriz[i][j]);
            }
        }
    }

    // ordenar el vector de menor a mayor
    sort(elementosTriangularInferior.begin(), elementosTriangularInferior.end());

    // Mostrar los elementos de la triangular inferior
    cout << "Elementos de la triangular inferior: " << endl;
    for (int i = 0; i < elementosTriangularInferior.size(); i++)
    {
        cout << elementosTriangularInferior[i] << "\t";
    }
    cout << endl;
}

// Ordenar la matriz de menor a mayor
void ordenarMatriz(vector<vector<int>> &matriz)
{
    vector<int> elementos;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            elementos.push_back(matriz[i][j]);
        }
    }
    sort(elementos.begin(), elementos.end());
    int index = 0;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            matriz[i][j] = elementos[index++];
        }
    }
}

// Funcion para buscar un elemento en la matriz
void buscarElemento(vector<vector<int>> matrizA, vector<vector<int>> matrizB, vector<vector<int>> matrizC, int elementoBuscado)
{
    bool encontrado = false, encontradoMatrizA = false, encontradoMatrizB = false, encontradoMatrizC = false;

    cout << endl;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (matrizA[i][j] == elementoBuscado)
            {
                cout << "Elemento encontrado en la matriz A: " << endl;
                cout << "Fila: " << i << ", Columna: " << j << endl;
                encontradoMatrizA = true;
                encontrado = true;
            }

            if (matrizB[i][j] == elementoBuscado)
            {
                cout << "Elemento encontrado en la matriz B: " << endl;
                cout << "Fila: " << i << ", Columna: " << j << endl;
                encontradoMatrizB = true;
                encontrado = true;
            }

            if (matrizC[i][j] == elementoBuscado)
            {
                cout << "Elemento encontrado en la matriz C: " << endl;
                cout << "Fila: " << i << ", Columna: " << j << endl;
                encontradoMatrizC = true;
                encontrado = true;
            }
        }
    }

    if (!encontrado)
    {
        cout << "Elemento no encontrado en ninguna de las matrices." << endl;
    }

    if (encontradoMatrizA && encontradoMatrizB && encontradoMatrizC)
    {
        cout << "-------------------------" << endl;
        cout << "La suerte, mala o buena, siempre está con nosotros. Pero tiene una manera de favorecer a los inteligentes y darle la espalda a la estupidez" << endl;
    }
}

// Funcion principal
int main()
{
    // Definicion de las matrices A, B, C y D
    vector<vector<int>> matrizA(3, vector<int>(3)),
        matrizB(3, vector<int>(3)),
        matrizC(3, vector<int>(3)),
        matrizD(3, vector<int>(3));

    // Inicializacion de las matrices A, B y C
    matrizA = {{1, 2, 1}, {5, 4, 3}, {7, 1, 0}};
    matrizB = {{-2, 5, 7}, {4, 3, 1}, {8, -1, 3}};
    matrizC = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    while (true)
    { // Menu de opciones
        cout << "\n\n\t~ Menu de opciones ~\n" << endl;
        cout << "1. Mostrar Matrices A y B" << endl;
        cout << "2. Multiplicacion de Matrices" << endl;
        cout << "3. Extraer la diagonal de las matrices A, B y C" << endl;
        cout << "4. Transformacion de la Matriz D" << endl;
        cout << "5. Buscar elemento en cualquiera de las tres matrices (A, B o C)" << endl;
        cout << "6. Ordenar las matrices de menor a mayor" << endl;
        cout << "7. Salir" << endl;
        cout << "--------------------------------------------------" << endl; 
        int opcion;
        cout << "Ingrese una opcion: ";
        cin >> opcion;
        cout << "--------------------------------------------------" << endl;        

        switch (opcion)
        {
        case 1:
            // Mostrar Matrices A y B
            cout << "\t\tMostrar Matrices A y B \n"
                 << endl;
            cout << "Matriz A:" << endl;
            mostrarMatriz(matrizA, 3, 3);
            cout << "Matriz B:" << endl;
            mostrarMatriz(matrizB, 3, 3);
            break;
        case 2:
            // Punto 1: Multiplicacion de Matrices
            cout << "Multiplicacion de Matrices: AxB\n" << endl;
            multiplicarMatrices(matrizA, matrizB, matrizC, 3, 3, 3, 3);
            cout << "Matriz A:" << endl;
            mostrarMatriz(matrizA, 3, 3);
            cout << "Matriz B:" << endl;
            mostrarMatriz(matrizB, 3, 3);
            cout << "Resultado de la Multiplicacion --> Matriz C:" << endl;
            mostrarMatriz(matrizC, 3, 3);
            break;
        case 3:
            // Punto 2: Extraer la diagonal de las matrices A, B y C
            cout << "Extraer la diagonal de las matrices A, B y C" << endl;
            matrizD = {{extraerDiagonal(matrizA)}, {extraerDiagonal(matrizB)}, {extraerDiagonal(matrizC)}};
            cout << "Matriz D:" << endl;
            mostrarMatriz(matrizD, 3, 3);
            break;
        case 4:
            // Punto 3: Transformación de la Matriz D
            cout << "Transformacion de la Matriz D" << endl;
            trianguloInferior(matrizD);
            break;
        case 5:
            // Punto 4: Buscar elemento en cualquiera de las tres matrices (A, B o C)
            cout << "Buscar elemento en cualquiera de las tres matrices (A, B o C)" << endl;
            int numeroBuscado;
            cout << "Ingrese el elemento a buscar en las matrices A, B o C: ";
            cin >> numeroBuscado;
            buscarElemento(matrizA, matrizB, matrizC, numeroBuscado);
            break;

        case 6:
            // Punto 5: Ordenar las matrices de menor a mayor
            cout << "Ordenar las matrices de menor a mayor" << endl;
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
            break;
        case 7:
            cout << "Saliendo..." << endl;
            return 0;
            break;
        default:
            cout << "Opcion no valida" << endl;
        }
    }

    return 0;
}