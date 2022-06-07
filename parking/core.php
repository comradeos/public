<?php

require_once __DIR__ . '/tools.php';

$ini = parse_ini_file('set_in.ini', true);

if ($_SERVER['REQUEST_METHOD'] == 'POST') {

    $date = new DateTime();
    $now = $date->format('Y-m-d H:i:s');
    $new_set .= "mod_date=$now";

    // file_put_contents('set_in.ini', $new_set);
    file_put_contents('set_out.ini', $new_set);
}

$set_in = parse_ini_file('set_in.ini', true);
