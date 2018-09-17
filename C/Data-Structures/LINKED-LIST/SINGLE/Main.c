#include <stdio.h>
#include <stdlib.h>
struct node
{
    int value;
    struct node *next;
};
//METHODS
struct node* head=NULL;
int length=0;

/***********************************/
/*============> CREATE <===========*/
struct node* create(int val)
{
    struct node* newNode = (struct node*)malloc(sizeof(struct node)); //created new node
    newNode->value=val;
    newNode->next=NULL;
    return newNode;
}

/************************************/
/*=============> LENGTH <===========*/
int size()
{
    return length;
}

/*====================================
 *  INSERTION
 *  1. AT HEAD
 *  2. AT TAIL
 *  3. AT MIDDLE
*=====================================/

/*=========> INSERT HEAD <=========*/
void insert_head(int val)
{
    struct node* newNode = create(val); //newnode to insert to head
    if(head==NULL)
    {
        head=newNode;
    }
    else
    {
        newNode->next = head;
        head = newNode;
    }
    length++;
}

/*=========> INSERT TAIL <=========*/
void insert_tail(int val)
{
    struct node* newNode = create(val); //newnode to insert to tail
    if(head==NULL)
    {
        head=newNode;
    }
    else
    {
        struct node* current=head;
        while(current->next!=NULL)
        {
            current=current->next;
        }
        current->next = newNode;
    }
    length++;
}

/*===========> INSERT AT MIDDLE <=========*/
void insert_middle(int value,int position)
{
    if(head==NULL)
    {
        return;
    }
    else if(position<0 || position>length-1)
    {
        printf("INVALID POSITION\n");
        return;
    }
    else if(position==0) //insertion at head
    {
        struct node* newNode = create(value);
        newNode->next = head;
        head = newNode;
    }
    else
    {
        struct node* current=head;
        struct node* prev=NULL;
        struct node* newNode = create(value);
        int i=0;
        while(current->next != NULL)
        {
            if(position==i)
            {
                break;
            }
            prev=current;
            current=current->next;
            i++;
        }
        prev->next = newNode;
        newNode->next = current;
    }
    length++;
}

/*=======================================
 *  DELETION
 *  1. FROM HEAD
 *  2. FROM TAIL
 *  3A. FROM MIDDLE USING VALUE FROM LEFT
 *  3B. FROM MIDDLE USING INDEX
 *=======================================/

/*=========> DELETE FROM HEAD <=========*/
void delete_head()
{
    if(head==NULL)
    {
        return;
    }
    else if(head->next==NULL)
    {
        head=NULL;
    }
    else
    {
        struct node* temp=head;
        head=head->next;
        temp->next=NULL;
        free(temp);
    }
    length--;
}

/*=========> DELETE FROM TAIL <=========*/
void delete_tail()
{
    if(head==NULL)
    {
        return;
    }
    else if(head->next==NULL)
    {
        head=NULL;
    }
    else
    {
        struct node* current=head;
        struct node* prev=head;
        while(current->next!=NULL)
        {
            prev=current;
            current=current->next;
        }
        prev->next=NULL;
        free(current); //delete last node
    }
    length--;
}

/*===> DELETE FROM MIDDLE USING VALUE <===*/
void delete_using_value(int value)
{
    if(head==NULL)
    {
        return;
    }
    else if(head->next==NULL && head->value==value) //one node
    {
        head=NULL;
    }
    else if(head->value==value) //value present at head
    {
        struct node* temp = head;
        head=head->next;
        temp->next=NULL;
        free(temp);
    }
    else
    {
        struct node* current=head;
        struct node* prev=head;
        while(current->next!=NULL)
        {
            if(current->value==value)
            {
                break;
            }
            prev=current;
            current=current->next;
        }
        prev->next = current->next;
        current->next=NULL;
        free(current);
    } 
    length--;
}

/*===> DELETE FROM MIDDLE USING INDEX <===*/
void delete_using_index(int position)
{
    if(head==NULL)
    {
        return;
    }
    else if(position<0 || position>length-1)
    {
        printf("INVALID POSITION\n");
        return;
    }
    else if(position==0) //deletion at head
    {
        struct node* temp=head;
        head = head->next;
        temp->next = NULL;
        free(temp);
    }
    else
    {
        int i=0;
        struct node* current=head;
        struct node* prev=head;
        while(current->next!=NULL)
        {
            if(i==position)
            {
                break;
            }
            i++;
            prev=current;
            current=current->next;
        }
        //deletion
        prev->next = current->next;
        current->next=NULL;
        free(current);
    }
}

/***********************************/
/*=========> PRINT LIST <=========*/
void print_single_linked_list()
{
    struct node* current = head;
    while(current!=NULL)
    {
        printf("%d -> ",current->value);
        current=current->next;
    }
    printf("NULL\n");
}


/*#################################*/
/*=========> MAIN METHOD <=========*/
int main()
{
    insert_head(1);
    insert_head(2);
    insert_head(3);
    insert_head(4);
    insert_tail(1);
    insert_tail(2);
    insert_tail(3);
    insert_tail(4);
    print_single_linked_list();

    delete_head();
    print_single_linked_list();
    
    delete_tail();
    print_single_linked_list();

    insert_middle(99,5);
    print_single_linked_list();

    printf("%d %d\n",length,size());

    delete_using_value(1);
    delete_using_value(3);
    print_single_linked_list();

    delete_using_index(-1);
    print_single_linked_list();
}