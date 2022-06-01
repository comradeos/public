<?php

require_once __DIR__ . '/tools.php';

// проверка метода отправки данных
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // строка для хранения новых настроек
    $new_set = '';
    // получение данных из формы
    $set_out = [
        'param1' => $_POST['param1'] ?? null,
        'param2' => $_POST['param2'] ?? null,
        'param3' => $_POST['param3'] ?? null,
        'param4' => $_POST['param4'] ?? null,
        'param5' => $_POST['param5'] ?? null,
    ];

    // перебор массива с формы с присваиванием в строку новых настроек
    foreach ($set_out as $key => $value) {
        $new_set .= "$key=$value\n";
    }

    // получение текущей даты/времени
    $date = new DateTime();
    // форматирование даты
    $now = $date->format('Y-m-d H:i:s');

    // запись даты в настройки
    $new_set .= "mod_date=$now";
    __print($new_set);

    // запись в файлы
    file_put_contents('set_in.ini', $new_set);
}

$set_in = parse_ini_file('set_in.ini', true);
// __print($set_in);
// __print(array_keys($set_in)[0]);
