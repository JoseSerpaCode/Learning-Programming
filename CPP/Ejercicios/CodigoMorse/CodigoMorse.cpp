//Realiza un algoritmo que permita ingresar una frase y la muestre en codigo morse

#include <iostream>
#include <string>
#include <locale.h>

using namespace std;

int main () {

    setlocale(LC_CTYPE, "spanish");

    string frase;
    char c [frase.length() - 1];

    cout << "*** CODIGO MORSE ***";
    cout << "Escriba una frase: ";
    getline(cin, frase);


    for (size_t i = 0; i < frase.length() - 1; i++)
    {
        
    }
    

    return 0;

}
