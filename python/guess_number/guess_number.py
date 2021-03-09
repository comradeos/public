import random


def main():
    random_number = random.randint(1, 10)
    print("Я загадал число! Попробуйте отгадать мое число:", end=" ")
    guess_counter = 0
    while True:
        guess_number = int(input())
        guess_counter += 1
        if guess_number < random_number:
            print("Слишком мало, попробуйте снова:", end=" ")
        elif guess_number > random_number:
            print("Слишком много, попробуйте снова:", end=" ")
        else:
            print(f"Верно! Это число {random_number}!"
                  f"\nКоличество попыток {guess_counter}."
                  f"\nПовторить? (да/нет):",
                  end=" ")
            repeat = input()
            if repeat == "да":
                print("\n")
                main()
            else:
                if repeat != "нет":
                    print(f"{repeat}? Похоже что нет")
                print("Спасибо за игру!")
                exit(0)


main()
