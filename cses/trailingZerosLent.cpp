#include <iostream>
using namespace std;

int main() {

    int n;
    cin >> n;

    long long factorial = 1LL;
    for (int i = 1; i<=n; i++) {
        factorial *= i;
    }

    int count = 0;
    while (factorial%10 == 0) {
        count++;
        factorial /= 10;
    }

    cout << count << endl;

    return 0;
}