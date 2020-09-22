import time

time.sleep(0)

while True:
    base = input()
    try:
        base = int(base)
        print("<<<", base)
    except ValueError:
        if base == "stop":
            exit()
        print("не число")




