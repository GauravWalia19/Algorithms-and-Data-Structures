/* FIBONACCI SERIES
 * 
 * 0 1 1 2 3 5 8 13 .....
 * VALID UPTO 93 terms
 */

#include <stdio.h>

int fibonacci(int M) 
{
    long long a=0,b=1,i,c;
    printf("Fibonacci series is:\n%lld\n%lld",a,b);
    //for loop to find all fibonnaci number
    for (i=0;i<M-2;i++) 
    {
        c=a+b;//fibonacci series is addition of previous two numbers
        a=b;
        b=c;
        printf("%lld ",c);
    }
    printf("\n");
    return 0;
}

int main() {
    int N;
    printf("Enter the no of terms: ");
    scanf("%d",&N);
    fibonacci(N); //function call
    return 0;
}