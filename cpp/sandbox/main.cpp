#include <iostream>
#include <string>
#include <Windows.h>
#include <locale.h>

//using namespace std;

void test() {

    std::cout << "test\n";
    // cout << "размер";
    // int size;
    // cin >> size;
    //system("pause");

}

void num_sequence(int a) {

    int result_col = 1;
    int result_row = 0;
    int first_step = 3;
    int second_step = 2;

    std::cout << result_col << " ";
    std::cout << "\n";

    for (int i = 1; i < a; i++) {

        result_col = result_col + first_step;
        std::cout << result_col << " ";
        result_row = result_col;

        for (int j = 1; j < i + 1; j++) {

            result_row = result_row + 2;
            std::cout << result_row << " ";

        }

        std::cout << "\n";
        first_step = first_step + second_step;
        second_step++;
    }
}

int main() {

    SetConsoleCP(1251);
    SetConsoleOutputCP(1251);
    setlocale(0, "");

    std::cout << "песочница c++\n";
    // test();

    num_sequence(7);

}

