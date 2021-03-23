def formatted_name(first_name, last_name):
    """возвращает аккуратно отформатированное имя"""
    full_name = f"{first_name} {last_name}"
    return full_name.title()


musicians = []

musicians.append(formatted_name("jimi", "hendrix"))
musicians.append(formatted_name("eric", "clapton"))
musicians.append(formatted_name("cedric", "bixler"))
musicians.append(formatted_name("maynard", "keenan"))

for index, value in enumerate(musicians):
    if index < len(musicians) - 1:
        print(f"{value}, ", end='')
    else:
        print(f"{value}")


def formatted_name_mid(first_name, last_name, middle_name=''):
    """возвращает аккуратно отформатированное имя"""
    full_name = f"{first_name} {middle_name} {last_name}"
    return full_name.title()


musician = formatted_name_mid(first_name="john", middle_name="lee", last_name="hooker")
print(musician)

# print(musician)
