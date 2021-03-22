responses = {}
poll_active = True
name_prompt = "What is your name? \n\t > "
mountain_prompt = "What mountain? \n\t > "
add_another_prompt = "Add another one? (yes/no) \n\t > "

while poll_active:
    name = input(name_prompt)
    mountain = input(mountain_prompt)
    responses[name] = mountain
    add_another = input(add_another_prompt)
    print()

    if add_another == 'no':
        print("___________________________________")
        for name, mountain in responses.items():
            print(f"{name.title()} wants to climb {mountain.title()} mountain!")
        poll_active = False
