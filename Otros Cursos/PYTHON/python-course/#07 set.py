#SET#

#Es una colección que es desordenada y que no tiene un indice

colors = {'red', 'green', 'blue'}

print(type(colors))

print('red' in colors)

colors.add('violet')

print(colors)

colors.remove('red')
print(colors)

colors.clear()
print(colors)