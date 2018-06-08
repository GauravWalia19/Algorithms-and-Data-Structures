#include<iostream>
using namespace std;
struct node
{
int info;
node *next;	
};
main()
{
	int n,i;
	node *temp,*t,*start=NULL,*newn,*current,*nextn=NULL,*prev=NULL;
	while(start==NULL)
	{
		start=new node;
		cin>>start->info;
		start->next=NULL;
	}
	cin>>n;
	for(i=0;i<n;i++)
	{
		newn=new node;
		cin>>newn->info;
		newn->next=NULL;
		t=start;
		while(t->next!=NULL)
        t=t->next;
        t->next=newn;
	}
	t=start;
	while(t!=NULL)
{   cout<<"Before Insertion";
	cout<<t->info<<" ";
	t=t->next;
}
	current=start;
	while(current!=NULL)
	{
		nextn=current->next;
		current->next=prev;
		prev=current;
		current=nextn;
	}
	start=prev;
	t=start;
	while(t!=NULL)
{
	cout<<t->info;
	t=t->next;
}
}
