<?php


/**
 * I/O var_dump++.
 * 
 * Better var_dump: cool formatted, colored output 
 * of variable names and values.
 * 
 * @param mixed  $value value.
 * @param string  $is_error 'error'/else'.
 * @param string  $var_name name of variable.
 * 
 * @return null
 */
function __print($value = '', $is_error = '', $var_name = '')
{
    if ($value == '') {
        echo '<pre><h1 style="color: #ad0000">[missing data]</h1></pre>';
    } else {

        $color = '#ffffff;';

        // if type is error - change color
        if ($is_error == ('error' || 'err')) {
            $color = '#ff7c7c;';
        }

        // get variable name from $GLOBALS
        if ($var_name == '') {
            foreach ($GLOBALS as $key => $val) {
                if ($val == $value) {
                    $var_name = $key;
                }
            }
        }

        $var_name = "<p style=\"color: #71ff9d;\">[$var_name]</p>";

        echo "<div style=\"
            color: $color;
            font-size: 16px;
            background: #0e0e0e;
            padding: 15px;
            margin: 15px 0;
        \">";

        echo "<pre>$var_name";
        var_dump($value);
        echo '</pre></div>';
    }
}


/**
 * Random decimal.
 * 
 * Pseudo generator of decimal number between two values.
 * 
 * @param int $min minimal value
 * @param int $max maximum value
 * 
 * @return float pseudo-generated decimal value (e.g. 7.1)
 */
function rand_decimal($min, $max)
{
    return mt_rand($min * 10, $max * 10) / 10;
}


/**
 * Random integer.
 * 
 * Pseudo generator of integer number between two values.
 * 
 * @param int $min minimal value
 * @param int $max maximum value
 * 
 * @return int pseudo-generated decimal value (e.g. 17)
 */
function rand_integer($min, $max)
{
    return rand($min, $max);
}


/**
 * Line.
 * 
 * Draw the line.
 * 
 * @return null
 */
function line()
{
    echo '<hr>';
}
