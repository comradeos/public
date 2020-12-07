sec = int(input("сколько секунд: "))

days = int(sec / 86400)
hours = int((sec - days * 86400) / 3600)
mins = int((sec - hours * 3600 - days * 86400) / 60)
sec = int(sec - hours * 3600 - days * 86400 - mins * 60)

if days != 0:
    print(days, "дней", end=", ")
if hours != 0:
    print(hours, "часов", end=", ")
if mins != 0:
    print(mins, "минут", end=", ")

print(sec, "секунд.")
