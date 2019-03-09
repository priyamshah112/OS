class binarysearch{
	static int  count=0;
	public static void main(String args[])
	{
	  int n=101;
	  int l=0,h=100,v=97;
    int a[]=new int[n];
	 for(int i=0;i<=100;i++)
	 {
	     a[i]=i;
	 }
	 long t1=System.nanoTime();
	 int c=bs(a,v,l,h,count);
	 long t2=System.nanoTime();
	 System.out.println("Time is "+(t2-t1));
	 System.out.println("Count is "+ a[a.length-1]);
	 if(c==v)
		 System.out.println("found");
	 else
		 System.out.println("not found");
	
	}
	private static int bs(int[] arr, int value, int low, int high,int count) {
		count+=1;
		if (high < low)
		{
		count+=1;
		arr[arr.length-1]=count;
		return -1;}
		
		int middle = (high + low) / 2;
		count+=1;
		if (value < arr[middle]) { 
		     count+=1;
			 arr[arr.length-1]=count;
			return bs(arr, value, low, middle - 1,count);
		}
		else if (value > arr[middle]) {
			count+=1;
			arr[arr.length-1]=count;
			return bs(arr, value, middle + 1, high,count);
		}
		else {
			count+=1;
			arr[arr.length-1]=count;
			return middle;
		}	
	}

}
/*
BEST CASE
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 2987
Count is 3
found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 2987
Count is 3
found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 2987
Count is 3
found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 2987
Count is 3
found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 2987
Count is 3
found
*/
/*
WORST CASE
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 3840
Count is 23
not found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 3840
Count is 23
not found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 3840
Count is 20
not found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 4693
Count is 17
not found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 3840
Count is 14
not found
*/

/*
Average case

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 3840
Count is 12
found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 4694
Count is 15
found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 3840
Count is 18
found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 4267
Count is 21
found

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac binarysearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java binarysearch
Time is 3840
Count is 15
found
*/