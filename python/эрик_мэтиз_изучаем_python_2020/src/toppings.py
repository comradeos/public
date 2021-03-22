requested_topping = 'mushrooms'
if requested_topping != 'anchovies':
    print("Hold the anchovies!")

requested_toppings = ['mushrooms', 'onion', 'pineapple']
print('mushrooms' in requested_toppings, "\n")

requested_toppings = ['mushrooms', 'onion', 'green paper', 'pineapple']
for value in requested_toppings:
    if value == 'green paper':
        print(f"Theres no {value}, sorry...")
    else:
        print(f"Adding {value}")
print("Finishing making pizza!\n")

requested_toppings = ['apple']
if requested_toppings:
    for value in requested_toppings:
        print(f"adding {value}")
    print("finished pizza")
else:
    print("are you sure you want a plain pizza?")
print("\n\n")

available_toppings = ['mushrooms', 'anchovies', 'onion',
                      'pineapple', 'green pepper', 'red pepper']
requested_toppings = ['mushrooms', 'anchovies', 'apple',
                      'peanut', 'red pepper']
for value in requested_toppings:
    if value in available_toppings:
        print(f"adding {value}")
    else:
        print(f"we have no {value}, sorry...")
print("done!")
