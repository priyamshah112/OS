import java.util.*;

public class MergeSort
{  
  static int count=0;
 public static void main(String args[])
{
  
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of numbers");
int a[]= new int[sc.nextInt()];
System.out.println("Enter numbers to be sorted");
for(int i=0;i<a.length;i++)
{
a[i]= i+1;
}
double t1=System.nanoTime();
mergeSort(a,0,a.length-1);
double t2=System.nanoTime();
System.out.println("TIME TAKEN "+(t2-t1));
System.out.println("COUNT FOUND "+count );
System.out.println("Sorted :");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
static  void mergeSort(int a[],int p,int r)
{
count=count+1;
if(p<r)
{
count=count+1;	
 int q = (p+r)/2;
mergeSort(a,p,q);
mergeSort(a,q+1,r);
merge(a,p,r,q);	
}	

}
static void merge(int a[],int p,int r, int q )
{
int n1,n2;
n1 = q-p+1;
n2 = r-q ;
count=count+1;
int L[]= new int [n1];
int R[]= new int [n2];
 for(int i=0;i<n1;i++,count=count+1)
{
 L[i] = a[p+i]; 
}	
for(int i=0;i<n2;i++,count=count+1)
{
R[i] = a[q+i+1];
}
int i=0,j=0;
count=count+1;
while(i<n1 && j<n2)
{	count=count+1;
if(L[i]<R[j])
{
count=count+1;
a[p++]=L[i];
i++;
}
else
{	count=count+1;
a[p++]=R[j];
j++;
}
}
count=count+1;
while(i<n1)
{
count=count+1;
a[p++]=L[i++];	
}
count=count+1;
 while(j<n2)
{
count=count+1;
a[p++]=R[j++];
}
}
}