//dynamic array
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int arr_size=2;
    int *arr = (int *)malloc(sizeof(int)*arr_size); //intially array size 1

    //entering elements
    int n; //for entering number
    int i=0; //for insertion and element count
    while(1)
    {
        printf("ENTER ELEMENT or quit by -1: ");
        scanf("%d",&n);
        if(n==-1)
        {
            break;
        }
        if(i<arr_size)
        {
            arr[i]=n;
            i++;
            
        }
        else
        {
            //no space present to insert in an array
            int temp_size=arr_size;
            int temp_array[temp_size];

            //copy elements of arr to temp array
            for(register int j=0;j<arr_size;j++)
            {
                temp_array[j] = arr[j];
            }
        
            //increse size of array
            arr_size=arr_size*2;
            arr = (int *)malloc(sizeof(int)*arr_size);
            
            //copy temp_array to arr
            int k=0;
            for(k=0;k<temp_size;k++)
            {
                arr[k] = temp_array[k];
            }
            i=k;
            arr[i]=n; //insert new element entered
            i++;
        }
    }

    //prnting array
    printf("ENTERED ARRAY of size %d\n",i);
    for(register int j=0;j<i;j++)
    {
        printf("%d ",arr[j]);
    }
    printf("\n");
}