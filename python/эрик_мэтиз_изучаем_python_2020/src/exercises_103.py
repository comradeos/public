users = ['admin', 'user', 'editor']
curr_user = 'admin'
if curr_user == 'admin':
    print(f"Hello, {curr_user.title()}, would you like to see a status report?")
else:
    print(f"Hello, {curr_user.title()}, thank you for logging in again!")
print()

users = []
if not users:
    print("We need some users!")
print()

current_users = ['dan', 'matt', 'ann', 'kelly', 'alice', 'cooper']
new_users = ['ann', 'cooper', 'foxy', 'bill', 'who']
for value in new_users:
    if value.lower() in current_users:
        print(f"Dear {value.title()}, please use another name!")
    else:
        print(f"Welcome, {value.title()}!")

nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]
nums_th = []
for value in nums:
    if value == 1:
        # print(f"{value}st")
        nums_th.append(f"{value}st")
    elif value == 2:
        # print(f"{value}nd")
        nums_th.append(f"{value}nd")
    else:
        # print(f"{value}th")
        nums_th.append(f"{value}th")

print(nums_th)
list_0 = {'a1': 5, 'b2': 10}
print(list_0['a1'] + list_0['b2'])

my_tuple = ('a', 'b', 13, 4)
print(my_tuple[2] ** my_tuple[3])
