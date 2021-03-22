unconfirmed_users = ['ann', 'matt', 'dean']
confirmed_users = []

while unconfirmed_users:
    current_user = unconfirmed_users.pop()
    print(f"Verifying user {current_user.title()}")
    confirmed_users.append(current_user)

for current_user in unconfirmed_users:
    confirmed_users.append(current_user)
    del current_user

print(f"The following users have been confirmed:")
for user in confirmed_users:
    print(user.title())

print("__________________")

for user in unconfirmed_users:
    print(f">>>{user}")

print(f"unconfirmed_users >>> {len(unconfirmed_users)}")

print("__________________")

a = {
    'a': 231,
    'b': 345,
    'c': 456,
    'd': 567,
    'e': 678,
    'f': 789,
}

for key, value in a.items():
    print(f"{key} : {value}")


pets = ['dog', 'cat', 'dog', 'goldfish', 'cat', 'rabbit', 'cat']
print(pets)
while 'cat' in pets:
    pets.remove('cat')
print(pets)

