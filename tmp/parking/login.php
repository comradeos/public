<?php

session_start();

if (isset($_SESSION['user'])) {
    header('location:index.php');
}

function login()
{
    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
        $login = $_POST['login'];
        $password = $_POST['password'];
        if ($login == 'admin' && $password == 'admin') {
            $_SESSION['user'] = $login;
            header('Location: index.php');
        } else {
            echo '<h3 style="color:red">Invalid username or password!</h3>';
        }
    }
}

?>


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
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

        <form method="post" class="new-form">
            <p class="welcome">Please Authorize:</p>
            <?php login(); ?>
            <div class="control_block">
                <div><label>Login: </label><input type="text" name="login"></div>
                <div><label>Password: </label><input type="password" name="password"></div>
            </div>
            <div><button type="submit" class="update">Login</button></div>
        </form>

        <div class="bottom_logo">
            <div class="bottom_circle"></div>
        </div>
    </div>

</body>

</html>