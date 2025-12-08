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

<body class="body_blue">

    <div class="container_new">
        <div class="top_logo">
            <div class="car_title">
                <div class="top_car"></div>
                <div class="top_title"></div>
            </div>
        </div>

        <p class="welcome">Welcome, <?php echo $_SESSION['user']; ?> | <a href="logout.php">logout</a></p>

        <div class="cameras">
            <div class="camera_left"></div>
            <div class="camera_right"></div>
        </div>

        <div class="cars">
            <div class="car_left"></div>
            <div class="car_right"></div>
        </div>

        <form method="post" class="new-form">
            <div class="control_block">
                <div>
                    <label>Reset Timer: </label>
                    <input type="number" name="reset_timer" value="<?php echo $ini['reset_timer']; ?>" min=0 max=60>
                </div>
                <div>
                    <label>Reset Alarm: </label>
                    <input type="number" name="alarm_timer" value="<?php echo $ini['alarm_timer']; ?>" min=0 max=60>
                </div>
            </div>
            <button class="update" name="save">Update</button>
        </form>

        <div class="bottom_logo">
            <div class="bottom_circle"></div>
        </div>
    </div>

</body>

</html>