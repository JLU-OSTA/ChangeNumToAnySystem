#include <stdio.h>

int to_base_n(int base, int n);

int main(void)
{
    int f=0;
    double x,y;
    printf("Please enter base number and system number below (Use space to separate them):\n");
    do
    {
        f=1;
        scanf("\n%lf %lf", &x, &y);
        if(x<0||y<=0||floor(x)!=x||floor(y)!=y||y>=36)
            f=0;
        if(f==0)
            printf("You have input the wrong number, please try again:\n");
    }
    while(f==0);
    printf("The result is:\n");
    to_base_n((int)x, (int)y);
    while((getch()) == 'a');
}

int to_base_n(int base, int n)
{
    int temp;
    temp = base % n;
    if(base >= n)
    {
        base = base / n;
        to_base_n(base, n);
    }
    if(temp < 10)
        putchar('0' + temp);
    else
        putchar('7' + temp);
    return;
}

