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

void NumsSeq(int a) {

    int resultCol = 1;
    int resultRow = 0;
    int firstStep = 3;
    int secondStep = 2;

    std::cout << resultCol << " ";
    std::cout << "\n";

    for (int i = 0; i < a; i++) {

        resultCol = resultCol + firstStep;
        std::cout << resultCol;
        resultRow = resultCol;

        for (int j = 0; j < i + 1; j++) {

            resultRow = resultRow + 2;
            std::cout << resultRow << " ";

        }

        std::cout << "\n";
        firstStep = firstStep + secondStep;
        secondStep++;
    }
}

int main() {

    SetConsoleCP(1251);
    SetConsoleOutputCP(1251);
    setlocale(0, "");

    std::cout << "песочница c++\n";
    // test();

    NumsSeq(10);

}

