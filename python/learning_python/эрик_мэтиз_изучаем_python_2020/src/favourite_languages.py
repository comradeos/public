favourite_languages = {'jen': 'python',
                       'sarah': 'c',
                       'edward': 'ruby',
                       'phil': 'python'}

friends = ['phil', 'sarah']

for key, value in favourite_languages.items():
    print(f"Hi, {key.title()}!")
    if key in friends:
        print(f"Hey, {key.title()}, I see you love {value.title()}!")

if '____' not in favourite_languages.keys():
    print("____")

for value in set(favourite_languages.values()):  # set - все элементы без повторов
    print(value.title())

print("____________________________________________________")






