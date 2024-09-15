### Sets ###

# Definición: Un 'set' no es una estructura ordenada

my_set = set()
my_other_set = {}

print(type(my_set))
print(type(my_other_set))       # Inicialmente es un dict


my_other_set = {"Moure", "Serpa", 16}
print(type(my_other_set))

print(len(my_other_set))


# Inserción

my_other_set.add("MoureDev")
print(my_other_set)             # Un 'set' no es una estructura ordenada

my_other_set.add("MoureDev")    # Un 'set' no admite repetidos
print(my_other_set)


# Inserción

print("Moure" in my_other_set)
print("Mouri" in my_other_set)


# Eliminación

my_other_set.remove("Moure")
print(my_other_set)

my_other_set.clear()
print(len(my_other_set))

del my_other_set
# print(my_other_set)


# Transformación

my_set = {"Moure", "Brais", 16}
my_list = list(my_set)
print(my_list)
print(my_list[0])

my_other_set = {"Kotlin", "Swift", "Python"}


# Otras operaciones

my_new_set = my_set.union(my_other_set)
print(my_new_set.union(my_new_set).union(my_set).union({"JavaScript", "C#"}))

print(my_new_set)       # El union final (--.union({"JavaScript", "C#"})--) solo se empleó para el print y no se almacenó como tal en la variable

print(my_new_set.difference(my_set))