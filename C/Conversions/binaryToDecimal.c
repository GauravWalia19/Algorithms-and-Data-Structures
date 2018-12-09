/**
 * RUNNING TESTCASES
 * 11111                ->  31
 * 10011                ->  19
 * 1111111111111111111  ->  524287
 * valid upto 19 digits
*/
#include <stdio.h>
#include <math.h>
int binaryToDecimal(long long n)
{
    int result = 0;
    int i = 0;
    while(1)
    {
        if (n == 0)
        {
            break;
        }
        int rem = (int)(n % 10);
        if (rem != 0 && rem != 1)
        {
            return -1;
        }
        n = n / 10;
        result = result + (int)pow(2, i) * rem;
        i++;
    }
    return result;
}
int main()
{
    printf("Enter the binary number\n");
    long long num;
    scanf("%lld", &num);
    int result = binaryToDecimal(num);
    printf("RESULT: %d\n", result);
}