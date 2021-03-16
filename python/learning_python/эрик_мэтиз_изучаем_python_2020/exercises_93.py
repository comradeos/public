print(' ------- 5.1 ------- ')
car = 'subaru'
print("is car == 'subaru'? i predict true")
print(car == 'subaru')

print("is car == 'audi'? i predict false")
print(car == 'audi')


list_0 = [1, 2, 3]
list_1 = [1, 2, 3, 4, '5', 6, 7]
if len(list_0) == len(list_1):
    print("yes/true")
else:
    print("no/false")

if len(list_0) < 10:
    print("yes/true")

if list_0[0] == list_1[0]:
    print("yes/true")
else:
    print("no/false")

print(' ------- 5.2 ------- ')

string_0 = 'this is a string'
string_1 = 'This Is A String'

print(string_0 == string_1)
print(string_0.lower() == string_1.lower())
print(0 < 1, 0 > 1, 10 <= 20, 20 >= 10)
print(1 == 0 or 7 > 5)
print(1 != 0 and 7 == 7)

list_0 = ['hi', 'my', 'name', 'is']
print('name' in list_0)
print('name' not in list_0)
