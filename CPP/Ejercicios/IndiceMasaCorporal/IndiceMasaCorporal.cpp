// Realiazr un programa que calcule el indice de masa corporal o IMC

#include <iostream> //pedir datos
#include <math.h>   //Libreria de matemáticas
#include <iomanip>  //Se va a utilizar setpresicion() para aproximar los decimales que se van a mostrar por pantalla

using namespace std;

int main()
{
    float peso, altura, imc;

    cout << "Ingrese su altura: ";
    cin >> altura;

    cout << "Ingrese su peso: ";
    cin >> peso;

    imc = peso / pow(altura, 2); // pow para elevar la variable a algo, en este caso a 2

    cout << "________________________________________" << endl;
    cout << "Su IMC es de: " << setprecision(4) << imc << " kg/m^2" << endl; //A partir del cuarto decimal va a aproximar
    cout << "________________________________________" << endl;

    if (imc < 18.5) {
        cout << "Usted está bajo de peso (desnutrición)." << endl;
    }
    else if (imc < 25) {
        cout << "Usted está en el peso ideal." << endl;
    }
    else if (imc < 30) {
        cout << "Usted tiene sobrepeso." << endl;
    }
    else if (imc < 35) {
        cout << "Usted tiene obesidad grado 1." << endl;
    }
    else if (imc < 40) {
        cout << "Usted tiene obesidad grado 2 (severa)." << endl;
    }
    else {
        cout << "Usted tiene obesidad grado 3 (mórbida)." << endl;
    }

    return 0;
}