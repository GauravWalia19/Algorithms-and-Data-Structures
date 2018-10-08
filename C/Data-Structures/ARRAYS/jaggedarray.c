/*
 *  JAGGED ARRAYS
 *  # # # # #
 *  # # #
 *  # # # #
 *  # #
 *  # # # # #
 */
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int rows; //rows of jagged arrays
    printf("Enter the rows of the jagged array\n");
    scanf("%d",&rows);

    int **arr=(int **)malloc(sizeof(int *)*rows);
    int jagged_cols[rows]; //eg 5,3,4,2,5
    printf("Enter the variable cols\n");
    for(register int i=0;i<rows;i++)
    {
        scanf("%d",&jagged_cols[i]);
    }
    for(register int i=0;i<rows;i++)
    {
        arr[i] = (int *)malloc(sizeof(int)*jagged_cols[i]);
    }
    printf("Enter the elements of jagged array\n");
    for(register int i=0;i<rows;i++)
    {
        for(register int j=0;j<jagged_cols[i];j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }

    printf("Entered element of the jagged array\n");
    for(register int i=0;i<rows;i++)
    {
        for(register int j=0;j<jagged_cols[i];j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }

    //freeing heap memory
    for(register int i=0;i<rows;i++)
    {
        free(arr[i]);
    }
    free(arr);
}