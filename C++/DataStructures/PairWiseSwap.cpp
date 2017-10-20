#include<iostream>
using namespace std;
struct node
{
	int info;
	node *next;
};
main()
{
	int i,n,x,te;
	node *start=NULL,*newn,*temp,*t,*ne,*nr;
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
		{
			t=t->next;
		}
		t->next=newn;
	}
	t=start;
	while(t!=NULL)
	{
		cout<<t->info<<" ";
		t=t->next;
	}
	ne=start;
	while(ne->next!=NULL)
	{
		te=ne->info;
		ne->info=ne->next->info;
		ne->next->info=te;
	    ne=ne->next->next;
	}
	cout<<"\n";
	t=start;
	while(t!=NULL)
	{
		cout<<t->info<<" ";
		t=t->next;
	}
}
