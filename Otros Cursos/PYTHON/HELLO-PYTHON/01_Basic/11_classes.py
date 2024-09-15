### Classes ###

# Definición: En una clase, todo debe responder a una lógica. Ej: Clase persona ---> Dormir
# x ---> Volar (una persona no puede volar) -> Clase Ave


class MyEmptyPerson:        # pass <--- Para poder dejar la clase vacía
    pass                    # pass <--- Evita que se produzca un error cuando no se permite el código vacío
                            

print(MyEmptyPerson)
print(MyEmptyPerson())


# Clase con constructor, funciones y popiedades privadas y públicas

#_____________________________________________________________

# Part 1:

class Person:                           # Tengo la posibilidad de que esta persona reciba un parámetro
    def __init__(self, name, surname):  # def__init__ <--- Constructor de clases
        self.name = name                # self (obligatorio) <--- Se refiere a la instancia de la clase (En este caso persona)
        self.surname = surname

my_person_One = Person("José", "Serpa")
print(my_person_One.name)
print(f"{my_person_One.name} {my_person_One.surname}")

#_____________________________________________________________

# Part 2:

class Person:
    def __init__(self, name, surname, alias = "Sin alias"):
        self.full_name = f"{name} {surname} ({alias})"      # Propiedad pública
        self.__name = name                                  # Propiedad privada

    def get_name (self):
        return self.__name

    def walk(self):
        print(f"{self.full_name} Está caminando")

my_person_Two = Person("José", "Serpa")
print(my_person_Two.get_name())                 # Acceder a la propiedad privada
print(my_person_Two.__name)
my_person_Two.walk()

# Ahora con 'Alias'

my_other_person = Person("Brais", "Moure", "MoureDev")
print(my_other_person.full_name)
my_other_person.walk()

# Cambiar el valor

my_other_person.full_name = "Héctor de León (El loco de los perros)" # .full_name <--- Se está accediendo al full_name y no al Person, por lo que no se requiere 'name', 'surname', 'alias'
print(my_other_person.full_name)

my_other_person.full_name = 666 
print(my_other_person.full_name)

#_____________________________________________________________