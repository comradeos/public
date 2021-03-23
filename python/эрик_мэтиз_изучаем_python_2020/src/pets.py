def describe_pet(animal_type, pet_name):
    """выводит информацию о питомце"""
    print(f"I have a {animal_type}")
    print(f"My {animal_type}'s name is {pet_name.title()}.")


describe_pet('hamster', 'henry')
describe_pet('dog', 'willie')
describe_pet('cat', 'black')

describe_pet(pet_name='kenn', animal_type='parrot')

