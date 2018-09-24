/*
 *  3 DIMENSIONAL ARRAYS
 */
#include <iostream>
using namespace std;
int main()
{
    int length;
    int breadth;
    int height;
    cout << "Enter length,breadth and height of the 3d array"<<endl;
    
    cin >> length >> breadth >> height;

    //declaring 3d array
    int arr[height][length][breadth];
    
    cout << "Enter the elements of 3d arrays" << endl;
    for(int i=0;i<height;i++)
    {
        cout << "For height "<< i<<endl;
        cout << "Enter 2d array"<<endl;
        for(int j=0;j<length;j++)
        {
            for(int k=0;k<breadth;k++)
            {   
                cin >> arr[i][j][k];
            }
        }
    }
    
    cout << "Entered 3d array" << endl;
    for(int i=0;i<height;i++)
    {
        for(int j=0;j<length;j++)
        {
            for(int k=0;k<breadth;k++)
            {   
                if(k==breadth-1)
                {
                    cout << arr[i][j][k] <<endl;
                }
                else
                {
                    cout << arr[i][j][k] <<" ";
                }
            }
        }
        cout << "==========="<<endl;
    }
}