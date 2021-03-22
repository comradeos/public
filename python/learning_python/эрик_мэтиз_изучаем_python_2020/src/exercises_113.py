
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

x = 700
print(f"y = {1-(1/(0.15*x+1))}")


print('___________________________________')

favourite_languages = {"ann": "c++",
                       "ben": "java",
                       "ken": "python",
                       "will": "ruby",
                       "ron": "vba",
                       "zed": "c#",
                       "carl": "php",
                       "sarah": "javascript"}

for key, value in favourite_languages.items():
    print(f"{key.title()}'s favourite language is {value}.")


print("________")
for keys in favourite_languages.keys():
    print(f"{keys}")

print("________")
for value in favourite_languages.values():
    print(f"{value}")
