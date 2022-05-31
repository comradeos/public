<?php

require_once 'tools.php';

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

?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>parking_v2_1_web_01</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <h1>Parking</h1>
    <div>
        <form action="" method="GET">
            <button name="top1">top1</button><br><br>
            <button name="bottom1">bottom1</button><br>
            <button name="bottom2">bottom2</button>
        </form>
        <hr>
        <form action="" method="POST">
            <input type="text" name="param1" value="<?php print $set_in['param1']; ?>"><br>
            <input type="text" name="param2" value="<?php print $set_in['param2']; ?>"><br>
            <input type="text" name="param3" value="<?php print $set_in['param3']; ?>"><br>
            <input type="text" name="param4" value="<?php print $set_in['param4']; ?>"><br>
            <input type="text" name="param5" value="<?php print $set_in['param5']; ?>"><br>

            <input type="submit" value="Save">
        </form>
    </div>
</body>

</html>