#include <iostream>
#include <vector>
using namespace std;
int main()
{
    vector<int> vect;
    vect.push_back(1);
    vect.push_back(2);
    vect.push_back(3);
    vect.push_back(4);
    vect.pop_back();
    cout <<"EMPTY OR NOT: "<< vect.empty() <<endl;

    cout << "VECTOR ELEMENTS"<<endl;
    for(int i=0;i<vect.size();i++)
    {
        cout << vect[i] <<" -> ";
    } 
    cout << endl;
}