alien_0 = {}
alien_0['color'] = 'green'
alien_0['points'] = 5
print(alien_0)

print(alien_0['color'])
alien_0['color'] = 'yellow'
print(alien_0['color'])

alien_0 = {'x_position': 0, 'y_position': 25, 'speed': 'medium'}
print(f"original position: {alien_0['x_position']}")
if alien_0['speed'] == 'slow':
    x_increment = 1
elif alien_0['speed'] == 'medium':
    x_increment = 2
else:
    x_increment = 3
alien_0['x_position'] = alien_0['x_position'] + x_increment
print(f"new position: {alien_0['x_position']}")

alien_0['points'] = 15
print(f"points -> {alien_0['points']}")
# del alien_0['points']
value = alien_0.get('points', 'Oops theres no such key ... ')
print(value)
