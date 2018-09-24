/*
 *  4 DIMENSIONAL ARRAY
 */
#include <iostream>
using namespace std;
int main()
{
    /*
     * FOR 4D ARRAYS IAMGINE A 3D CUBE SOLVED IN TIME TAKEN AS FOURTH DIMENSIONAL
     */
    int length; //LENGTH OF THE CUBE
    int breadth; //BREADTH OF THE CUBE
    int height; //HEIGHT OF THE CUBE
    int tym;  //HOW MANY CUBE IS ACCESSED
    cout << "Enter the time YOU WANT TO access the cube"<<endl;
    cin >> tym;
    cout << "Enter the length,breadth and height of the cube"<<endl;
    cin >> length >> breadth >> height;

    int arr[tym][height][length][breadth]; //declared 4d array
    cout << "Enter the elements of the 4d array" << endl;

    for(int i=0;i<tym;i++)          //extra loop for time
    {
        cout << "VALUE CHANGED " << i <<" time"<< endl;    // | E
        for(int j=0;j<height;j++)                   // |  N   
        {                                           // |   T  
            for(int k=0;k<length;k++)               // |    E
            {                                       // |     R
                for(int l=0;l<breadth;l++)          // |      I
                {                                   // |       N
                    cin >> arr[i][j][k][l];         // |        G
                }                                   // |         
            }                                       // |         3 D
        }                                           // |            ARRAY

    }
    cout << endl;
    cout << "ENTERED 4D ARRAY" << endl;
    for(int i=0;i<tym;i++)
    {
        cout << "ACCESSED " << i << " th time" << endl;
        for(int j=0;j<height;j++)
        {
            for(int k=0;k<length;k++)
            {
                for(int l=0;l<breadth;l++)
                {
                    if(l==breadth-1)
                    {
                        cout << arr[i][j][k][l] << endl;
                    }
                    else
                    {
                        cout << arr[i][j][k][l] << " ";
                    }
                }
            }
            cout << "---------" <<endl;
        }
        cout << "========="<<endl;
    }
}