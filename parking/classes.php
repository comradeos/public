<?php

$ini = parse_ini_file('set_in.ini', true);

/* -> css classes */
$cam1 = $ini['camera_1'] == 1 ? 'on' : 'off';
$cam2 = $ini['camera_2'] == 1 ? 'on' : 'off';
$gate = $ini['gate'] == 1 ? 'on' : 'off';
$car_moving = $ini['gate'] == 1 ? 'car_moving' : '';
$car = $ini['car'] == 1 ? 'car_in' : 'car_out';
$alarm = $ini['alarm'] == 1 ? 'alarm_on' : 'alarm_off';
/* <- css classes */