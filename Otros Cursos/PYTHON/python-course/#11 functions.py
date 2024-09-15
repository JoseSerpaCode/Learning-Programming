#FUNCTIONS#

# Una función es una porción de codigo, en el que le damos un
# dato, internamente procesa algo y luego nos puede o no devolver
# un elemento o resultado

# print()

# dir()

# type()

# def       # def <--- Palabra clave para crear una función

# _______________________________________________

def hello():
    print("Hello world")

hello()

print()

def hello(name="Person"):       # Se le indica el valor por defecto
    print("Hello " + name)

hello("Joe")
hello("Juan")
hello()

# _______________________________________________

print()

def add(number1, numebr2):
    return number1 + numebr2

print(add(10, 30))
print(add(3842893, 412531))

# _______________________________________________
print()

add = lambda N1, N2: N1 + N2
print(add(10, 30))