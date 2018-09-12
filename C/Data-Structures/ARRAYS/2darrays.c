//2 DIMENSIONAL ARRAY
#include <stdio.h>
int main()
{
    int R,C;
    printf("Enter the number of rows and cols of 2d array\n");
    scanf("%d %d",&R,&C);
    int arr[R][C];
    printf("Enter the elements of 2d array\n");
    for(register int i=0;i<R;i++)
    {
        for(register int j=0;j<C;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Entered elements of 2d array\n");
    for(register int i=0;i<R;i++)
    {
        for(register int j=0;j<C;j++)
        {
            if(j!=C-1)
            {
                printf("%d ",arr[i][j]);
            }
            else
            {
                printf("%d\n",arr[i][j]);
            } 
        }
    }
}