/*
 *  DYNAMIC 2D ARRAY
*/
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int rows;
    printf("Enter the rows of the array\n");
    scanf("%d",&rows);
    int cols;
    printf("Enter the cols of the array\n");
    scanf("%d",&cols);
    int **arr = (int**)malloc(sizeof(int *)*rows);
    for(register int i=0;i<rows;i++)
    {
        arr[i] = (int*)malloc(sizeof(int)*cols);
    }
    printf("Enter the elements in the array\n");
    //entered array
    for(register int i=0;i<rows;i++)
    {
        for(register int j=0;j<cols;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Entered array\n");
    for(register int i=0;i<rows;i++)
    {
        for(register int j=0;j<cols;j++)
        {
            if(j==cols-1)
            {
                printf("%d\n",arr[i][j]);
            }
            else
            {
                printf("%d ",arr[i][j]);
            }
        }
    }

    for(register int i=0;i<rows;i++)
    {
        free(arr[i]);
    }
    free(arr);
}