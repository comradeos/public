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
        if ($login == 'admin' && $password == '1') {
            $_SESSION['user'] = $login;
            header('Location: index.php');
        } else {
            echo '<h3>Invalid username or password!</h3>';
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
</head>

<body>

    <h1>Login</h1>

    <?php login(); ?>

    <form method="post">
        <div><input type="text" name="login" placeholder="Login"></div>
        <div><input type="password" name="password" placeholder="Password"></div>
        <div><input type="submit" value="Submit"></div>
    </form>

</body>

</html>