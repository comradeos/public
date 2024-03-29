<?php

require_once __DIR__ . '/tools.php';
require_once __DIR__ . '/classes.php';

// __print($ini);

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $updates = '';
    $date = new DateTime();
    $config = [
        'reset_timer' => $ini['reset_timer'],
        'alarm_timer' => $ini['alarm_timer'],
        'alarm' => $ini['alarm'],
        'camera_1' => $ini['camera_1'],
        'camera_2' => $ini['camera_2'],
        'gate' => $ini['gate'],
        'car' => $ini['car'],
        'mod_date' => $date->format('Y-m-d H:i:s'),
    ];

    if (isset($_POST['reset_timer'])) {
        $config['reset_timer'] = $_POST['reset_timer'];
    } // хз шо тут

    if (isset($_POST['reset_timer'])) {
        $config['alarm_timer'] = $_POST['alarm_timer'];
    } // хз шо тут

    if (isset($_POST['alarm'])) {
        $config['alarm'] = $config['alarm'] == 0 ? 1 : 0;
    }

    if (isset($_POST['gate'])) {
        $config['gate'] = $config['gate'] == 0 ? 1 : 0;
    }

    if (isset($_POST['camera_1'])) {
        $config['camera_1'] = $config['camera_1'] == 0 ? 1 : 0;
    }

    if (isset($_POST['camera_2'])) {
        $config['camera_2'] = $config['camera_2'] == 0 ? 1 : 0;
    }

    __print($config);

    foreach ($config as $key => $value) {
        $updates .= "$key=$value\n";
    }

    file_put_contents('set_out.ini', $updates);
    file_put_contents('set_in.ini', $updates);
    header('Location: index.php');
}
