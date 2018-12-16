#include <iostream>
#include "Tstack.hpp"
using namespace std;
int main()
{
    Tstack s;
    s.push1(1);
    s.push1(2);
    s.push1(3);
    s.push2(4);
    s.push2(5);
    s.push2(6);
    s.push2(7);
    cout << s.tp1() << endl;
    cout << s.tp2() << endl;
    s.push2(8);
    //s.pop1();
    //s.pop2();
    s.print();
    //s.print1();
    //s.print2();
}