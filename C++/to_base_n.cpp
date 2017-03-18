#include <iostream>
using namespace std;

void base_to_n(int base, int n);

int main(void)
{
    int x, y;
    cout << "Please enter base number and system number below (Use space to separate them):\n";
    cin >> x >> y;
    base_to_n(x, y);
}

void base_to_n(int base, int n)
{
    int temp;
    if(n >= 36)
    {
        cout << "The system number is too large!!!";
        return;
    }
    temp = base % n;
    if(base >= n)
    {
        base = base / n;
        base_to_n(base, n);
    }
    if(temp < 10)
        cout << temp;
    else
        cout << (char)(55 + temp);
}
