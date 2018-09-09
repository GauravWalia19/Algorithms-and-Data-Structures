#include <iostream>
#include <string>
using namespace std;

/*STRUCTURE FOR CREATING NODE*/
struct node
{
    string str;
    node *next;
};

/*+++++++++++++++++++++++++++++++++++*/
/*===> SINGLE LINKED LIST CLASS <===*/
class list
{
    node *head;
    int s;
    public:
    list()
    {
        head=NULL;
        s=0;
    }

    /***************************************/
    /*===========> CREATE NODE <===========*/
    node* create(string val)
    {
        node* newNode = new node;
        newNode->str=val;
        newNode->next=NULL;
        return newNode;
    }

    /***************************************/
    /*===========> INSERT HEAD <===========*/
    void insert_head(string val)
    {
        node* newNode = create(val);
        if(head==NULL)
        {
            head = newNode;
        }   
        else
        {
            newNode->next = head;
            head = newNode;
        }
        s++;
    }

    /***************************************/
    /*===========> INSERT TAIL <===========*/
    void insert_tail(string val)
    {
        node* newNode = create(val);
        if(head==NULL)
        {
            head=newNode;
        }   
        else
        {
            node* current=head;
            while(current->next!=NULL)
            {
                current=current->next;
            }
            current->next = newNode;
        }
        s++;
    }

    /***************************************/
    /*===========> DELETE HEAD <===========*/
    void delete_head()
    {
        if(head==NULL)
        {
            return;
        }
        else if(head->next==NULL)
        {
            head=NULL;
            s--;
        }
        else
        {
            node* tmp=head;
            head = head->next;
            tmp->next=NULL;
            delete(tmp);
            s--;
        }
    }

    /***************************************/
    /*===========> DELETE TAIL <===========*/
    void delete_tail()
    {
        if(head==NULL)
        {
            return;
        }
        else if(head->next==NULL)
        {
            head=NULL;
            s--;
        }
        else
        {
            node* current=head;
            node* prev=head;
            while(current->next!=NULL)
            {
                prev=current;
                current=current->next;
            }
            prev->next=NULL;
            delete(current);
            s--;
        }
    }

    /***************************************/
    /*===========> VALUE FROM FRONT <===========*/
    int value_from_front(int num)
    {
        int count=0;
        node* current=head;
        while(current!=NULL)
        {
            if(count==num)
            {
                cout <<  current->str << endl;
                return 1;
            }
            current=current->next;
            count++;
        }
        cout << "ERROR: Index Out Of Bound" << endl;
        return 0;
    }

    /***************************************/
    /*===============> SIZE <==============*/
    int size()
    {
        return s;
    }

    /***************************************/
    /*===========> VALUE FROM LAST <=======*/
    int value_from_last(int num)
    {
        // cout << size()-1-num <<endl;
        return value_from_front(s-1-num);
    }

    /***************************************/
    /*===========> DELETE GIVEN NODE <=======*/
    void delete_given_node(string val)
    {
        if(head==NULL)
        {
            return;
        }
        else if(head->next==NULL)
        {
            if(head->str==val)
            {
                head=NULL;
                s--;
            }
        }
        else if(head->str==val) //for deleting from head;
        {
            node* tmp = head;
            head=head->next;
            delete(tmp);
            s--;
        }
        else
        {
            node* current=head;
            node* prev=head;
            while(current->next!=NULL)
            {
                if(current->str==val)
                {
                    break;
                }
                prev=current;
                current=current->next;
            }
            node* tmp=current;
            prev->next=current->next; 
            delete(tmp);
            s--;
        }
    }

    /***************************************/
    /*===========> PRINT LIST <===========*/
    void print_list()
    {
        node* current = head;
        while(current!=NULL)
        {
            cout << current->str << " -> ";
            current=current->next;
        }
        cout << "NULL" <<endl;
    }
};

/*MAIN METHOD*/
int main()
{
    list A;
    A.insert_head("hello");
    A.insert_head("world");
    A.print_list();
    
    A.insert_tail("is");
    A.insert_tail("insane");
    A.insert_tail("rock");
    A.insert_tail("clown");
    A.insert_tail("stupid");
    A.print_list();
    
    A.delete_head();
    A.print_list();

    A.delete_tail();
    A.print_list();

    A.value_from_front(0);
    A.value_from_front(-1);
    A.value_from_front(100);

    A.value_from_last(0);
    A.value_from_last(-1);
    A.value_from_last(100);

    cout << A.size() << endl;
    A.delete_given_node("insane");
    A.print_list();
}   