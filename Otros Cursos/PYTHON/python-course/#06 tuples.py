#TUPLES#

# Agrupar datos que no cambian


x = (1, 2, 3)
# print(x)
# print(type(x))

# _______________________________________________

tuple(())         # Forma de crear una tupla
()                # Forma de crear una tupla

# _______________________________________________

y= tuple((1, 2, 3))
# print(y)

# Nota: Si solo se tiene un elemento en la tupla, esta última no
# se considerará como tal. Ejemplo

z= (1)
print(z)

# Si se desea que se considere tupla, se debe agregar una coma

p= (1,)
print(p)

# _______________________________________________

x = (1, 2, 3, 4, 5)

print(x[2])

# _______________________________________________


# Idea de como útilizar tuplas

locations = {
    (33.2221, 41.222):"Japón",
    (21.333, 23.222):"EE.UU"
}

print(type(locations))          # Esto es un diccionario