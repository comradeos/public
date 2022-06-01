<?php require_once __DIR__ . '/core.php'; ?>

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

    <div class="container">

        <h1>Parking_v2_1_web_01</h1>
        <h2>State:</h2>

        <form method="GET">
            <button name="top1">top1</button><br>
            <div class="car-space">car-space</div>
            <button name="bottom1">bottom1</button><br>
            <button name="bottom2">bottom2</button>
        </form>

        <div class="space1"></div>

        <h2>Settings:</h2>

        <form action="" method="POST">
            <div>
                <label>param1</label>
                <input type="text" name="param1" value="<?php print $set_in['param1']; ?>">
                <label>_____</label>
            </div>
            <div>
                <label>param2</label>
                <input type="text" name="param2" value="<?php print $set_in['param2']; ?>">
                <label>_____</label>
            </div>
            <div>
                <label>param3</label>
                <input type="text" name="param3" value="<?php print $set_in['param3']; ?>">
                <label>_____</label>
            </div>
            <div>
                <label>param4</label>
                <input type="text" name="param4" value="<?php print $set_in['param4']; ?>">
                <label>_____</label>
            </div>
            <div>
                <label>param5</label>
                <input type="text" name="param5" value="<?php print $set_in['param5']; ?>">
                <label>_____</label>
            </div>

            <input type="submit" class="save" value="Save">
        </form>

    </div>
</body>

</html>