import requests

# https://docs.google.com/spreadsheets/d/1pxJtWcV5BxjMlhgY9AX1bxUMgoGY1_d2vKVzsES0jv0/edit#gid=311034633

print("JsonParser v.1.0")

file = open("data.txt", "r")
file_len = len(file.readlines())
file.close()

counter = 0

for i in range(0, file_len):
    with open("data.txt", "r") as file_r:
        data = file_r.readlines()[i].rstrip("\n")

    url = requests.get("https://public.api.openprocurement.org/api/2.3/tenders/" + data)
    html = url.text
    file_name = "./out/" + data + ".txt"
    file_w = open(file_name, "a")
    file_w.write(html)
    file_w.close()
    print("\t + " + data + ".txt ")
    counter += 1

print(f"Программа завершена.\n"
      f"Добавлено {counter} файлов.")
# print(html)



