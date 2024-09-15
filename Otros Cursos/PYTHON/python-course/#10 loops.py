#LOOPS#

# FOR and WHILE


foods = ['apples', 'bread', 'cheese', 'milk', 'bananas'] 

for food in foods:
    if food == 'cheese':
        break
    print(food)

for food in foods:
    if food == 'cheese':
        continue
    print(food)

# _______________________________________________

for number in range(1, 8):
    
    if number == 5: 
        continue

    number = number*5

    print(number)


# _______________________________________________

print()

count = 4

while count <= 10:
    print(count)
    count = count + 1