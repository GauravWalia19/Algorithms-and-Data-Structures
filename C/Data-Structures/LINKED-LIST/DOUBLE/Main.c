/*
 *  DOUBLE LINKED LIST
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
/*=========> SRUCTURE OF NODE <===========*/
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

/*---------> GLOBAL DECLARATIONS <---------*/
struct node* head=NULL;
struct node* tail=NULL;
static int length=0;

//METHODS
/*****************************************/
/*=============> CREATE NODE <===========*/
struct node* create(int value)
{
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data=value;
    newNode->next=NULL;
    newNode->prev=NULL;
}

/******************************************/
/*=====> LENGTH OF THE LINKED LIST <======*/
int size()
{
    return length;
}

/*
 *      INSERTION
 *  1. AT HEAD
 *  2. AT TAIL
 *  3A. AT MIDDLE USING POSITION
 *  3B. AT MIDDLE USING VALUE
 */

/*==============> INSERTION AT HEAD <=================*/
void insertion_at_head(int val)
{
    struct node* newNode = create(val);
    if(head==NULL) //blank linked list
    {
        head=newNode;
        tail=newNode;
    }
    else
    {
        newNode->next=head;
        head->prev=newNode;
        head=newNode;
    }
    length++;
}

/*==============> INSERTION AT TAIL <=================*/
void insertion_at_tail(int val)
{
    struct node* newNode=create(val);
    if(head==NULL)
    {
        head=newNode;
        tail=newNode;
    }
    else
    {
        tail->next=newNode;
        newNode->prev=tail;
        tail=newNode;
    }
    length++;
}

/*==========> INSERTION AT MIDDLE USING POSITION <===========*/
void insertion_at_middle(int value,int position)
{
    struct node* newNode = create(value);
    if(head==NULL && position==0) //blank link list
    {
        head = newNode;
        tail = newNode;
        length++;
    }
    else if(position==0) //insertion at head
    {
        newNode->next = head;
        head->prev = newNode;
        head=newNode;
        length++;
    }
    else if(position<0 || position>length-1)
    {
        printf("INVALID POSITION\n");
        return;
    }
    else
    {
        struct node* current=head;
        struct node* prev=head;
        int i=0;
        while(current->next!=NULL)
        {
            if(i==position)
            {
                break;
            }
            prev=current;
            current=current->next;
            i++;
        }
        prev->next = newNode;
        newNode->prev = prev;

        newNode->next=current;
        current->prev=newNode;
        length++;
    }
}

/*=======> INSERTION AT MIDDLE USING VALUE <=======*/
void insertion_at_pure_middle(int value)
{
    struct node* newNode=create(value);
    if(head==NULL) //if linked list is empty
    {
        head=newNode;
        tail=newNode;
    }
    else if(head->next==NULL)
    {
        head->next = newNode;
        newNode->prev=head;
        tail=tail->next;
    }
    else
    {
        struct node* current1=head;
        struct node* current2=tail;
        while(1)
        {
            if(current1->data==current2->data || current1->next->data==current2->data)
            {
                break;
            }
            current1=current1->next;
            current2=current2->prev;
        }

        struct node* prev = current2->prev; //node used for previous node
        
        prev->next=newNode;
        newNode->prev=prev;

        newNode->next = current2;
        current2->prev=newNode;
    } 
    length++;
}

/*
 *  DELETION
 *  1. FROM HEAD
 *  2. FROM TAIL
 *  3A. FROM MIDDLE USING VALUE
 *  3B. FROM MIDDLE USING INDEX
 */

/*=======> DELETE FROM HEAD <========*/
void delete_from_head()
{
    if(head==NULL) //empty list
    {
        return;
    }
    else if(head->next==NULL) //single node
    {
        head=NULL;
        tail=NULL;   
    }
    else
    {
        struct node* temp=head;
        head=head->next;
        temp->next=NULL;
        head->prev=NULL;
        free(temp);
    }
    length--;
}

/*=======> DELETE FROM TAIL <=========*/
void delete_from_tail()
{
    if(head==NULL) //empty list
    {
        return;
    }
    else if(head->next==NULL) //one node only
    {
        head=NULL;
        tail=NULL;
    }
    else
    {
        struct node* temp=tail;
        tail=tail->prev;

        tail->next=NULL;
        temp->prev=NULL;
        free(temp);
    }
    length--;
}

/*==========> DELETE FROM MIDDLE USING VALUE <=========*/
void delete_from_middle_using_value(int value)
{
    if(head==NULL) //for empty list
    {
        return;
    }
    else if(head->next==NULL) //for single node
    {
        if(head->data==value) //value present at head
        {
            head=NULL;
            tail=NULL;
        }
        else
        {
            return;
        }
    }
    else if(head->data==value) //at head
    {
        struct node* temp=head;
        head=head->next;
        head->prev=NULL;
        temp->next=NULL;
        free(temp);
    }
    else if(tail->data==value) //at tail
    {
        struct node* temp=tail;
        tail=tail->prev;
        tail->next=NULL;
        temp->prev=NULL;
        free(temp);
    }
    else
    {
        struct node* current=head;
        struct node* prev=head;
        while(current->next!=NULL)
        {
            if(current->data==value)
            {
                break;
            }
            prev=current;
            current=current->next;
        }
        //deleting finded node
        prev->next=current->next;
        current->next->prev=prev;

        current->prev=NULL;
        current->next=NULL;
        free(current);
    }
    length--;
}

