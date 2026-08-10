#include <iostream>

int add(int a, int b);
int multiply(int a, int b);

int main() {
    const int first = 4;
    const int second = 7;

    std::cout << "First number: " << first << '\n';
    std::cout << "Second number: " << second << '\n';
    std::cout << "Sum: " << add(first, second) << '\n';
    std::cout << "Product: " << multiply(first, second) << '\n';

    return 0;
}
