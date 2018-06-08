#include <iostream>
#include <vector>
using namespace std;

//THIS FUNCTION PRINTS THE ARRAY OF INDEXES FOUND
template <class t>
void lsearch(vector<t> array,t f)
{
    vector<t> ans;
    int flag=0;
    register int i=0;
    
    for(i=0;i<array.size();i++)
    {
        if(f == array[i])
        {
            ans.push_back(i);
        }
        else
        {
            flag++;
        }
    }
    if(flag==array.size())
    {
        cout << "ELEMENT NOT FOUND" << endl;
    }
    else
    {
        cout << "INDEX ARRAY: ";
        for(i=0;i<ans.size();i++)
        {
            cout << ans[i] << " ";
        }
        cout << endl;
    }
}

int main()
{
    int n; //size of the array
    register int i=0;

    //for int array
    cout << "Enter the number of elements you want to enter the int array" << endl;
    cin >> n;
    int find; //element to find
    int num; //sample element to enter
    vector<int> arr; //declared a int vector
    for(i=0;i<n;i++)
    {
        cin >> num;
        arr.push_back(num);
    }
    cout << "Enter the element to find in int array" << endl;
    cin >> find;
    lsearch(arr,find);

    cout << "Enter the number of elements you want to enter the float array" << endl;
    cin >> n;
    float ffind;
    float sample;
    vector<float> ary;
    for(i=0;i<n;i++)
    {
        cin >> sample;
        ary.push_back(sample);
    }
    cout << "Enter the element to find in float array" << endl;
    cin >> ffind;
    lsearch(ary,ffind);
}