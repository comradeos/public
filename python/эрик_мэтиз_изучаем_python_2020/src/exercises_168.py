import exercises_168_add
print(exercises_168_add.multi_plus(1, 2, 3))

from exercises_168_add import multi_plus
print(multi_plus(11, 22, 33, 44, 55))

from exercises_168_add import multi_plus as mp
print(mp(123, 234, 345, 456))

import exercises_168_add as add
print(add.multi_plus(6, 7, 8, 4, 6, 4, 3, 4, 6, 3, 2, 3, 1, 9))

from exercises_168_add import *

show_info('superu', 'supass', 'ivan', 'durak', 20)
