cars = ['bmw', 'audi', 'toyota', 'subaru']
print(cars)

sorted_cars = cars
sorted_cars.sort()
print(sorted_cars)

digs = [8, 6, 54, 3, 5, 1, 2, 3, 5, 6, 2, 3, 3, 5, 3, 1, 1, 1, 1]
print(digs)
digs.sort(reverse=True)
print(digs)

word = ['r', 'e', 'v', 'e', 'r', 's', 'e']
word.reverse()
print(word)

print(len(word))  #

for value in cars:
    if value == 'bmw':
        print(value.upper())
    else:
        print(value)
