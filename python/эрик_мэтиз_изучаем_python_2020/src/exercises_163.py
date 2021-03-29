print("8.12")


def sandwich_maker(*components):
    print("You have ordered sandwich with:")
    for value in components:
        print(f"\t- {value}")


sandwich_maker('fish', 'onion', 'cucumber')
sandwich_maker('meat', 'cheese')
sandwich_maker('tomato')

print("\n\n8.13")


def profile_maker(first_name, last_name, **info):
    info['first name'] = first_name
    info['last name'] = last_name
    return info


io = profile_maker('iaroslav', 'os', location='ukriane', department='it')
iv = profile_maker('ivan', 'velenki', location='poland', department='design')
ol = profile_maker('olia', 'polia')

for key, value in io.items():
    print(f"{key}: {value}")
print()

for key, value in iv.items():
    print(f"{key}: {value}")
print()

for key, value in ol.items():
    print(f"{key}: {value}")


print("\n\n8.14")


def make_car(brand, model, **info):
    info['brand'] = brand
    info['model'] = model
    return info


car = make_car('bmw', 'black', price='15000')
print(car)