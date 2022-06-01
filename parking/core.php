<?php

require_once __DIR__ . '/tools.php';

$set_in = parse_ini_file('set_in.ini', true);
// __print($set_in);
// __print(array_keys($set_in)[0]);

if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    $set_out = [
        'param1' => $_POST['param1'] ?? null,
        'param2' => $_POST['param2'] ?? null,
        'param3' => $_POST['param3'] ?? null,
        'param4' => $_POST['param4'] ?? null,
        'param5' => $_POST['param5'] ?? null,
    ];

    __print($set_out);

    $date = new DateTime();
    $now = $date->format('Y-m-d H:i:s');

    file_put_contents('set_out.ini', $set_out);
}
