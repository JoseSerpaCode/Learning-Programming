#STRINGS#

# Cadenas de datos

myStr = "Hello world"

print(myStr)


print ("My name is " + myStr)
print ("My name is", myStr)
print(f"My name is {myStr}")
print("My name is {0}".format(myStr))


print(dir(myStr))           #Enseña que se puede hacer con cierto tipo de dato


print(myStr.upper())        #Todo en Mayúscula


print(myStr.lower())        #Todo en Minúscula


print(myStr.swapcase())     #Invierte las mayus/minus


print(myStr.capitalize())   #La primera letra en mayus


print(myStr.replace('Hello', 'bye'))    #Reemplaza una palabra por otra


print(myStr.replace('Hello', 'bye').upper())


print(myStr.count('l'))     #Cuenta cuantas veces aparece un carácter


print(myStr.startswith('hola'))  #Saber si empieza con cierto carácter
print(myStr.startswith('Hello'))
print(myStr.startswith('H'))


print(myStr.endswith('world'))  #Inverso del starts


print(myStr.split(' '))     #Divide/separa el carácter
print(myStr.split('o')) 


print(myStr.find('o'))      #Posición del carácter
print(myStr.find(' ')) 


print(len(myStr))           #Tamaño completo del carácter


print(myStr.index('e'))     #Indice


print(myStr.isnumeric())    #Conocer si es numerico
print(myStr.isalpha())      #Inverso


print(myStr[0])             #Imprimir el carácter indicado
print(myStr[-2])
