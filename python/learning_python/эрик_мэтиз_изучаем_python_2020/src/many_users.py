users = {
    'aeinstein': {
        'first name': 'albert',
        'last name': 'einstein',
        'location': 'princeton'},
    'mcurie': {
        'first name': 'marie',
        'last name': 'curie',
        'location': 'paris'}
}

for username, info in users.items():
    print(f"Username: {username}")
    for key, value in info.items():
        print(f"\t{key.title()}: {value.title()}")
    print()
