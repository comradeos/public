/* python notes */


** OPEN SERVER + PYTHON

> 1. переходим в C:\open server\userdata\config

> 2. открываем Apache-2.4_server.conf _!версии могут отличаться, лучше сверить с настройками open server

> 3. ищем строку "AddHandler      cgi-script              .cgi    .pl"

> 4. дописываем ".py", должно получится "AddHandler      cgi-script              .cgi    .pl    .py" 

> 5. перезапускаем сервер

>6. пример файла: 

<pre>
---------------------
#!C:\Users\User\AppData\Local\Programs\Python\Python38-32\python.exe

print ("Content-Type: text/html\r\n")
print ("<html><head><title>тестим веб-питон</title></head><body>")
print ("<h1>тестим веб-питон</h1>")
print ("<p>параграф</p><h1>- * -</h1>")
print ("</body></html>")

---------------------
</pre>
