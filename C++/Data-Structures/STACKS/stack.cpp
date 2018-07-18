#include <iostream>
#include <stack>
#include <algorithm>
using namespace std;
int main()
{
    stack<int> s;
    s.emplace(1); //push element to the top of the stack
    s.push(2); //push elemen to the top of the stack
    s.push(3);
    s.pop(); //pop element of the top
    stack<int> s1;
    s1 = s; //copy constructor
    s.swap(s1); //swap elements of the stack
    //print elements of the stack s1
    while(!s1.empty())
    {
        cout << s1.top();
        s1.pop();
    }
}