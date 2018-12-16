#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <math.h>

/*MY OWN STACK*/
char stack[50];
int top=-1;

/**
 * isEmpty()
 * tells if the stack is empty or not
 * @return bool
 **/
bool isEmpty()
{
  return top==-1;
}

/**
 * size()
 * returns the size of the stack
 * @return int
 **/
int size()
{
  return top+1;
}

/**
 * push(char)
 * push char to the top of the stack
 **/
void push(char ch)
{
  	stack[++top]=ch;
}

/**
 * pop()
 * deletes and returns the top element of the stack
 * @return char
 **/
char pop()
{
  if(isEmpty())
  {
    return '0';
  }
  char temp = stack[top];
  top--;
  return temp;
}

/**
 * peek()
 * returns the top element of the stack
 * @return char
 **/
char peek()
{
  return stack[top];
}

/**
 * print()
 * prints the stack
 **/
void print()
{
  for(int i=0;i<=top;i++)
  {
    printf("%c ",stack[i]);
  }
  printf("\n");
}

/*MAIN PROGRAM*/
int main()
{
	int T;
  	scanf("%d",&T);
  	while(T-->0)
    {
      	char str[50];
      	scanf("%s",str);
      	if(strlen(str)%2)
        {
          printf("-1\n");
        }
      	else
        {
          //balancing the brackets
          for(register int i=0;i<strlen(str);i++)
          {
            if(str[i]==']' && !isEmpty())
            {
              	if(peek()=='[')
                {
                  pop();
                }
              	else
                {
                  push(str[i]);
                }
            }
            else
            {
              push(str[i]);
            }
          }
            //checking balancing
            //remaining left in the stack
            //counting the brackets
            int a=0; //'['
            int len = size();
          	while(!isEmpty() && peek()=='[')
            {
              pop();
              a++;
            }
            int b=len-a;
         	double a1 = (double)a/2;
          	double b1 = (double)b/2;
            int result= (int)ceil(a1) + (int)ceil(b1);
            printf("%d\n",result);
        }
    }
    return 0;
}