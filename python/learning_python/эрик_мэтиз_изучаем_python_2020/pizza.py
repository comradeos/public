pizza = {'crust': 'thick',
         'toppings': ['mushrooms', 'extra cheese']}

print(f"You've ordered a {pizza['crust']}-pizza"
      f"with the following toppings:")
for value in pizza['toppings']:
    print(f"\t{value}")
