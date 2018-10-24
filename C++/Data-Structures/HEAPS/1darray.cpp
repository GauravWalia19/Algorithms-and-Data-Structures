/*
 *  DYNAMIC 1D ARRAY
 */
#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter the size of the array" << endl;
    cin >> n;
    int *arr;
    arr = new int[n]; //declared dynamic arrays in heap
    cout << "Enter the elements of the array" << endl;
    for(int i=0;i<n;i++)
    {
        cin >> arr[i];
    }       
    cout << "Entered the elements of the array" << endl;
    for(int i=0;i<n;i++)
    {
        cout << arr[i] <<" ";
    }
    cout << endl;
}