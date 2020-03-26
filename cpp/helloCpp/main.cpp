#include <iostream> //для организации ввода-вывода
#include <string> // для работой со строками
// #include <Windows.h>
#include <locale.h> //для кодировки

using namespace std;

int main() 
{
	//SetConsoleCP(1251);
	//SetConsoleOutputCP(1251);

	setlocale(0,"");

	cout << "введите строку:";
	string val1;
	getline(std::cin, val1);

	cout << "вы ввели строку: \"" + val1 + "\"\n\n";
	
	system("pause");
}

