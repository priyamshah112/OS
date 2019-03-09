class InsertionSort
{
    
    void sort(int arr[])
    {
		long t1=System.nanoTime();
		int count=0;
        int n = arr.length;
		
        for (int i=1; i<n; ++i,count+=1)
        {
			count+=1;
            int key = arr[i];
			count+=1;
            int j = i-1;
			
 
            count+=1;
            while (j>=0 && arr[j] > key)
            {
				count+=1;
                arr[j+1] = arr[j];
				count+=1;
                j = j-1;
            }
			count+=1;
            arr[j+1] = key;
        }
		long t2=System.nanoTime();
	 System.out.println("Time is "+(t2-t1));
	  System.out.println("Count is"+count);
    }
 
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    
    public static void main(String args[])
    {        
       int arr[]=new int[10];
	  for(int i=10;i>0;i--)
	  {
		  arr[10-i]=i;
	  }
 
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
         
        printArray(arr);
    }
}


/*OUTPUT
BESTCASE

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
0 1 2 3 4 5 6 7 8 9
Time is 2133
Count is 45

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
Time is 2560
Count is 95

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39
Time is 2706
Count is 195

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59
Time is 2987
Count is 295

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79
Time is 4693
Count is 395

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
Time is 6400
Count is 495


WORST CASE
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
Time is 14590
Count is 10395

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80
Time is 144213
Count is 6715

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60
Time is 84053
Count is 3835

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40
Time is 35413
Count is 1755

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
Time is 9387
Count is 455

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac InsertionSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java InsertionSort
1 2 3 4 5 6 7 8 9 10
Time is 3413
Count is 135

C:\Users\PRIYAM SHAH\Desktop\AOAD>
*/

