#include <iostream>
#include <string>
#include <Windows.h>
#include <locale.h>

using namespace std;

int main() {

	SetConsoleCP(1251);
	SetConsoleOutputCP(1251);
	setlocale(0, "");

    cout << "Введите размер ромба: ";

    int size;

    cin >> size;

    cout << "\n";

    for (int i = size; i >= 1; i--) {
        for (int j = 0; j <= size; j++) {
            if (j >= i) {
                cout << "* ";
            }
            else {
                cout << " ";
            }
        }
        cout << "\n";
    }

    for (int i = 0; i <= size; i++) {
        for (int j = 0; j <= size; j++) {
            if (j >= i) {
                cout << "* ";
            }
            else {
                cout << " ";
            }
        }
        cout << "\n";
    }

    cout << "\n";
	system("pause");
}

