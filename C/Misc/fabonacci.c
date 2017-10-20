//Header files
#include <stdio.h>//header input output files
#include <stdlib.h>//header library
//function defination
int fabonacci(int );

//main function

int main() {
    int N;
    printf("Enter the no of terms: ");
    scanf("%d",&N);
    fabonacci(N); //function call
    return 0;
}

//function body

int fabonacci(int M) {
    int a=0,b=1,i,c;
    printf("Fabonacci series is:\n%d\n%d",a,b);
    //for loop to find all fabonnaci number
    for (i=0;i<M-2;i++) {
        c=a+b;//fabonacci series is addition of previous two numbers
        a=b;
        b=c;
        printf("\n%d",c);
    }
    return 0;
}

