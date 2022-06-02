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

        <div class="alarm">
            <form action="act.php" method="post">
                <input type="submit" value="Alarm">
            </form>
        </div>

        <h1>Parking_v2_1_web_01</h1>
        <h2>State:</h2>

        <form method="GET">
            <button name="top1" class="<?php print $set_in['param1']; ?>">top1 (param1)</button><br>
            <div class="car-space">car-space</div>
            <button name="bottom1" class="<?php print $set_in['param2']; ?>">bottom1 (param2)</button><br>
            <button name="bottom2" class="<?php print $set_in['param3']; ?>">bottom2 (param3)</button>
        </form>

        <div class="space1"></div>

        <h2>Settings:</h2>

        <form method="POST">

            <table>
                <tr>
                    <th>Parameter</th>
                    <th>Value</th>
                    <th>Units</th>
                </tr>

                <tr>
                    <td><label>param1</label></td>
                    <td><input type="text" name="param1" value="<?php print $set_in['param1']; ?>"></td>
                    <td><label>A.</label></td>
                </tr>

                <tr>
                    <td><label>param2</label></td>
                    <td><input type="text" name="param2" value="<?php print $set_in['param2']; ?>"></td>
                    <td><label>mol.</label></td>
                </tr>

                <tr>
                    <td><label>param3</label></td>
                    <td><input type="text" name="param3" value="<?php print $set_in['param3']; ?>"></td>
                    <td><label>cd.</label></td>
                </tr>

                <tr>
                    <td><label>param4</label></td>
                    <td><input type="text" name="param4" value="<?php print $set_in['param4']; ?>"></td>
                    <td><label>sec.</label></td>
                </tr>

                <tr>
                    <td><label>param5</label></td>
                    <td><input type="text" name="param5" value="<?php print $set_in['param5']; ?>"></td>
                    <td><label>kg.</label></td>
                </tr>

            </table>


            <input type="submit" class="save" value="Save">
        </form>

    </div>
</body>

</html>