banned = ['andrew', 'carilina', 'matt']
while True:
    user = input('What is your name?\n> ')
    if user.lower() == 'stop':
        exit(0)
    if user.lower() not in banned:
        print(f"Hi, {user.title()}! You can make a post!")
    else:
        print(f"Sorry, {user.title()}, you have been banned!")


