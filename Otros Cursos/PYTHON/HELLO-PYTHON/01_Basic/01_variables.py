### Variables ###


# 'Str' Variable:

my_string_variable = "My string variable"
print(my_string_variable)
print(type(my_string_variable))


# 'Int' Variable:

my_int_variable = 5
print(my_int_variable)
print(type(my_int_variable))

#Convertir una variable que era 'int' en una 'str':

my_int_to_str_variable = str(my_int_variable)
print(my_int_to_str_variable)
print(type(my_int_to_str_variable))


# 'bool' variable:

my_bool_variable = False
print(my_bool_variable)
print(type(my_bool_variable))


# Concadenación de variables en un print:

print(my_string_variable, my_int_variable, my_bool_variable)
print("Este es el valor de:", my_bool_variable)


# Funciones del sistema

print(len(my_string_variable))


# Variables en una sola línea. ¡Cuidado con abusar de esta sintaxis!


name, surname, alias, age = "Brais", "Villa", "K PRO", 35
print("Me llamo:", name, surname,". Mi edad es:", age, ". Y mi alias es:", alias)



# inputs <--- Pedir datos

first_name = input('what is your name? ')
age = input('How old are you? ')

print("Your name is:", first_name)
print(age)



# ¿Forzamos el tipo?

address = str("Mi dirección")       # My option
address: str = "Mi dirección"       # Course
address = True
address = 5
address = 1.2

print(type(address))                # Aunque se defina como 'str' en un principio, luego aparece como 'int'