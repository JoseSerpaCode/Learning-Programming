#include <iostream>
#include <vector>

using namespace std;

void calcularEstadisticas(const vector<int>& vec);
double average(const vector<int>& vec);
int maximum(const vector<int>& vec);
int minimum(const vector<int>& vec);

int main()
{
    vector<int> vectorNumeros(5);

    for (size_t i = 0; i < vectorNumeros.size(); i++)
    {
        printf("Please enter a number in position %d: ", (i + 1));
        cin >> vectorNumeros[i];
    }

    calcularEstadisticas(vectorNumeros);

    return 0;
}

void calcularEstadisticas(const vector<int>& vec)
{
    printf("\nCalculating statistics...\n");
    printf("The average is: %.2f\n", average(vec));
    printf("The maximum is: %d\n", maximum(vec));
    printf("The minimum is: %d\n", minimum(vec));
}

double average(const vector<int>& vec)
{
    int sum = 0;
    for (size_t i = 0; i < vec.size(); i++)
    {
        sum += vec[i];
    }
    return sum / (double)vec.size();
}

int maximum(const vector<int>& vec)
{
    int max = vec[0];
    for (size_t i = 1; i < vec.size(); i++)
    {
        if (vec[i] > max)
        {
            max = vec[i];
        }
    }
    return max;
}

int minimum(const vector<int>& vec)
{
    int min = vec[0];
    for (size_t i = 1; i < vec.size(); i++)
    {
        if (vec[i] < min)
        {
            min = vec[i];
        }
    }
    return min;
}
