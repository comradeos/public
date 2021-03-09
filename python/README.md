/* python notes */


** OPEN SERVER + PYTHON

> 1. переходим в C:\open server\userdata\config

> 2. открываем Apache-2.4_server.conf _!версии могут отличаться, лучше сверить с настройками open server

> 3. ищем строку "AddHandler      cgi-script              .cgi    .pl"

> 4. дописываем ".py", должно получится "AddHandler      cgi-script              .cgi    .pl    .py" 

> 5. перезапускаем сервер

>6. пример файла: [webPython.py](https://github.com/comradeos/public/blob/master/py/webPython/webPython.py)
