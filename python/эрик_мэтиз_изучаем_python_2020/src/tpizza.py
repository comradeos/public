def make_pizza(*toppings):
    print(f"New pizza with ", end='')
    for value in toppings:
        if toppings.index(value) != len(toppings)-1:
            print(value, end=' + ')
        else:
            print(value, end='!')
            print()


