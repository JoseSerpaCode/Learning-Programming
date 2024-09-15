### Strings ###

my_string = "Mi string"
my_other_string = "Mi otro string"

print(len(my_string))
print(len(my_other_string))
print(my_string + " " + my_other_string)

my_new_line_string = "Es es un String\ncon salto de línea"
print(my_new_line_string)


my_tab_string = "\tEs es un String con tabulación"
print(my_tab_string)


my_scape_string = "\\tEs es un String \n escapado"
print(my_scape_string)


# Formatting

name, surname, age = "Jose", "Serpa", 35


print("Mi nombre es {} {} y mi edad es {}".format(name, surname, age))
print("Mi nombre es %s %s y mi edad es %d" %(name, surname, age))            # %s = Str, %d = int
print(f"Mi nombre es {name} {surname} y mi edad es {age}")                   # -The Best-


# Desempaquetado de carácteres

print()

language = "Python"

a, b, c, d, e, f = language

print(a)
print(b)
print(c)
print(d)
print(e)
print(f)


# División

print()

language_slice = language[1:3]          # Seleccionar el rango de carácteres que se va a pintar
print(language_slice)


language_slice = language[1:]
print(language_slice)


language_slice = language[:3]
print(language_slice)


language_slice = language[-2]
print(language_slice)


language_slice = language[0:6:2]        # P y t h o n = Pto
print(language_slice)                   # 0 - 2 - 4 -


# Reverse

reversed_language = language[ :: -1]
print(reversed_language)


# Funciones

print(language.capitalize())
print(language.upper())
print(language.count("t"))
print(language.isnumeric())
print("1".isnumeric())
print(language.lower())
print(language.lower().isupper())
print(language.startswith("Py"))
print("Py" == "py")  # No es lo mismo