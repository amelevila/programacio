#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {

    int n;
    cin >> n;
    vector<int> a(n), b(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i] >> b[i];
    }
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    int now = 0;
    int result = 0;

    int j = 0;
    int k = 0;
    while (k<n && j<n) {
        if (a[j] < b[k]) {
            j++;
            now++;
        }
        else if (b[k] < a[j]) {
            k++;
            now--;
        }

        if (now>result) result = now;
    }
    cout << result << endl;

    return 0;
}