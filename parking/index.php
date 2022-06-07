<?php

require_once __DIR__ . '/session.php';
require_once __DIR__ . '/core.php';

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
    <div>Welcome, <?php echo $_SESSION['user']; ?> | <a href="logout.php">Sign out</a></div>
    <div>
        <form action="" method="post">
            <div><button name="cam_1">camera #1</button></div>
            <div class="alarm">alarm</div>
            <div class="car_area">car area</div>
            <div><button name="gate">gate</button></div>
            <div><button name="cam_2">camera #2</button></div>
            <table>
                <tr>
                    <td>Reset timer</td>
                    <td><input type="number" name="reset_timer" value="<?php echo $ini['reset_timer']; ?>"></td>
                    <td>mins</td>
                </tr>
                <tr>
                    <td>Reset alarm</td>
                    <td><input type="number" name="alarm_timer" value="<?php echo $ini['alarm_timer']; ?>"></td>
                    <td>mins</td>
                </tr>
            </table>
            <div><button name="alarm">alarm</button></div>
        </form>
    </div>
</body>

</html>