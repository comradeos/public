favorite_languages = {'ann': ['c++', 'python', 'java'],
                      'jenn': ['php', 'js']}
for name, languages in favorite_languages.items():
    print(f"{name.title()}'s favorite languages are ", end='')
    for language in languages:
        print(f"{language} ", end='')
    print()

print("___________________")
a = ['a', 'b', 3, 51, 70]
for i in a:
    print(i)

print("___________________")
b = {21, 23, 32, 4, 35, '2A'}
for i in b:
    print(i)

print("___________________")
c = {'a': 2203,
     'b': 3403,
     'c': 533,
     'd': 0,
     'e': 9710}
