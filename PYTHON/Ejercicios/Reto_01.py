### Reto #1: ¿ES UN ANAGRAMA? ###

"""
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
"""

def anagrame( first_word, second_word):
    
    if len(first_word) == len(second_word):

        print(f"{first_word}, {second_word}")

        if first_word.__index__(1) == second_word:
            print("Correcto")

anagrame(input(), input())