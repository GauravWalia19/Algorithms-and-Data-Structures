/* FIBONACCI SERIES
 * 
 * 0 1 1 2 3 5 8 13 .....
 * 
 */

#include <stdio.h>
void fibonacci(int M) 
{
    unsigned long long a=0,b=1,i,c;
    if(M==1)
    {
        printf("Fibonacci series is:\n%lld",a);
    }
    else
    {
        printf("Fibonacci series is:\n%llu %llu ",a,b);
        //for loop to find all fibonnaci number
        for (i=0;i<M-2;i++) 
        {
            c=a+b;//fibonacci series is addition of previous two numbers
            a=b;
            b=c;
            printf("%llu ",c);
        }
    }
    printf("\n");
}

int main()
{
    int N;
    printf("Enter the no of terms: ");
    scanf("%d",&N);
    fibonacci(N); //function call
    return 0;
}