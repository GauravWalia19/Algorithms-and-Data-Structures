#include <stdio.h>
#define SIZE 100
#include <math.h>
#include <stdlib.h>
/*my own stack*/
int Stack[SIZE];
int top = -1;
int isEmpty()
{
  return top == -1;
}

void push(int item)
{
  Stack[++top] = item;
}

int pop()
{
  if(isEmpty())
  {
    printf("STACK UNDERFLOW\n");
    exit(0);
  }
  int temp = Stack[top];
  top--;
  return temp;
}

int evalPostfix(char *exp)
{
  int i = 0;
  char str[50];
  int j = 0;
  //parsing
  while (exp[i] != '\0')
  {
    if (exp[i] >= '0' && exp[i] <= '9')
    {
      push(exp[i] - '0');
    }
    else //operator
    {
      if(isEmpty())
      {
        return -1;
      }
      int b = pop();
      int a = pop();
      int result = 0;
      switch (exp[i])
      {
      case '+':
        result = a + b;
        break;
      case '-':
        result = a - b;
        break;
      case '/':
        result = a / b;
        break;
      case '*':
        result = a * b;
        break;
      case '^':
        result = (int)pow(a, b);
      }
      push(result);
    }
    i++;
  }
  return Stack[top];
}

int main()
{
  char str[SIZE];
  printf("Enter the postfix expression\n");
  scanf("%s", str);
  int result = evalPostfix(str);
  printf("RESULT: %d\n", result);
}