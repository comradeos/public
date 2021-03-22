<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>jquery</title>
        <script type="text/javascript" src="./lib/jquery_3_6_0.js"></script>
    </head>
    <body>
        <div>this is from html</div>
        <div id="test"></div>

        <script type="text/javascript">
            $(document).ready(function(){$("#test").html("<b>and this is from jquery</b>");});
        </script>

    </body>
</html>
