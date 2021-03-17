print(' ------- 6.1 ------- ')
person = {'first_name': 'ivin',
          'last_name': 'iviniv',
          'age': 25,
          'city': 'girid'}
for value in person:
    print(person[value])

print(' ------- 6.2 ------- ')
favourite_numbers = {'ann': 70,
                     'ben': 61,
                     'den': 52}
for value in favourite_numbers:
    print(f"{value} :: {favourite_numbers[value]}")
print('___________________________________')
for key, value in person.items():
    print(key, value)

print('___________________________________')
for key in person.keys():
    print(key)
print('___________________________________')

for value in person.values():
    print(value)
print(' ------- 6.3 ------- ')
