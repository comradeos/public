print("8.9")
messages = ['hi', 'hello', 'what\'s up']
sent_messages = []


def show_messages():
    for message in messages:
        print(message)


print("\n8.10")


def send_messages():
    while messages:
        current_message = messages.pop()
        print(f"sending '{current_message}'... ", end="")
        sent_messages.append(current_message)
        print(f" ... message sent")


show_messages()
send_messages()

print("\n8.11")

print(f"messages::{messages}")
print(f"sent_messages::{sent_messages}")


