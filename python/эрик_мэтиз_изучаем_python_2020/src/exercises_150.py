print("8.3")


def make_shirt(size, text):
    print(f"This shirt has a size {size}\n"
          f"And the text is \"{text.upper()}\"")


make_shirt("M", "cool text 1")
make_shirt("L", "cool text 2")
make_shirt(text="cool text 3", size="XL")


print("\n8.4")


def make_shirt_default(text, size="L"):
    print(f"This shirt has a size {size}\n"
          f"And the text is \"{text.upper()}\"")


make_shirt_default('I love Python')
make_shirt_default(text='I love C++', size="XXL")


print("\n8.5")


def describe_city(city, country="Ukraine"):
    print(f"{city.title()} is a city in {country.title()}")


describe_city("Kiev")
describe_city("Poltava")
describe_city("New York", country="USA")


