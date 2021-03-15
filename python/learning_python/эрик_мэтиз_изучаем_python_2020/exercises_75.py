print(' ------- 4.3 ------- ')
for i in range(1,21):
    print(i)

print('\n4.4')
digs = []
for i in range(1, 1000001):
    digs.append(i)
print('min:', min(digs))
print('max:', max(digs))

print('\n ------- 4.5 ------- ')
print('sum:', sum(digs))

print('\n ------- 4.6 ------- ')
for i in range(1, 20, 2):
    print(i)

print('\n ------- 4.7 ------- ')
digs_3 = []
for i in range(3, 30, 3):
    digs_3.append(i)

for value in digs_3:
    print(value)

print('\n ------- 4.8 ------- ')
cubes = []
for i in range(1, 10):
    cubes.append(i**3)
print(cubes)


print('\n ------- 4.9 ------- ')
print([value ** 3 for value in range(1, 10)])  # используем генератор списков
