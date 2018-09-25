#include <iostream>
#include <array>
using namespace std;

int main(){
    array<int, 5> numbers = {8, 5, 3, 11, 1};
    int bubbleIndex = numbers.max_size() - 1;
    for(int j = 0; j < numbers.max_size(); j++) {
        for(int i = 0; i < bubbleIndex; i++) {
            if (numbers[i] > numbers[i+1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
        bubbleIndex--;
    }
    cout << numbers[1] << endl;
}