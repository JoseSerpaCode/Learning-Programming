### Loops ###

# While

i = 0

while i < 10:

    print(i)
    i += 1

else: # Es opcional
    print("Mi condición es mayor o igual que 10")

print("La ejecución continúa")

while i < 20:
    i += 1

    if i == 15:
        print("Se detiene la ejecución")
        break

    print(i)

print("La ejecución continúa")


# For

#_______________________________________________________________

my_list = [35, 24, 62, 52, 30, 30, 17]

for element in my_list:
    print(element)

#_______________________________________________________________

print()

#_______________________________________________________________

my_tuple = (35, 1.77, "Brais", "Moure", "Brais")

for element in my_tuple:
    print(element)

#_______________________________________________________________

print()

#_______________________________________________________________

my_set = {"Brais", "Moure", 35}

for element in my_set:
    print(element)

#_______________________________________________________________

print()

#_______________________________________________________________

my_dict = {"Nombre": "Brais", "Apellido": "Moure", "Edad": 35, 1: "Python"}

for element in my_dict:
    print(element)

    if element == "Edad":
        break                   # break <--- Se para el loops y se continuan con las operaciones fuera de él
        continue                # Continue <--- Hace un Break sin llegar a parar todo, solo vuleve a la función inicial (Se recomienda no utilizarlo)
    print("Se ejecuta")
else:
    print("\tEl bucle for para diccionario ha finalizado\n")

#_______________________________________________________________

for element in my_dict.values():
    print(element)