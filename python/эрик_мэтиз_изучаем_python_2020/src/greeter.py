# name = input("What is you name?\n\t> ")
# print(f"Hello, {name}!")

while True:
    print("Tell us your name (enter 'q' to exit).")
    first_name = input("Your first name? \n\t > ")
    if first_name == 'q':
        break
    last_name = input("Your last name? \n\t > ")
    if last_name == 'q':
        break
    full_name = f"{first_name} {last_name}".title()
    print(f"Greetings, {full_name}!\n")

