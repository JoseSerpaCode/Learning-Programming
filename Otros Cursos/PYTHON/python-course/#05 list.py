#LIST#

demo_list = [1, 'hello', 1.34, True, [1, 2, 3]]
colors = ['red', 'green', 'blue']
print(colors)

# _______________________________________________

list(())        # Forma de crear una lista
[]              # Forma de crear una lista

# _______________________________________________

number_list = list((1, 2, 3, 4))
# print(type(number_list))

r = list(range(1, 10))      # Rango de x número a x numero
print(r)

# _______________________________________________

# print(dir(colors))

print(len(colors))                  # len(variable) <--- Cuantos elementos existen
print(len(demo_list))


print(colors[1])                    # variable[] <--- posición del elemento


print('green' in colors)            # 'x' in variable <--- Conocer si está en la lista
print('violet' in colors)


print(colors)
colors[2] = "orange"                # variable[] = 'x' <--- Cambiar un elemento por otro
print(colors)


colors.append(('violet', 'yellow'))  # .append <--- Agregar elementos -se verá la tupla-
print(colors)

colors.extend(['violet', 'yellow'])  # .extend <--- Agregar elementos sin tomar en cuenta la tupla o list
colors.extend(['pink', 'black'])
print(colors)


colors.insert(1, 'pink')            # .insert <--- insertar un elemento en un punto dado
colors.insert(len(colors), 'violet')
print(colors)


colors.pop(3)                       # .pop <--- Eliminar un elemento, sino se le dá un indice, elimina el último elemento
print(colors)


colors.remove('green')              # remove <--- Remover un valor escribiendo su nombre
print(colors)


# colors.clear()                      # .clear <--- Limpia la lista
print(colors)


# colors.sort()                       # .sort <--- Los ordena alfabeticamente
print(colors)
# colors.sort(reverse=True)           # reverse=True <--- Los ordena de forma inversa
print(colors)


print(colors.index('red'))         # .index <--- obtener el indice de un elemento


print(colors.count('red'))         # .count <--- cuantas veces existe ese elemento


colors_copy = colors.copy()        # .copy  <--- copiar los elementos de una variable a otra
print(colors_copy)


del colors[1]                      # del  <--- Eliminar un elemento en concreto
print(colors)