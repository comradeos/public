def multi_plus(*nums):
    result = 0
    for val in nums:
        result += int(val)
    return result


def show_info(
        username,
        password,
        first,
        last,
        age):
    print(f"username: {username}\n"
          f"password: {password}\n"
          f"first name: {first}\n"
          f"last name: {last}\n"
          f"age: {age}\n")
