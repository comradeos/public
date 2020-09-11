#include <stdio.h>
#include <cs50.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    char *locale = setlocale(0, "");
    string str1 = "Привет Мир!";
    printf(str1);
    system("pause");
    return 0;
}