/*==========> DELETE FROM MIDDLE USING INDEX <=========*/
void delete_from_middle_using_index(int position)
{
    if(head==NULL) //empty list
    {
        return;
    }
    else if(head->next==NULL) //single node
    {
        if(position==0)
        {
            head=NULL;
            tail=NULL;
        }
        else
        {
            return;
        }
    }
    else if(position<0 || position>length-1) //check limit
    {
        printf("INVALID INDEX\n");
        return;
    }
    else if(position==0) //remove from head
    {
        struct node* temp=head;
        head=head->next;
        head->prev=NULL;
        temp->next=NULL;
        free(temp);
    }
    else if(position==length-1) //remove from tail
    {
        struct node* temp=tail;
        tail=tail->prev;
        tail->next=NULL;
        temp->prev=NULL;
        free(temp);
    }
    else
    {
        struct node* current=head;
        struct node* prev=head;
        int i=0;
        while(current->next!=NULL)
        {
            if(i==position)
            {
                break;
            }
            prev=current;
            current=current->next;
            i++;
        }
        //deleting finded node
        prev->next=current->next;
        current->next->prev=prev;

        current->prev=NULL;
        current->next=NULL;
        free(current);
    } 
    length--;
}
/*
 *  TRAVERSING AND PRINTING THE LIST
 *  1. FROM LEFT
 *  2. FROM RIGHT -- REVERSED LIST
 */

/*===============> PRINT LIST FROM LEFT <===============*/
void print_list_from_left()
{
    if(head==NULL)
    {
        printf("NULL\n");
    }
    else
    {
        struct node* current=head;
        printf("NULL <- ");
        while(current!=NULL)
        {
            if(current->next==NULL)
            {
                printf("%d",current->data);    
            }
            else
            {
                printf("%d <=> ",current->data);
            }   
            current=current->next;
        }
        printf(" -> NULL\n");
    }
}

/*===============> PRINT LIST FROM RIGHT <===============*/
void print_list_from_right()
{
    if(head==NULL)
    {
        printf("NULL\n");
    }
    else
    {
        struct node* current=tail;
        printf("NULL <- ");
        while(current!=NULL)
        {
            if(current->prev==NULL)
            {
                printf("%d",current->data);    
            }
            else
            {
                printf("%d <=> ",current->data);
            }
            current=current->prev;
        }
        printf(" -> NULL\n");
    }
}

/*
 *  SEARCHING
 *  1. LINEAR SEARCH
 *  2. OPTIMAL SEARCH
 */

/*=======> LINEAR SEARCH <=======*/
bool search_element(int value)
{
    if(head==NULL)
    {
        return false;
    }
    else
    {
        struct node* current=head;
        while(current!=NULL)
        {
            if(current->data==value)
            {
                return true;
            }
            current=current->next;
        }
    }
    return false;
}
/*========> OPTIMAL SEARCH <=========*/
bool optimal_search(int value)
{
    if(head==NULL)
    {
        return false;
    }
    else
    {
        struct node* current1 = head;
        struct node* current2 = tail;
        int flag=0;
        while(1)
        {
            if(current1->data==current2->data || current1->next->data==current2->data)
            {
                break;
            }
            else if(current1->data==value || current2->data==value)
            {
                return true;
            }
            current1=current1->next;
            current2=current2->prev;
        }
        return false;
    }
}
/***************************************/
/*===========> MAIN METHOD <===========*/
int main()
{
    insertion_at_head(1);
    insertion_at_head(2);
    print_list_from_left();
    print_list_from_right();

    insertion_at_tail(3);
    insertion_at_tail(4);
    print_list_from_left();

    insertion_at_middle(5,0);
    insertion_at_middle(6,4);
    insertion_at_middle(7,1);
    print_list_from_left();

    insertion_at_pure_middle(99);
    print_list_from_left();

    insertion_at_pure_middle(100);
    print_list_from_left();

    delete_from_head();
    print_list_from_left();

    delete_from_tail();
    print_list_from_left();

    delete_from_middle_using_value(3);
    print_list_from_left();

    delete_from_middle_using_index(0);
    print_list_from_left();

    if(search_element(-1))
    {
        printf("ELEMENT FOUND!!!\n");
    }
    else
    {
        printf("ELEMENT NOT FOUND\n");
    }
    if(optimal_search(6))
    {
        printf("ELEMENT FOUND!!!\n");
    }
    else
    {
        printf("ELEMENT NOT FOUND\n");
    }
}