#include <iostream>
#include <vector>
using namespace std;
class queue
{
    int arr[5];
    int f;
    int r;

    public:
    queue()
    {
        f=-1;
        r=-1;
        for(int i=0;i<5;i++)
        {
            arr[i]=0;
        }
    }
    void enqueue(int num)
    {
        if(r==4)
        {
            cout << "OverFlow" << endl;
        }
        else if(r==-1 && f==-1)
        {
            r=f=0;
            arr[r] = num;
        }
        else
        {
            r++;
            arr[r] = num;
        }
    }
    void push(int num)
    {
        enqueue(num);
    }
    int dequeue()
    {
        int val;
        if(f==-1 && r==-1)
        {
            cout << "UnderFlow"<<endl;
        }
        else if(f==r)
        {
            val = arr[f];
            f=r=-1;
        }
        else
        {
            val = arr[f];
            f++;
        }
        return val;
    }
    int pop()
    {
        return dequeue();
    }
    bool empty()
    {
        if(f==-1 && r==-1)
        {
            return true;
        }
        return false;
    }
    void print()
    {
        for(int i=f;i<=r;i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
    void operator=(queue copy)
    {
        for(int i=f;i<=r;i++)
        {
            copy.arr[i] = arr[i];
        }
        r = copy.r;
        f = copy.f;
    }
    int rear()
    {
        return arr[r];
    }
    int front()
    {
        return arr[f];
    }
    int size()
    {
        return r-f+1;
    }
    //FUNCTION FOR DELETEING SPECIFIC ELEMENT IN QUEUE
    void del(int num)
    {
        int i=0;
        for(i=0;i<5;i++)
        {
            if(arr[i]==num)
            {
                break;
            }
        }
        // cout << i; 2
        for(int j=i;j<5;j++)
        {
            arr[j] = arr[j+1];
        }
        arr[4]=0;
        r--;
    }
    void change(int num,int m)
    {
        int i=0;
        for(i=0;i<5;i++)
        {
            if(arr[i]==num)
            {
                arr[i]=m;
                break;
            }
        }
    }
    bool search(int n)
    {
        for(int i=0;i<5;i++)
        {
            if(arr[i]==n)
            {
                return 1;
            }
        }
        return 0;
    }
};
bool searchque(queue Q,int s)
{
    if(Q.search(s)) //searching in que
    {
        return 1;
    }
    return 0;
}
int searchvectorfromlast(vector<int> v,int search)
{
    for(int i=v.size()-1;i>=0;i--)
    {
        if(search==v[i])
        {
            return i;
        }
    }
    return -1;
}
int main()
{
    //implementing lru
    queue q; //for page
    int pagefaults=0;
    int size=0;
    int num; //number for
    vector<int> totalvalues; 
    while(1)
    {
        cin >> num;
        //totalvalues.push_back(num); //push in vector
        if(size<5)
        {
            if(!searchque(q,num))
            {
                q.push(num);
                size++;
            }
            else
            {
                //increase page faults;
                pagefaults++;
            }
        }
        else
        {
            cout << "IN PROGRESS" <<endl;
            if(searchque(q,num))
            {
                pagefaults++;
            }
            else 
            {
                queue copyq = q;
                int minindex=99;
                while(!copyq.empty())
                {
                    int val = copyq.pop();
                    int index = searchvectorfromlast(totalvalues,val); //index of the value in vector
                    if(minindex>index)
                    {
                        minindex=index;
                    }
                } 
                //finded min index
                //time to delte the minvalue
                //q.del(totalvalues[minindex]);
                //q.push(num);
                q.change(totalvalues[minindex],num);
            }
        }
        totalvalues.push_back(num); //push in vector
        cout << "--------------" <<endl;
        cout << "PAGE/QUEUE: ";
        q.print();
        cout << "PAGEFAULTS:"<<pagefaults<<endl;
        cout << "--------------" <<endl;
    }
}