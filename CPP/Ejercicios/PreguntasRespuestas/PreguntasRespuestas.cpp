#include <iostream>
#include <string>

using namespace std;

int main()
{
    system("cls");

    int menu = 0;
    int puntaje = 0;
    int respuesta;

    do
    {
        cout << "\t+--------------------------------------------------+" << endl;
        cout << "\t+   Bienvenido a Quien quiere ser millonario?     +" << endl;
        cout << "\t+--------------------------------------------------+" << endl;
        cout << "\t Desea Jugar? " << endl;
        cout << "\t (1) Si" << endl;
        cout << "\t (2) No" << endl;
        cout << "\t+--------------------------------------------------+" << endl;
        cout << "\t Digita la opcion: ";
        cin >> menu;

        switch (menu)
        {
        case 1:
            for (int i = 1; i <= 3; i++)
            {
                switch (i)
                {
                case 1:
                    system("cls");
                    cout << "Pregunta 1: Cual es la capital de Francia?" << endl;
                    cout << "1. Paris" << endl;
                    cout << "2. Londres" << endl;
                    cout << "3. Berlin" << endl;
                    cout << "4. Madrid" << endl;
                    cout << "Tu respuesta (1-4): ";
                    cin >> respuesta;

                    if (respuesta == 1)
                    {
                        cout << "Respuesta correcta!" << endl;
                        puntaje++;
                    }
                    else
                    {
                        cout << "Respuesta incorrecta." << endl;
                    }
                    break;

                case 2:
                system("pause");
                    system("cls");
                    cout << "Pregunta 2: Cuanto es 2 + 2?" << endl;
                    cout << "1. 3" << endl;
                    cout << "2. 4" << endl;
                    cout << "3. 5" << endl;
                    cout << "4. 6" << endl;
                    cout << "Tu respuesta (1-4): ";
                    cin >> respuesta;

                    if (respuesta == 2)
                    {
                        cout << "Respuesta correcta!" << endl;
                        puntaje++;
                    }
                    else
                    {
                        cout << "Respuesta incorrecta." << endl;
                    }
                    break;

                case 3:
                    system("cls");
                    cout << "Pregunta 3: Quien escribio 'Hamlet'?" << endl;
                    cout << "1. Charles Dickens" << endl;
                    cout << "2. William Shakespeare" << endl;
                    cout << "3. Mark Twain" << endl;
                    cout << "4. J.K. Rowling" << endl;
                    cout << "Tu respuesta (1-4): ";
                    cin >> respuesta;

                    if (respuesta == 2)
                    {
                        cout << "Respuesta correcta!" << endl;
                        puntaje++;
                    }
                    else
                    {
                        cout << "Respuesta incorrecta." << endl;
                    }
                    break;
                }
            }

            system("cls");
            if (puntaje >= 2)
            {
                cout << "Pasaste a la siguiente ronda con " << puntaje << " puntos!" << endl;
            }
            else
            {
                cout << "No alcanzaste el puntaje necesario para pasar a la siguiente ronda." << endl;
            }
            puntaje = 0;
            break;

        case 2:
            cout << "Saliendo....." << endl;
            break;

        default:
            cout << "Opcion incorrecta." << endl;
            break;
        }

        system("pause");
        system("cls");

    } while (menu != 2);

    return 0;
}
