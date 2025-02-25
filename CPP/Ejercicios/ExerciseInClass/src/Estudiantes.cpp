#include <iostream>

using namespace std;

void setCalificaciones(double vector[], int tam) {
    for (int i = 0; i < tam; i++) {
        cout << "Ingrese la calificación del estudiante " << i + 1 << ": ";
        
        while (true) {
            cin >> vector[i];

            if (cin.fail() || vector[i] < 0 || vector[i] > 100) {
                cin.clear();
                cin.ignore(10000, '\n');
                cout << "⚠️ Calificación inválida. Inténtalo de nuevo: ";
            } else {
                break;
            }
        }
    }
}

double getCalificacionAlta(double vector[], int tam) {
    double calificacionAlta = vector[0];
    for (int i = 1; i < tam; i++) {
        if (vector[i] > calificacionAlta) {
            calificacionAlta = vector[i];
        }
    }
    return calificacionAlta;
}

double getCalificacionBaja(double vector[], int tam) {
    double calificacionBaja = vector[0];
    for (int i = 1; i < tam; i++) {
        if (vector[i] < calificacionBaja) {
            calificacionBaja = vector[i];
        }
    }
    return calificacionBaja;
}

int getAprobaron(double vector[], int tam) {
    int aprobados = 0;
    for (int i = 0; i < tam; i++) {
        if (vector[i] >= 60) {
            aprobados++;
        }
    }
    return aprobados;
}

int validarNumero(string mensaje) {
    int numero;
    string entrada;

    while (true) {
        cout << mensaje;
        cin >> entrada;

        // Verificar si la entrada es un número entero
        bool esEntero = true;
        for (char c : entrada) {
            if (!isdigit(c)) {  // Si encuentra un carácter que no es número, es inválido
                esEntero = false;
                break;
            }
        }

        if (esEntero) {
            numero = stoi(entrada);  // Convertir la cadena a entero
            if (numero > 0) return numero;  // Solo permitimos valores positivos
        }

        cout << "⚠️ Entrada inválida. Debe ser un número entero positivo. Inténtalo de nuevo.\n";
    }
}


int main() {
    char continuar;
    
    do {
        int cantidadEstudiantes = validarNumero("-> Ingrese la cantidad de estudiantes: ");
        
        double* calificaciones = new double[cantidadEstudiantes];  // Usar memoria dinámica
        
        cout << "Ingrese las calificaciones de los estudiantes: " << endl;
        setCalificaciones(calificaciones, cantidadEstudiantes);

        cout << "\n📊 Resultados: \n";
        cout << "✅ La calificación más alta es: " << getCalificacionAlta(calificaciones, cantidadEstudiantes) << endl;
        cout << "✅ La calificación más baja es: " << getCalificacionBaja(calificaciones, cantidadEstudiantes) << endl;
        cout << "✅ Número de estudiantes que aprobaron: " << getAprobaron(calificaciones, cantidadEstudiantes) << endl;

        delete[] calificaciones;  // Liberar memoria

        cout << "\n🔄 ¿Desea volver a ejecutar el programa? (s/n): ";
        cin >> continuar;

    } while (continuar == 's' || continuar == 'S');

    return 0;
}
