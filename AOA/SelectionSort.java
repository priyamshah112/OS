import java.util.*;
import java.util.*;
class SelectionSort {
   public static void main(String[] args) {
	
	  int count=0;
      
	  int a[]=new int[10];
	  for(int i=10;i>0;i--)
	  {
		  a[10-i]=i;
	  }
	  long t1=System.nanoTime();
      for (int p = 0; p < a.length-1; p++, count+=1) {
		 
         int max = a[p];
		 count+=1;
         int maxp = p;
		 count+=1;
         for (int j = p+1; j < a.length; j++, count+=1) {
			count+=1;
            if (a[j] < max ) {
				
               max = a[j];
			   count+=1;
               maxp = j;
			   count+=1;
            }
         }
         a[maxp] = a[p];
		 count+=1;
         a[p] = max;
		 count+=1;
      }
	    long t2=System.nanoTime();
         t2=t2-t1;
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + " ");
      }
      System.out.println("");
	   System.out.println("Time is "+t2);
	  System.out.println("Count is"+count);
   }
}
/*OUTPUT
   BestCase  
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
0 1 2 3 4 5 6 7 8 9
Time is 2560
Count is135

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
Time is 5974
Count is475

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39
Time is 17067
Count is1755

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59
Time is 39680
Count is3835

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79
Time is 64853
Count is6715

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
Time is 191574
Count is10395

    WorstCase
   
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
Time is 119466
Count is15395


C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80
Time is 79786
Count is9915

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60
Time is 47787
Count is5635

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40
Time is 20480
Count is2555

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
Time is 6827
Count is675

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac SelectionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java SelectionSort
1 2 3 4 5 6 7 8 9 10
Time is 3413
Count is185
*/