#include <iostream>
#include <string>
using namespace std;
int main()
{
    string str;
    cout << "Enter any string"<<endl;
    getline(cin,str);
    cout << "Entered String: " << str << endl;
    
    if(str=="hello world")
    {
        cout << "It is equal to hello world" << endl;
    }
    else
    {
        cout << "It is not equal to hello world" << endl;
    }

    cout << "String length: "<<str.length() << endl;
    cout << "String with append: " << str.append("hello") << endl;

    str.push_back('a');
    cout << str << endl;
    str.pop_back();
    cout << str << endl;

    cout << "CAPACITY: " << str.capacity() << endl;

    string str1="anonymous";
    cout << "str: " << str << endl;
    cout << "str1: "<< str1 << endl<<endl;

    str.swap(str1);
    cout << "After swapping function" << endl;
    cout << "str: " << str << endl;
    cout << "str1: "<<str1 << endl; 
}