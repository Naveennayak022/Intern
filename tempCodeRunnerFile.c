#include<stdio.h>;
void main()
{
    int size=8;
    int i,j;
    for(i=0;i<size;i++)
{
    for(j=0;j<size;j++)
    {
        if((i+j)%2==0)
        {
            printf("|*");
        }
        else
        {
            printf("| ");
        }
    }
    printf("|");
}
}