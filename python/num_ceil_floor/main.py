# num ceil floor

def my_ceil(num):  # в большую сторону
    return int(-(-num // 1))


def my_floor(num):  # в меньшую сторону
    return int(num - num % 1)


num = float(input("введите дробное число: "))


print("округление в большую сторону: ", my_ceil(num))
print("округление в меньшую сторону: ", my_floor(num))
