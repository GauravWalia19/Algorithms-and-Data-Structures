/*
 *  DYNAMIC 3D ARRAY
 */
#include <iostream>
using namespace std;
int main()
{
    cout << "Enter the rows cols and height of the 3d array" << endl;
    int rows;
    int cols;
    int height;
    cin >> rows >> cols >> height;
    int ***arr;
    arr = new int**[height];
    for(int i=0;i<rows;i++)
    {
        arr[i] = new int*[rows];
        for(int j=0;j<cols;j++)
        {
            arr[i][j] = new int[cols];
        }
    }

    cout << "Enter the element of the array" << endl;
    for(int i=0;i<height;i++)
    {
        for(int j=0;j<rows;j++)
        {
            for(int k=0;k<cols;k++)
            {
                cin >> arr[i][j][k];
            }
        }
    }

    cout << "Entered elements of the array" << endl;
    for(int i=0;i<height;i++)
    {
        for(int j=0;j<rows;j++)
        {
            for(int k=0;k<cols;k++)
            {
                cout << arr[i][j][k] << " ";
            }
            cout << endl;
        }
        cout << "----------"<<endl;
    }

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            delete [] arr[i][j];
        }
        delete [] arr[i];
    }
    delete [] arr;
}