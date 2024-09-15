### Arithmetic Operators ###

print(3 + 4)
print(3 - 4)
print(3 * 4)
print(3 / 4)
print(10 % 3)       # Obtener el Residuo
print(10 // 3)      # Aproximar una división decimal a un entero
print(2 ** 3)       # Calcular un exponente
print(2 ** 3 + 3 - 7 / 1 // 4)


# Concatenate text

print()

print("Hola " + "Python " + "¿Qué tal?")
print("Hola " + str(5))
print("Hola " * 5)
print("Hola " * (2 ** 3))

my_float = 2.5 * 2
print("Hola " * int(my_float))      # Cambiar un float(5.0) a int(5)


### Comparative Operators ###

print()

print(3 > 4)
print(3 < 4)
print(3 >= 4)
print(4 <= 4)
print(3 == 4)
print(3 != 4)

print()

print("Hola" > "Python")
print("Hola" < "Python")
print("Hola" >= "Zola")             # Ordenación alfabética por ASCII
print(len("Hola") >= len("Zola"))   # Cuenta carácteres
print("Hola" <= "Python")
print("Hola" == "Python")
print("Hola" != "Python")


### Logical Operators ###

print()

print(3 > 4 and "Hola" > "Python")                 # False and False = False
print(3 > 4 or "Hola" > "Python")                  # False or False = False

print(3 < 4 and "Hola" < "Python")                 # True and True = True
print(3 < 4 or "Hola" > "Python")                  # True or False = True

print(3 < 4 or ("Hola" > "Python" and 4 == 4))

print(not(3 > 4))                                  # Lo contrario de False (verdadero) o lo contrario de True (Falso)

# print(3 > 4 not "Hola" > "Python")