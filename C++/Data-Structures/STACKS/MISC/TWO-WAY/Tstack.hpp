#include <iostream>
using namespace std;
class Tstack
{
    int arr[7];
    int top1;
    int top2;

    public:
    Tstack()
    {
        top1=-1;
        top2=7;
        for(int i=0;i<7;i++)
        {
            arr[i]=0;
        }
    }
    void push1(int num)
    {
        top1++;
        if(top1==top2)
        {
            cout << "STACK1 OVERFLOW" << endl;
        }
        else if(top1<top2)
        {
            arr[top1] = num;
        }
    }
    void push2(int num)
    {
        top2--;
        if(top2>top1)
        {
            arr[top2] = num;
        }
        else if(top2 == top1)
        {
            cout << "STACK2 OVERFLOW";
        }
    }
    void pop1()
    {
        if(top1==-1)
        {
            cout << "STACK 1 UNDERFLOW" << endl;
        }
        else 
        {
            top1--;
        }
    }
    void pop2()
    {
        if(top2==7)
        {
            cout << "STACK 2 UNDERFLOW" << endl;
        }
        else 
        {
            top2++;
        }
    }
    void print1()
    {
        for(int i=0;i<=top1;i++)
        {
            cout << arr[i];
        }
        // cout << endl;
        // cout <<"top1:"<< top1<<endl;
    }
    void print2()
    {
        for(int i=top2;i<7;i++)
        {
            cout << arr[i];
        }
    }
    void print()
    {
        for(int i=0;i<7;i++)
        {
            cout<<arr[i];
        }
    }
    int tp1()
    {
        return top1;
    }
    int tp2()
    {
        return top2;
    }
    //extra functions
    void push_stack1(int n)
    {
        push1(n);
    }
    void push_stack2(int n)
    {
        push2(n);
    }
    void pop_stack1()
    {
        pop1();
    }
    void pop_stack2()
    {
        pop2();
    }
};