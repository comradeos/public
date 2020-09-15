# hot dog calculator

print()
print("Калькулятор хотдогов:")

people = int(input("Введите количество людей: "))
per_man = int(input("Сколько хотдогов на рыло? "))
hot_dogs_needed = people * per_man

print()
print("Всего хотдогов нужно", hot_dogs_needed)

bread_pack = 8
sausage_pack = 10

bread_packs_needed = hot_dogs_needed / bread_pack
sausage_pack_needed = hot_dogs_needed / sausage_pack

bread_left = 8 - hot_dogs_needed % bread_pack
if bread_left == 8:
    bread_left = 0

sausage_left = 10 - hot_dogs_needed % sausage_pack
if sausage_left == 10:
    sausage_left = 0

print()
print(int(-(-sausage_pack_needed // 1)), "упаковок сосисок нужно")
print(sausage_left, "сосисок останется")
print()
print(int(-(-bread_packs_needed // 1)), "упаковок булок нужно")
print(bread_left, "булок останется")

