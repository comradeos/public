print("PythonSandbox")
dictionary = {'a': 7070,
              'b': 9090}

print(dictionary['a'])
print(dictionary['b'])

print("______________________")


def func(*agr):
    res = 0
    for i in agr:
        res += int(i)
    return res


# print(func(1, 2, 3))


def nums(arg):

    result = 1
    first_step = 3
    second_step = 2
    print(result)

    for i in range(1, arg):

        result = result + first_step
        print(result, end=' ')
        result_row = result

        for j in range(1, i + 1):
            result_row += 2
            print(result_row, end=' ')

        print()
        first_step += second_step
        second_step += 1


nums(14)
