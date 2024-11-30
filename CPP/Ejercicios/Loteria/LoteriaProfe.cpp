#include<iostream>
#include<cstdlib>
#include<ctime>

using namespace std;

int main(){
    int i, j=0, op, num;
    
    // Inicializar semilla aleatoria una vez
    srand(time(0));
    
    system("Color 2");
    
    do{
        cout<<"\t+------------------------+"<<endl;
        cout<<"\t+ MENU DE OPCIONES       +"<<endl;
        cout<<"\t+------------------------+"<<endl;
        cout<<"\t 1) Mostrar Aleatorio "<<endl;
        cout<<"\t 2) Aleatorios Generados"<<endl;
        cout<<"\t 3) Salir"<<endl;
        cout<<"\t+------------------------+"<<endl;
        cout<<"\t Digita la opcion: ";
        cin>>op;
        
        switch (op){
            
            case 1:
                i = rand();
                cout<<"Numero Aleatorio: "<<i<<endl;
                break;
            
            case 2: 
                do{
                    num = rand();
                    cout<<num<<endl;
                    j++;
                }while(num != i); 
                cout<<"+--------------------------------------+"<<endl;
                cout<<"\a Numero de Intentos para Ganar: "<<j<<endl;
                cout<<"+--------------------------------------+"<<endl;
                j = 0; // Resetear el contador de intentos
                break;
            
            case 3:
                cout<<"Saliendo.....";
                break;
            
            default:
                cout<<"Opcion Incorrecta";
                break;
        }
        
        system("pause");
        system("cls");
    }while(op != 3);
    
    return 0;
}