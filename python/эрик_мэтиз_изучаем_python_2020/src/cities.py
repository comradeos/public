prompt = "Please enter the name of a city you have visited.\n"
prompt += "(Enter 'quit' when you finished.)\n\t > "
while True:
    city = input(prompt)
    if city == 'quit':
        break
    else:
        print(f"\t\t < I'd love to go to {city.title()}")
