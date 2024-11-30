#ifndef FUNCIONES_H
#define FUNCIONES_H

#include <string>
using namespace std;

// Declaraciones de funciones
bool VerificarClave(string clave, string claveMenu);
void LimpiarPantalla();
void LineasGraficas();
void ConsultarDinero();
void DepositarDinero();
void RetirarDinero();
void MenuDinero(); 
void MostrarMenuOpciones();
void Menu();
void RegistrarNuevaClave();
void SolicitarClave(const string& mensaje, string& entrada);

#endif
