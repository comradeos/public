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
    <div class="main">
        <p class="welcome">Welcome, <?php echo $_SESSION['user']; ?> | <a href="logout.php">logout</a></p>
        <form method="post">
            <div><button class="<?php echo $cam1; ?>" name="camera_1">Camera №1</button></div>
            <div><button class="alarm <?php echo $alarm; ?>" name="alarm">
                    <!-- alarm (on/off) -->
                </button></div>
            <div class="car_area">
                <!-- car area -->
                <div class="car_model <?php echo "  $car $car_moving"; ?>">
                    <!-- car model -->
                </div>
            </div>
            <div><button class="<?php echo $gate; ?>" name="gate">Gate (<?php echo $gate_oc; ?>)</button></div>
            <div><button class="<?php echo $cam2; ?>" name="camera_2">Camera №2</button></div>
            <table>
                <tr>
                    <td><label>Reset timer: </label></td>
                    <td><input type="number" name="reset_timer" value="<?php echo $ini['reset_timer']; ?>" min=0 max=60></td>
                    <td><label>(minutes)</label></td>
                </tr>
                <tr>
                    <td><label>Reset alarm: </label></td>
                    <td><input type="number" name="alarm_timer" value="<?php echo $ini['alarm_timer']; ?>" min=0 max=60></td>
                    <td><label>(minutes)</label></td>
                </tr>
            </table>
            <div class="btn"><button name="save">Save changes</button></div>
            <div class="btn"><button name="hard_reset">Hard reset</button></div>

        </form>

    </div>
</body>

</html>