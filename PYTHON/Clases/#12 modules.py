#MODULES#

# TYPES:

# Own modules <--- Escribir nosotros mismos
# Thirdy party modules <--- Descargar desde internet
# Python modules <--- Descargar desde la biblioteca de python

import datetime

print(datetime.date.today())

print(datetime.timedelta(minutes=120.8))

print()

from datetime import timedelta, date

print(timedelta(minutes=120.8))
print(date.today())

print()

# _______________________________________________

# Importar desde otro modulo:

import fmath

fmath.add(1,2)
fmath.substract(1,2)

from fmath import add, substract

add(1,2)
substract(1,2)

# _______________________________________________

# Importar desde otro modulo de internet:

# PyPI <--- sitio web

from colorama import Fore, Style, init
init(covert = True)
print(Fore.RED + "Hello world")

