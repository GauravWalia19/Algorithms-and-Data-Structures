#include <stdio.h>
#include <stdlib.h>
struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
};
struct Node* newNode(int data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->left=NULL;
    newNode->right=NULL;
    return newNode;
}
struct Node* ROOT = NULL;

void preorder(struct Node* current)
{
    if(current==NULL)
    {
        return;
    }
    printf("%d ",current->data);
    preorder(current->left);
    preorder(current->right);
}

int main()
{
    //building a tree
    struct Node* a = newNode(1);
    struct Node* b = newNode(2);
    struct Node* c = newNode(3);
    struct Node* d = newNode(4);
    struct Node* e = newNode(5);
    struct Node* f = newNode(6);
    struct Node* g = newNode(7);

    ROOT = a;
    ROOT->left = b;
    ROOT->right = c;

    ROOT->left->left = d;
    ROOT->left->right=e;

    ROOT->right->left=f;
    ROOT->right->right=g;

    preorder(ROOT);
    printf("\n");
}