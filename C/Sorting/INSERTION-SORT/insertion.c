//INSERTION SORT
//STABLE SORT
//FROM LEFT
//ASCENDING
#include <stdio.h>
void insertionsort(int arr[],int n)
{
    for(register int i=1;i<n;i++)
    {
        int sample = arr[i];
        register int j;
        for(j=i;j>0 && arr[j-1]>sample;j--)
        {
            arr[j] = arr[j-1];
        }
        arr[j] = sample;
    }
}
int main()
{
    printf("Enter the size of the array\n");
    int n;
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements of the array\n");
    for(register int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    insertionsort(arr,n);
    printf("THE SORTED ARRAY:\n");
    for(register int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
}