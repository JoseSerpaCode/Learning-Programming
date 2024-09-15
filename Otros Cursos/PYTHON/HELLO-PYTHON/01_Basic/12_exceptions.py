### Exception Handling ###

#_____________________________________________________________

# IIMPORTANT:

Try     =  {"Run this code"}

Except  =  {"Ececute this code when there is an exception"}

Else    =  {"No exceptions? Run this code"}

Finally =  {"Alway run this code"}

#_____________________________________________________________

numberUno = 5
numberDos = 1
numberDos = "1"

# Esto NO es una forma de CONTROLAR UN ERROR!!

# if type(numberDos) == int:

#     print(numberUno + numberDos)

# else:
#     print("No se cumple")

#_____________________________________________________________

numberOne = 5
numberTwo = 1
numberTwo = "1"


# Excepción base: try, except

try:
    print(numberOne + numberTwo)
    print("No se ha producido un error")
except:
    # Se ejecuta si se produce una excepción
    print("Se ha producido un error")



# Flujo completo de una excepción: try, except, else, finally

try:
    print(numberOne + numberTwo)
    print("No se ha producido un error")

except:
    print("Se ha producido un error")

else:  # Opcional

    # Se ejecuta si no se produce una excepción
    print("La ejecución continúa correctamente")

finally:  # Opcional

    # Se ejecuta siempre
    print("La ejecución continúa")



# Excepciones por tipo

#_____________________________________________________________
try:
    print(numberOne + numberTwo)
    print("No se ha producido un error")

except ValueError:                                 # -as- <--- Indicar especificamente el error
    # Se ejecuta si se produce una excepción
    print("Se ha producido un error (valueError)")

except TypeError:
    # Se ejecuta si se produce una excepción
    print("Se ha producido un error (TypeError)")

#_____________________________________________________________


# Captura de la información de la excepción

try:
    print(numberOne + numberTwo)
    print("No se ha producido un error")

except ValueError as error:                                 # -as- <--- Indicar especificamente el error
    # Se ejecuta si se produce una excepción
    print(error)

except Exception as my_random_error_name:
    # Se ejecuta si se produce una excepción
    print(my_random_error_name)
