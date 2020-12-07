def try_input():
    time = 5
    for i in range(0, time, 1):
        import time
        time.sleep(1)
        print(".", end="")
    print()
    while True:
        base = input()
        try:
            base = int(base)
            print("<<<", base)
        except ValueError:
            if base == "stop":
                exit()
            print("не число")


# try_input()

def file_rw():
    file = open("file.txt", "a", encoding="utf-8")
    file.write("ЫЫЫЫЭ")

    file = open("file.txt", "r", encoding="utf-8")
    result = file.read()
    print(">", result)

    file.close()


file_rw()

