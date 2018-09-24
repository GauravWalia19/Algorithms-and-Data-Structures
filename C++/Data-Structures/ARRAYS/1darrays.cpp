/*
 *  1 Dimensional Array
 */
#include <iostream>
using namespace std;
int main()
{
    int n; //size of the array
    cout << "Enter the size of the array" << endl;
    cin >> n;
    int arr[n]; //decalared 1d array of size n
    cout << "Enter the elements of the array" << endl;
    for(int i=0;i<n;i++)
    {
        cin >> arr[i];
    }
    cout << "Entered array:" <<endl;
    for(int i=0;i<n;i++)
    {
        if(i==n-1)
        {
            cout << arr[i] << endl;    
        }
        else
        {
            cout << arr[i]<<" ";
        }
    }
}