/*
 *  2 DIMENSIONAL ARRAYS  
 */

#include <iostream>
using namespace std;
int main()
{
    int rows;
    int cols;
    cout << "Enter rows and cols of 2d array"<<endl;
    cin >> rows >> cols;   
    int arr[rows][cols];
    cout << "Enter the elements of the array"<<endl;
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            cin >> arr[i][j];
        }
    }
    cout << "Entered elements of 2d array"<<endl;
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            if(j==cols-1)
            {
                cout << arr[i][j] << endl;
            }
            else
            {
                cout << arr[i][j] << " ";
            }
        }
    }
}