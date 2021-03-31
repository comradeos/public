class Dog:
    """простая модель собаки"""

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def sit(self):
        """собака садится по команде"""
        print(f"{self.name.title()} is now sitting!")

    def roll_over(self):
        print(f"{self.name.title()} is rolled over!")


dog_brownie = Dog('brownie', 12)


class Test:

    def __init__(self, a, b):
        self.a = a
        self.b = b

    def sum(self):
        return self.a + self.b


_obj = Test(1, 2)
print(_obj.sum())


class Cat:
    def __init__(self, name):
        self.name = name

    def sounds(self):
        print(f"{self.name} says meeeuo!")


_obj = Cat('asdasd')
_obj.sounds()