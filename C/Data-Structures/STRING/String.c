#include <stdio.h>
#include <string.h>

int main()
{
    char str[50];
    printf("Enter any string\n");
    gets(str);
    puts(str);

    printf("Length of the string %d",(int)strlen(str));
    if(strcmp(str,"Hello World")==0)
    {
        printf("Strings are equal\n");    
    }
}