#include <iostream>
using namespace std;
class Stack
{
    int tp;
    int arr[5];

    public:
    Stack()
    {
        tp=-1;
    }
    ~Stack()
    {
        
    }
    void push(int num)
    {
        //check if stack is full or not
        if(tp == 4)
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
    void top()
    {
        cout << arr[tp];
    }
    void size()
    {
        cout << tp+1;
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
};

int main()
{
    Stack s;
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.pop();
    s.pop();
    //s.size();
    //s.print();
    cout << s.empty();
    return 0;
}