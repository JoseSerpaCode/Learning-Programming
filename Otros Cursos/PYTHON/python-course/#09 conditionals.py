#CONDITIONALS#

# IF <--- SI
# ELSE <--- SINO

x = 10

if x < 30:
    print("x is less than 30")

else:
    print("x is greater than 30")

# _______________________________________________

color = 'Blue'

if color == 'Blue':
    print("the color is Blue")
elif color == "Red":
    print("the color is Red")
else:
    print("any color")

# _______________________________________________

print()

name= "pedro"
last_name= "Vazques"

if name == "Juan":
    if last_name == "Vazques":
        print("You are Juan vazques")
    else:
        print("you aren't Juan")
else:
    print("you aren't Juan")

# _______________________________________________

x = 3

if x > 2 and x < 10:
    print("x is greater than two and less than or equal to ten")
else:
    print("not")
