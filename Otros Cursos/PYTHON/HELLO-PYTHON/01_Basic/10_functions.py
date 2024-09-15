### Functions ###

# Definición

def my_function():
    print("Esto es una función")


my_function()
my_function()
my_function()



# Función con parámetros de entrada/argumentos

def sum_two_values(first_value: int, second_value):
    print(first_value + second_value)


sum_two_values(5, 7)
sum_two_values(54754, 71231)
sum_two_values("5", "7")
sum_two_values(1.4, 5.2)

my_result = sum_two_values(1.4, 5.2)
print(my_result)


# Función con parámetros de entrada/argumentos y retorno

def sum_two_values_with_return(first_value, second_value):
    my_sum = first_value + second_value
    return my_sum

my_result = sum_two_values_with_return(10, 5)
print(my_result)


def print_name (name, surname):
    print(f"{name} {surname}")

print_name(surname = "Serpa", name = "José")


# Función con parámetros de entrada/argumentos por defecto

def print_name_with_defult (name, surname, alias = "-Sin alias-"):
    print(f"{name} {surname} {alias}")

print_name_with_defult("José", "Serpa")
print_name_with_defult("José", "Serpa", "The Best")


# Función con parámetros de entrada/argumentos arbitrarios

def print_texts(*texts):
    print(type(texts))
    for text in texts:
        print(text.upper())     # Imprimir todos los textos en mayús

print_texts("Hola")
print_texts("Hola", "Python", "MoureDev")
