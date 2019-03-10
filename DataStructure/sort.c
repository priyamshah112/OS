
#include <stdio.h>
#include <math.h>
void selectionsort(int arr[],int n)
 { int d,c,i,swap;
    for ( c = 0 ; c < ( n - 1 ) ; c++ )
   {
      i = c;
 
      for ( d = c + 1 ; d < n ; d++ )
      {
         if ( arr[i] > arr[d] )
            i = d;
      }
      if ( i != c )
      {
         swap = arr[c];
         arr[c] = arr[i];
         arr[i] = swap;
      }
   }
 }

void insertionSort(int arr[], int n)
{
   int i, key, j;
   for (i = 1; i < n; i++)
   {
       key = arr[i];
       j = i-1;
 
       while (j >= 0 && arr[j] > key)
       {
           arr[j+1] = arr[j];
           j = j-1;
       }
       arr[j+1] = key;
   }
}
 

void print(int arr[], int n)
{
   int i;
   for (i=0; i < n; i++)
       printf("%d ", arr[i]);
   printf("\n");
}
 
 

void main()
{
    int arr[20];
    
    int n ,a,i;
    printf("enter total elements \n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
      printf("Enter elements %d \n",i);
      scanf("%d",&arr[i]);
    }
    
    do
    {
    printf("Enter your choice 1]insertion sort 2]selection sort \n");
    scanf("%d",&a);  
    switch(a)
    {
      case 1:
    insertionSort(arr, n);
    print(arr, n);
    break;
    case 2:
   selectionsort(arr,n);
   print(arr,n);
   break;
    }
    }while(a!=3);
    
}