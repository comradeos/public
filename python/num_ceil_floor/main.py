# num ceil floor

def my_ceil(n):  # в большую сторону
    return int(-(-n // 1))


def my_floor(n):  # в меньшую сторону
    return int(n - n % 1)


number = float(input("введите дробное число: "))


print("округление в большую сторону: ", my_ceil(number))
print("округление в меньшую сторону: ", my_floor(number))
