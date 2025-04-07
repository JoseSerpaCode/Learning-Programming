#include <iostream>

using namespace std;

int main() {
    int n, m;
    cout << "Ingrese el número de filas: ";
    cin >> n;
    cout << "Ingrese el número de columnas: ";
    cin >> m;

    int matriz[n][m];

    // Llenar la matriz con números aleatorios
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matriz[i][j] = rand() % 5;
        }
    }

    // Mostrar la matriz
    cout << "La matriz es:" << endl;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cout << matriz[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}