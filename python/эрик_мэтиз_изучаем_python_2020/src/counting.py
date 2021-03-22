current_number = 1
while current_number <= 5:
    print(f"num: {current_number}")
    current_number += 1

print("_________________")
current_number = 0
while current_number < 10:
    current_number += 1
    if current_number % 2 == 0:
        continue
    print(current_number)


