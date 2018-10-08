/*
 *  DYNAMIC 3D ARRAYS IN HEAP
*/
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int height;
    int rows;
    int cols;
    printf("Enter the height,rows and cols of the array\n");
    scanf("%d %d %d",&height,&rows,&cols);
    
    int ***arr = (int***)malloc(sizeof(int **)*height);
    for(register int i=0;i<height;i++)
    {
        arr[i]=(int **)malloc(sizeof(int *)*rows);
        for(register int j=0;j<rows;j++)
        {
            arr[i][j]=(int *)malloc(sizeof(int)*cols);
        }
    }
    printf("Enter the elements of the array\n");
    for(register int i=0;i<height;i++)
    {
        for(register int j=0;j<rows;j++)
        {
            for(register int k=0;k<cols;k++)
            {
                scanf("%d",&arr[i][j][k]);
            }
        }
    }
    printf("Entered array\n");
    for(register int i=0;i<height;i++)
    {
        for(register int j=0;j<rows;j++)
        {
            for(register int k=0;k<cols;k++)
            {
                printf("%d",arr[i][j][k]);
            }
            printf("\n");
        }
        printf("------\n");
    }

    for(register int i=0;i<height;i++)
    {
        free(arr[i]);
        for(register int j=0;j<rows;j++)
        {
            free(arr[i]);
        }
    }
    free(arr);
}