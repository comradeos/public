print("8.1")


def display_message():
    print("Передача аргументов")


display_message()


print("8.2")


def favorite_book(book):
    """документация"""
    print(f"One of my favorite books is '{book.title()}'")


favorite_book('alice in wonderland')
