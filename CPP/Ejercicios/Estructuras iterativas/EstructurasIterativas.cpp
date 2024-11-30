#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
    const int LAPTOP = 1500000, TEL = 850000, AUR = 92000;
    int ingresoP = 1, menuProducto, uLaptop = 0, uTel = 0, uAur = 0, totalLaptop = 0, totalTel = 0, totalAur = 0, recaudoLaptop = 0, recaudoTel = 0, recaudoAur = 0, total = 0;

    while (ingresoP == 1)
    {
        do
        {
            // Menú de selección de producto
            cout << "____________________" << endl;
            cout << "Elija un producto" << endl;
            cout << "Laptop         (1)" << endl;
            cout << "Telefono       (2)" << endl;
            cout << "Auriculares    (3)" << endl;
            cout << "Seleccione un producto: ";
            cin >> menuProducto;
        } while (menuProducto < 1 || menuProducto > 3);

        switch (menuProducto)
        {
        case 1:
            // Ingreso producto
            do
            {
                cout << "__________________________________________________________________________________________" << endl;
                cout << "Digite la cantidad vendida de laptops (Debe ser mayor a 0 unidades y menor o igual que 3): ";
                cin >> uLaptop;
            } while (uLaptop < 1 || uLaptop > 3);

            totalLaptop += uLaptop;
            break;

        case 2:
            // Ingreso producto
            do
            {
                cout << "__________________________________________________________________________________________" << endl;
                cout << "Digite la cantidad vendida de telefonos (Debe ser mayor a 0 unidads): ";
                cin >> uTel;
            } while (uTel < 1);

            totalTel += uTel;
            break;

        case 3:
            // Ingreso producto
            do
            {
                cout << "__________________________________________________________________________________________" << endl;
                cout << "Digite la cantidad vendida de auriculares (Debe ser mayor a 0 unidades): ";
                cin >> uAur;
            } while (uAur < 1);

            totalAur += uAur;
            break;

        default:
            break;
        }

        do
        {
            cout << "____________________" << endl;
            cout << "Desea elegir otro producto?: " << endl;
            cout << "Si         (1)" << endl;
            cout << "No         (2)" << endl;
            cout << "Seleccione una opcion: ";
            cin >> ingresoP;
        } while (ingresoP < 1 || ingresoP > 2);
    }

    recaudoLaptop = totalLaptop * LAPTOP;
    recaudoTel = totalTel * TEL;
    recaudoAur = totalAur * AUR;
    total = recaudoLaptop + recaudoTel + recaudoAur;

    cout << "____________________" << endl;
    cout << "Laptops vendidas: " << totalLaptop << endl;
    cout << "Recaudado por la venta de laptops: " << recaudoLaptop << endl;
    cout << "____________________" << endl;
    cout << "Telefonos vendidos: " << totalTel << endl;
    cout << "Recaudado por la venta de Telefonos: " << recaudoTel << endl;
    cout << "____________________" << endl;
    cout << "Auriculares vendidos: " << totalAur << endl;
    cout << "Recaudado por la venta de Auriculares: " << recaudoAur << endl;
    cout << "____________________" << endl;
    cout << "El total vendido es: " << total << endl;
}