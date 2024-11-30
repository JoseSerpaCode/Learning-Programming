#include <iostream>
#include <string>
#include <cctype>

using namespace std;

int main()
{

    system("cls");

    string frase;
    int totalPalabras = 0, letra = 0;

    cout << "Ingrese una frase: ";
    getline(cin, frase);

    
    for (size_t i = 0; i < frase.size(); i++)
    {
        if (isalpha(frase[i]))
        letra++;
    }

    if (letra < 1)
    {
        cout << "No hay nada escrito" << endl;
        totalPalabras = 0;
    }
    else
    {
        totalPalabras = 1;

        for (size_t i = 0; i < frase.size(); i++)
        {
            if (frase[i] == ' ')
            {
                totalPalabras++;
            }
        }
    }

    cout << "________________________________________________________________" << endl;
    cout << "La frase contiene: " << totalPalabras << " palabras" << endl;
    cout << "________________________________________________________________" << endl;

    return 0;
}