def build_person(first_name, last_name, age=None):
    """возвращает словарь с информацией"""
    person = {'first name': first_name, 'last name': last_name}
    if age:
        person['age'] = age
    return person


musician = build_person('jimi', 'hendrix', age=27)
for key, value in musician.items():
    print(f"{key.title()}: {str(value).title()}")

print()

musician = build_person('anton', 'garcia')
for key, value in musician.items():
    print(f"{key.title()}: {str(value).title()}")


