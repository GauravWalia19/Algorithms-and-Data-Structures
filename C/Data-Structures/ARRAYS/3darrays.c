/* 3D ARRAYS
*/
#include <stdio.h>
int main()
{
    int R,C,H;
    printf("Enter the rows,cols and height of the array\n");
    scanf("%d %d %d",&R,&C,&H);
    int arr[R][C][H];
    for(register int i=0;i<R;i++)
    {
        for(register int j=0;j<C;j++)
        {
            for(register int k=0;k<H;k++)
            {
                scanf("%d",&arr[i][j][k]);
            }
        }
    }
    printf("Entered elments of the array\n");
    for(register int i=0;i<R;i++)
    {
        printf("----\n");
        for(register int j=0;j<C;j++)
        {
            for(register int k=0;k<H;k++)
            {
                printf("%d ",arr[i][j][k]);
            }
            printf("\n");
        }
    }
}