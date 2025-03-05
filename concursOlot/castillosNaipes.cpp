#include <iostream>
using namespace std;

void casoDePrueba() {

   int n;
   cin >> n;
   long cartes = 0;
   for (int i = n; i > 0; i--) {
      cartes += i*3-1;
   }
   cout << cartes << endl;

}


int main() {

  unsigned int numCasos;

  cin >> numCasos;
  for (unsigned int i = 0; i < numCasos; ++i) {
    casoDePrueba();
  }

  return 0;

}
