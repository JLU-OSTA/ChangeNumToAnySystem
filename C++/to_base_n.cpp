#include <iostream>
#include <math.h>
using namespace std;

void base_to_n(int base, int n);

int main(void)
{
    int f=0;
    double x,y;
    cout << "Please enter base number and system number below (Use space to separate them):\n";
    do
    {
        f=1;
        cin >> x >> y;
        if(x<0||y<=0||floor(x)!=x||floor(y)!=y||y>=36)
            f=0;
        if(f==0)
            cout << "You have input the wrong number, please try again:\n";
    }
    while(f==0);
    base_to_n((int)x, (int)y);
}

void base_to_n(int base, int n)
{
    int temp;
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
