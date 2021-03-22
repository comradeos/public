fav_language = {'ann': 'c++',
                'matt': 'ruby',
                'dean': 'python',
                'joseph': 'java',
                'zak': 'c#', }
people = ['ann', 'louis', 'dean', 'kolya', 'joseph']

for name in people:
    if name not in fav_language.keys():
        print(f"Hey, {name.title()}, what is your favourite language?")
    else:
        print(f"We already know about your favourite language, {name.title()}. "
              f"It's {fav_language[name].title()} ;)")
