<?php

$settings_in = parse_ini_file('settings_in.ini', true);
print_r($settings_in);

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $settings_out = '';

    foreach ($settings_in as $key => $value) {
        $settings_out .= $key . "=" . $value . "\n";
    }

    $date = new DateTime();
    $now = $date->format('Y-m-d H:i:s');
    $settings_out .= 'updated=' . $now . "\n";

    file_put_contents('settings_out.ini', $settings_out);
}

?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>parking_v2_1_web_01</title>
</head>

<body>
    <div>
        <form action="" method="POST">
            <button name="top1">top1</button><br><br>
            <button name="bottom1">bottom1</button><br>
            <button name="bottom2">bottom2</button>
        </form>
        <hr>
        <form action="" method="POST">
            <input type="text" name="param1"><br>
            <input type="text" name="param2"><br>
            <input type="submit" value="Save">
        </form>
    </div>
</body>

</html>