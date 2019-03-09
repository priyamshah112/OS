import java.util.*;
public class MaxMin {
    static MaxMin m=new MaxMin();
    static int max,min;
	static int count=0;
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
	
		 System.out.println("Enter number of elements");
		int a[] = new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
			System.out.print("\t"+a[i]);
		}
		System.out.println();
	    double t1=System.nanoTime();
        MaxMin.max=MaxMin.min=a[0];
	    double t2=System.nanoTime();
		System.out.println("TIME TAKEN "+(t2-t1));
       
        int[] getMaxMin=m.MaxMin(a, 0, a.length-1, a[0], a[0]);
        System.out.println("Max : "+getMaxMin[0]+"\nMin : "+getMaxMin[1]);
		System.out.println("COUNT FOUND "+ count );
    }

    public int[] MaxMin(int[] a,int i,int j,int max,int min)
    {
        int mid,max1,min1;
        int result[]=new int[2];
        count=count+1;
        if (i==j) 
		{ max = min = a[i];
			count=count+1;}
        else if (i==j-1) 
          {
				count=count+1;
                if (a[i] < a[j]) { count=count+1;
				this.max = getMax(this.max,a[j]);
				this.min = getMin(this.min,a[i]); }
                else { 
				count=count+1;
				this.max = getMax(this.max,a[i]); 
				this.min = getMin(this.min,a[j]); }
          }
     else
     {
         count=count+1;
           mid = ( i + j )/2;
          count=count+1;
           max1=min1=a[mid+1];
           MaxMin( a, i, mid, max, min );
           MaxMin( a, mid+1, j, max1, min1 );
           count=count+1;
           if (this.max < max1) {
			   count=count+1;
		   this.max = max1; }
		   if (this.min > min1) {
			   count=count+1;
			   this.min = min1;
		   }
     }
        result[0]=this.max;  
		result[1]=this.min;
        return result;
    }

    public static int getMax(int i,int j)
    {
        if(i>j) return i;
        else return j;
    }

    public static int getMin(int i,int j)
    {
        if(i>j) return j;
        else return i;
    }
}
/*
OUTPUT


C:\Users\PRIYAM SHAH\Desktop\AOAD>java MaxMin
Enter number of elements
10
        1       2       3       4       5       6       7       8       9       10
TIME TAKEN 4266.0
Max : 10
Min : 1
COUNT FOUND 38

C:\Users\PRIYAM SHAH\Desktop\AOAD>java MaxMin
Enter number of elements
20
        1       2       3       4       5       6       7       8       9       10      11      12      13      14
15      16      17      18      19      20
TIME TAKEN 4800.0
Max : 20
Min : 1
COUNT FOUND 80

C:\Users\PRIYAM SHAH\Desktop\AOAD>java MaxMin
Enter number of elements
40
        1       2       3       4       5       6       7       8       9       10      11      12      13      14
15      16      17      18      19      20      21      22      23      24      25      26      27      28      29
30      31      32      33      34      35      36      37      38      39      40
TIME TAKEN 5547.0
Max : 40
Min : 1
COUNT FOUND 164

C:\Users\PRIYAM SHAH\Desktop\AOAD>java MaxMin
Enter number of elements
60
        1       2       3       4       5       6       7       8       9       10      11      12      13      14
15      16      17      18      19      20      21      22      23      24      25      26      27      28      29
30      31      32      33      34      35      36      37      38      39      40      41      42      43      44
45      46      47      48      49      50      51      52      53      54      55      56      57      58      59
60
TIME TAKEN 6400.0
Max : 60
Min : 1
COUNT FOUND 220

C:\Users\PRIYAM SHAH\Desktop\AOAD>java MaxMin
Enter number of elements
80
        1       2       3       4       5       6       7       8       9       10      11      12      13      14
15      16      17      18      19      20      21      22      23      24      25      26      27      28      29
30      31      32      33      34      35      36      37      38      39      40      41      42      43      44
45      46      47      48      49      50      51      52      53      54      55      56      57      58      59
60      61      62      63      64      65      66      67      68      69      70      71      72      73      74
75      76      77      78      79      80
TIME TAKEN 7001.0
Max : 80
Min : 1
COUNT FOUND 332

C:\Users\PRIYAM SHAH\Desktop\AOAD>java MaxMin
Enter number of elements
100
        1       2       3       4       5       6       7       8       9       10      11      12      13      14
15      16      17      18      19      20      21      22      23      24      25      26      27      28      29
30      31      32      33      34      35      36      37      38      39      40      41      42      43      44
45      46      47      48      49      50      51      52      53      54      55      56      57      58      59
60      61      62      63      64      65      66      67      68      69      70      71      72      73      74
75      76      77      78      79      80      81      82      83      84      85      86      87      88      89
90      91      92      93      94      95      96      97      98      99      100
TIME TAKEN 7500.0
Max : 100
Min : 1
COUNT FOUND 444
*/
