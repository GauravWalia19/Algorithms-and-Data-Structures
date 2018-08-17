//INSERTION SORT
//FROM LEFT
//DESCENDING
#include <stdio.h>
void insertion(int arr[],int n)
{
    for(register int i=1;i<n;i++)
    {
        int insert = arr[i];
        register int j;
        for(j=i;j>0 && arr[j-1]<insert;j--)
        {
            arr[j]=arr[j-1];
        }
        arr[j]=insert;
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
    insertion(arr,n);
    printf("SORTED ARRAY\n");
    for(register int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
}