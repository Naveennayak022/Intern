#include <stdio.h>
void main()
{
    int l,m,n,i,j,k;
    int a[m],b[n],c[l];
    scanf("%d",&m); // length of array a
    scanf("%d",&n); // length of array b
    l=m+n;
    for( i=0;i<m;i++)
    {
        scanf("%d",&a[i]);
    }
    for( j=0;j<n;j++)
    {
        scanf("%d",&b[j]);
    }
    for( i=0;i<m;i++)
    {
        for( j=0;j<n;j++)
        {
            if(a[i]<=b[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=b[j];
                j++;
                k++;
            }
            
        }
    }
}