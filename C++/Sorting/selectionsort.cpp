#include <iostream>
using namespace std;
void SelectionSort(int*,int);
int main()
{
	int n,i;
	cout << "Enter the number of data element to be sorted: ";
	cin >> n;
	int arr[n];
	cout << "Enter the elements of the array" << endl;
	for(i = 0; i < n; i++)
	{
		cin>>arr[i];
	}
	/*
	//selection sort
	
	*/
	SelectionSort(arr,n);
	// Display the sorted data.
	cout<<"\nSorted Data ";
	for (i = 0; i < n; i++)
		cout << arr[i] << " ";
	cout << endl;
	return 0;
}
void SelectionSort(int array[],int s)
{
	int max; //maximum index
	for(int i=s-1;i>0;i--)
	{
		max=0;
		//finding max element index
		for(int j=0;j<=i;j++)
		{
			if(array[max]<array[j])
			{
				max = j;
			}
		}
		//swapp
		int temp = array[i];
		array[i] = array[max];
		array[max] = temp;
	}
}