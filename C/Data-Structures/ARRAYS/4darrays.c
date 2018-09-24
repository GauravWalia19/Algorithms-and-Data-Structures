/*
 *  4D ARRAYS
 */
#include <stdio.h>
int main()
{
    /*
     * FOR 4D ARRAYS IAMGINE A 3D CUBE SOLVED IN TIME TAKEN AS FOURTH DIMENSIONAL
     */
    int length; //LENGTH OF THE CUBE
    int breadth; //BREADTH OF THE CUBE
    int height; //HEIGHT OF THE CUBE
    int tym;  //HOW MANY CUBE IS ACCESSED
    printf("Enter the time YOU WANT TO access the cube\n");
    scanf("%d",&tym);

    printf("Enter the length,breadth and height of the cube\n");
    scanf("%d %d %d",&length,&breadth,&height);
    int arr[tym][height][length][breadth]; //declared 4d array
    printf("Enter the elements of the 4d array\n");

    for(register int i=0;i<tym;i++)          //extra loop for time
    {
        printf("VALUE CHANGED %d time\n",i);        // | E
        for(register int j=0;j<height;j++)          // |  N   
        {                                           // |   T  
            for(register int k=0;k<length;k++)      // |    E
            {                                       // |     R
                for(register int l=0;l<breadth;l++) // |      I
                {                                   // |       N
                    scanf("%d",&arr[i][j][k][l]);   // |        G
                }                                   // |         
            }                                       // |         3 D
        }                                           // |            ARRAY

    }
    printf("\n");
    printf("ENTERED 4D ARRAY\n");
    for(register int i=0;i<tym;i++)
    {
        printf("ACCESSED %d th time\n",i);
        for(register int j=0;j<height;j++)
        {
            for(register int k=0;k<length;k++)
            {
                for(register int l=0;l<breadth;l++)
                {
                    if(l==breadth-1)
                    {
                        printf("%d\n",arr[i][j][k][l]);
                    }
                    else
                    {
                        printf("%d ",arr[i][j][k][l]);
                    }
                }
            }
            printf("---------\n");
        }
        printf("=========\n");
    }
}