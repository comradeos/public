squares = []
for i in range(1, 100):
    squares.append(i**2)

for i in squares:
    print(i)

squares_2 = [value ** 2 for value in range(1, 1000)]
print(sum(squares_2))
