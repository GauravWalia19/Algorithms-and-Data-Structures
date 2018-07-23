#include <iostream>
#include <string>
using namespace std;
template <class t>
class Stack
{
    int tp;
    t *arr;
    int s;

    public:
    Stack()
    {
        tp=-1;
        s = 5;
        arr = new t[s];
    }
    Stack(int size)
    {
        tp=-1;
        s = size;
        arr = new t[s];
    }
    ~Stack()
    {
        delete arr;
    }
    void push(t num)
    {
        //check if stack is full or not
        if(tp == s-1)
        {
            cout << "STACK OVERFLOW" << endl;
        }
        else
        {
            tp++;
            arr[tp] = num;
        }
    }
    void pop()
    {
        //check if stack is empty or not
        if(tp == -1)
        {
            cout << "STACK UNDERFLOW" << endl;
        }
        else
        {
            tp--;
        }
    }
    t top()
    {
        //cout << arr[tp];
        return arr[tp];
    }
    int size()
    {
        return tp+1;
    }
    void print()
    {
        for(int i=tp;i>=0;i--)
        {
            cout << arr[i] << endl; 
        }
    }
    bool empty()
    {
        if(tp==-1)
        {
            return true;
        }
        return false;
    }
    template <class T>
    void copy(Stack<T> copy)
    {
        copy.tp = tp;
        copy.s = s;
        for(int i=tp;i>=0;i--)
        {
            copy.arr[i] = arr[i];
        }
    }
};