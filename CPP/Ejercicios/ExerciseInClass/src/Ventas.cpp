#include <iostream>

using namespace std;

void rellenarVector(double vector[], int tam)
{
    for (size_t i = 0; i < tam; i++)
    {
        cout << "Ingrese el valor del producto " << i + 1 << ": ";

        while (true)
        {
            cin >> vector[i];

            if (cin.fail() || vector[i] < 0 || vector[i] > 100)
            {
                cin.clear();
                cin.ignore(10000, '\n');
                cout << "⚠️ Precio inválido. Inténtalo de nuevo: ";
            }
            else
            {
                break;
            }
        }
    }
}

double totalVentas(double vector[], int tam)
{
    double suma = 0;
    for (size_t i = 0; i < tam; i++)
    {
        suma += vector[i];
    }
    return suma;
}

double promedioVentas(double total, int tam)
{
    return total / tam;
}

int productoCaro(double vector[], int tam)
{
    double precioAlto = vector[0];
    int posicion = 0;
    for (size_t i = 1; i < tam; i++)
    {
        if (vector[i] > precioAlto)
        {
            precioAlto = vector[i];
            posicion = i;
        }
    }
    return posicion;
}

int productoBarato(double vector[], int tam)
{
    double precioBajo = vector[0];
    int posicion = 0;
    for (size_t i = 1; i < tam; i++)
    {
        if (vector[i] < precioBajo)
        {
            precioBajo = vector[i];
            posicion = i;
        }
    }
    return posicion;
}

int main()
{
    int cantidadProductos;

    // Validación de cantidad de productos
    do
    {
        cout << "Ingrese la cantidad de productos vendidos: ";
        cin >> cantidadProductos;

        if (cin.fail() || cantidadProductos <= 0)
        {
            cin.clear();
            cin.ignore(10000, '\n');
            cout << "⚠️ Entrada inválida. Debe ser un número entero positivo. Inténtalo de nuevo." << endl;
        }
        else
        {
            break;
        }
    } while (true);

    double productos[cantidadProductos];

    // Se solicita el precio de cada producto
    rellenarVector(productos, cantidadProductos);

    // Se obtiene el total de ventas una sola vez
    double total = totalVentas(productos, cantidadProductos);

    // Se obtiene el precio del producto más caro y más barato
    double precioProductoCaro = productos[productoCaro(productos, cantidadProductos)];
    double precioProductoBarato = productos[productoBarato(productos, cantidadProductos)];

    // Se muestra el resultado
    cout << string(50, '_') << endl;
    cout << "📊 Resultados: " << endl;
    cout << "🔹 Producto más caro: $" << precioProductoCaro << endl;
    cout << "🔹 Producto más barato: $" << precioProductoBarato << endl;
    cout << "🔹 Total de ventas: $" << total << endl;
    cout << "🔹 Promedio de ventas: $" << promedioVentas(total, cantidadProductos) << endl;

    return 0;
}
