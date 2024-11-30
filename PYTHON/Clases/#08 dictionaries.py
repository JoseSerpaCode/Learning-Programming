#DICTIONARIES#

#Permite definir un dato a partir de datos y valores

# Siempre las claves van entre dobles comillas ---> "Name" : 


product = {
    "name": "book",
    "quantity": 3,
    "price": 4.99
}

person = {
    "first_name": "Juan",
    "last_name": "Pablo"
}

# print(type(product))
# print(dir(product))

# _______________________________________________

print(person.keys())        # .keys <--- obtener las claves

print(person.items())       # .items <--- Obtener los items


person.clear()
print(person)

# _______________________________________________

products = [
    {"name": 'book', 'price': 10.99},
    {"name": 'laptop', 'price': 100}
]

print(products)