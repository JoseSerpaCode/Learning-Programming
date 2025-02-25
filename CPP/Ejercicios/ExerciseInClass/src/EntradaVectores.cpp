#include <iostream>

using namespace std;

int multiplicacion(int vec[], int tam)
{
    int totalMult  = 1;

    for (size_t i = 0; i < tam; i++)
    {
        totalMult *= vec[i];
    }
    return totalMult;
}
int main()
{
    /*
    int tam1 = sizeof(numero) / sizeof(numero[0]) ---> 20 (por ejemplo) / 4 (valor en bits de un numero) --> 5 (el vector tiene 5  numeros)
    */
    int vec[] = {1, 2, 3, 4, 5};

    cout << string(20, '-') << endl;
    for (size_t i = 0; i < 5; i++)
    {
        cout << vec[i] << " ";
    }
    cout << "\n" << string(20, '-') << endl;

    cout << "Recorrer vector con foreach" << endl;

    for (int num : vec){ cout << num; }
    
    cout << "\n";
    cout<<"la multiplicacion de los valores dentro del vector es: "<<multiplicacion(vec, 5);
    return 0;
}