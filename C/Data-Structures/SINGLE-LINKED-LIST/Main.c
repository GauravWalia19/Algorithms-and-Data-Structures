#include <stdio.h>
#include <stdlib.h>
struct node
{
    int value;
    struct node *next;
};
//METHODS
struct node* head=NULL;

/***********************************/
/*============> CREATE <===========*/
struct node* create(int val)
{
    struct node* newNode = (struct node*)malloc(sizeof(struct node)); //created new node
    newNode->value=val;
    newNode->next=NULL;
    return newNode;
}

/***********************************/
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
}

/***********************************/
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
}

/***********************************/
/*=========> DELETE HEAD <=========*/
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
}


/***********************************/
/*=========> DELETE TAIL <=========*/
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
    insert_tail(4);
    print_single_linked_list();
    delete_head();
    print_single_linked_list();
    delete_tail();
    print_single_linked_list();
}