def greet_users(names):
    """вывод простого приветствия для каждого пользователя в списке"""
    for name in names:
        print(f"Hello, {name.title()}!")


greet_users(['ann', 'ben', 'den'])
