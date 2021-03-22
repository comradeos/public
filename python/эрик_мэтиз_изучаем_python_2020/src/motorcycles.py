motorcycles = ['honda', 'yamaha', 'suzuki']
print(motorcycles[0])

motorcycles[0] = 'ducati'
print(motorcycles[0])

motorcycles.append('honda')  # добавление нового элемента в конец списка
print(motorcycles)

digs = [0, 1, 2, 3, 4, 5, 6, 7]
digs.insert(0, '^')  # добавление нового элемента после первого
print(digs)

del digs[0]  # удаление элемента
print(digs)

popped_dig = digs.pop()  # удалет последний элемент но позаоляет с ним работать
print(digs)
print(popped_dig)

last_owned_bike = motorcycles.pop()
print(f"Last owned bike was {last_owned_bike.title()}")

digs = ['one', 'two', 'three']
print(digs)

digs.remove('two')
print(digs)
