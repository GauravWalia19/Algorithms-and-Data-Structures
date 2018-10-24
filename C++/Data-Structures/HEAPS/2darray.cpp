/*
 *  2 D ARRAYS IN HEAPS
 */

#include <iostream>
using namespace std;
int main()
{
    int rows;
    int cols;
    cout << "Enter the rows and cols of the 2d array" << endl;
    cin >> rows;
    cin >> cols;
    int **arr;
    arr = new int*[rows]; // declared array
    for(int i=0;i<rows;i++)
    {
        arr[i] = new int[cols];
    }

    cout << "Enter the values of 2d array" << endl;
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            cin >> arr[i][j];
        }
    }

    cout << "Entered 2d array" << endl;
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
    for(int i=0;i<rows;i++)
    {
        delete [] arr[i];
    }
    delete [] arr;
}