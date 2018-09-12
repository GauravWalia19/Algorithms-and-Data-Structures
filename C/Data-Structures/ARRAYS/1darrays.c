//I DIMENSIONAL ARRAYS
#include <stdio.h>
int main()
{
    int N;
    printf("Enter the size of the arrays\n");
    scanf("%d",&N);
    int arr[N]; //declared 1d array
    for(register int i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Entered array by the user\n");
    for(register int i=0;i<N;i++)
    {
        printf("%d\n",arr[i]);
    }
}