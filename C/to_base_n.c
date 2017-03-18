#include <stdio.h>

int to_base_n(int base, int n);

int main(void)
{
    int x, y;
    printf("Please enter base number and system number below (Use space to separate them):\n");
    scanf("%d %d", &x, &y);
    printf("The result is:\n");
    to_base_n(x, y);
    while((getch()) == 'a');
}

int to_base_n(int base, int n)
{
    int temp;
    if(n >= 36)
    {
        printf("The system number is too large!!!");
        return;
    }
    temp = base % n;
    if(base >= n)
    {
        base = base / n;
        to_base_n(base, n);
    }
    if(n <= 10)
        putchar('0' + temp);
    else if(temp <= 10)
        putchar('0' + temp);
    else
        putchar('7' + temp);
    return;
}

