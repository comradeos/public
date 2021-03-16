print(' ------- 5.3 ------- ')
alien_color = 'green'  # green, yellow, red?
scores = 0
if alien_color == 'green':
    scores += 5
    print(f"You have {scores} scores!\n")

print(' ------- 5.4 ------- ')
alien_color = 'yellow'  # green, yellow, red?
scores = 0
if alien_color == 'green':
    scores += 5
else:
    scores += 10
print(f"You have {scores} scores!\n")

print(' ------- 5.5 ------- ')
alien_color = 'red'  # green, yellow, red?
scores = 0
if alien_color == 'green':
    scores += 5
elif alien_color == 'yellow':
    scores += 10
elif alien_color == 'red':
    scores += 15

print(f"You have {scores} scores!\n")

print(' ------- 5.6 ------- ')
age = 31
if age < 2:
    period = 'младенец'
elif 0 < age < 4:
    period = 'малыш'
elif 4 <= age < 13:
    period = 'ребенок'
elif 13 <= age < 20:
    period = 'подросток'
elif 20 <= age < 65:
    period = 'взрослый'
elif 65 <= age:
    period = 'пожилой человек'
else:
    period = "хз"
print(f"Итак, Вы - {period}\n")

print(' ------- 5.7 ------- ')
favorite_fruits = ['apple', 'banana', 'orange']
for fruit in favorite_fruits:
    if fruit == 'apple' or 'banana' or 'orange':
        print(f"You really like {fruit}!")
