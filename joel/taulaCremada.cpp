#include <iostream>
using namespace std;

int main() {

    int n = 1;
    bool table[10][10];

    for (int i = 0; i<10; i++) {
        for (int j = 0; j<10; j++) {
            table[i][j] = false;
        }
    }

    while (n != 0) {

        for (int i = 9; i>=0; i--) {
            for (int j = 0; j<10; j++) {
                if (table[i][j]) cout << "X ";
                else cout << "O ";
            }
            cout << endl;
        }
        cin >> n;

        for (int i = 0; i<n; i++) {
            int x;
            cin >> x;
            int y;
            cin >> y;

            table[x][y] = true;

        }

        

    }

    return 0;
}