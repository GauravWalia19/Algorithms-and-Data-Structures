#include "Stack.hpp"
using namespace std;

int main()
{
    Stack<int> s;
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.pop();
    s.pop();
    //s.size();
    //s.print();
    // cout << s.empty();
    // Stack<string> str;
    // str.push("hello");
    // str.push("world");
    // str.print();
    Stack<int> s1;
    s.copy(s1);
    s1.print();
    //cout << s1.size();
    return 0;
}