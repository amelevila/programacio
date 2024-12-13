#include <iostream>
using namespace std;

int main() {

    string text;
    cin >> text;

    int result = 0;
    for (size_t i = 0; i<text.size(); i++) {
        if (text[i] != 'G') {
            for (size_t j = (text.size()-1); j>i; j--) {
                if (text[j]=='G') {
                    swap(text[i], text[j]);
                    result++;
                    break;
                }
            }
        }

        if (text[i] == 'P') {
            for (size_t j = (text.size()-1); j>i; j--) {
                if (text[j]=='M') {
                    swap(text[i], text[j]);
                    result++;
                    break;
                }
            }
        } 
    }

    cout << result << endl << text << endl;

    return 0;
}