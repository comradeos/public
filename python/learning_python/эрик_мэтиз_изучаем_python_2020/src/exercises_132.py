print("7.1")
car = input("What kind of car should you buy? \n\t > ")
print(f"Let me see if I can find you a {car}")

print("7.2")
table_seats = int(input("How many seats? \n\t > "))
if table_seats > 8:
    print("Please wait for it ...")
else:
    print("Your table is ready!")

print("7.3")
number = int(input("Please enter a number: \n\t > "))
if number % 10 == 0:
    print("число кратно 10")
else:
    print(f"число не кратно 10, остаток = {number % 10}")

