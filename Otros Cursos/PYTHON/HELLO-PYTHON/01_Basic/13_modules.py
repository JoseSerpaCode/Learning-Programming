### Modules ###

# Importar todo el modulo

import my_module

my_module.sumValue(5, 3, 1)
my_module.printValue("Hola Python!")


# Importar una función de un modulo

from my_module import sumValue, printValue

sumValue(1,2,3)
printValue("Hola Python!")


# Importar un modulo del sistema

import math
print(math.pi)
print(math.pow(2,8))

from math import pi as PI_VALUE         # Renombrar un valor. por ejemplo: from math import pi as NUMERO_FEO

print(PI_VALUE)