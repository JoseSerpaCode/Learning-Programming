#include <iostream>
#include <vector>

using namespace std;

void contarParesImpares(const vector<int> &vector);

int main()
{
    int quantityElements;
    printf("Ingrese la cantidad de elementos del vector: ");
    cin >> quantityElements;

    vector<int> vector(quantityElements);

    printf("Ingrese los elementos del vector: \n");
    for (int i = 0; i < quantityElements; i++)
    {
        printf("Please enter a number in position %d: ", (i + 1));
        cin >> vector[i];
    }

    contarParesImpares(vector);

    return 0;
}

void contarParesImpares(const vector<int> &vector)
{

    int pares = 0;
    int impares = 0;

    for (size_t i = 0; i < vector.size(); i++)
    {
        if (vector[i] % 2 == 0)
        {
            pares++;
        }
        else
        {
            impares++;
        }
    }

    printf("Cantidad de pares: %d\n", pares);
    printf("Cantidad de impares: %d\n", impares);
}