### Reto #0: EL FAMOSO "FIZZ BUZZ” ###

"""
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
"""

for number in range(1, 101):
    
    divisibleByThree = number % 3 == 0
    divisibleByFive = number % 5 == 0
    
    if divisibleByThree and divisibleByFive:
        print ("fizzbuzz")

    elif divisibleByThree:
        print ("fizz")

    elif divisibleByFive:
        print ("buzz")

    else:
        print(number)