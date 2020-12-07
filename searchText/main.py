def main():

    while True:
        char = input('введите символ: ')  # ввели значение с клавиатуры
        if char == 'stop':  # принудительно остановить про вводе слова "stop"
            print('<программа завершена>')
            exit()
        if len(char) > 1:  # проверка на количество введенных символов
            print('символ должен быть один, ', end='')
        elif len(char) == 1:
            break

    file = open('file.txt', 'w')  # создаем текстовый файл
    content = 'a \n b \n c \n a z f b a a r z'
    file.writelines(content)  # заполняем файл переменной что выше
    file.close()  # сохраняем, закрываем

    file = open('file.txt', 'r')  # открываем для чтения
    temp = file.readlines()  # счываем все строки ихз файла в массив
    counter = 0  # счетчик символов

    for i in range(0, len(temp)):  # проходимся по массиву файла
        text = temp[i]
        for k in range(0, len(text)):  # проходимся по массиву строки
            if text[k] == '\n':  # игнорим перенос строки
                pass
            else:
                if text[k] == char:
                    counter += 1  # при совпадении увеличиваем счетчик

    print(f'файл \'file.txt\' содержит {counter} символ(-а/-ов) \'{char}\'')
    main()  # рекурсируем (выполняем себя)


main()


