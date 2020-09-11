# go_try_except

while True:

    while True:
        try:
            num = int(input("Введите число: "))
            break
        except ValueError:
            print("Вы ввели строку! Пожалуйста повторите ввод.")

    if num < 0:
        print("Введенное число МЕНЬШЕ нуля")
    elif num == 0:
        print("Введенное число РАВНО нулю")
    elif num > 0:
        print("Введенное число БОЛЬШЕ нуля")
    else:
        print("Что-то не так")

    print("\n--- Давай еще разок 1/0 ---")
    yes = input()
    if yes == 0:
        break

