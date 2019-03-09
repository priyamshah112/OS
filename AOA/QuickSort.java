import java.util.*;
class QuickSort
{
   static int count=0;
   int partition(int arr[], int low, int high)
   {
       int pivot = arr[(high+low)/2]; 
       int i = (low-1); 
	   count=count+1;
       for (int j=low; j<high; j++,count=count+1)
       {
          count=count+1;
           if (arr[j] <= pivot)
           {
			   count=count+1;
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
		count=count+1;
       int temp = arr[i+1];
	  
       arr[i+1] = arr[high];
	   
       arr[high] = temp;

       return i+1;
   }


   void sort(int arr[], int low, int high)
   {
	   count=count+1;
       if (low < high)
       {
			count=count+1;
           int pi = partition(arr, low, high);
			
           
           sort(arr, low, pi-1);
		   
           sort(arr, pi+1, high);
       }
   }


   static void printArray(int arr[])
   {
       int n = arr.length;
       for (int i=0; i<n; ++i)
           System.out.print(arr[i]+" ");
       System.out.println();
   }

   
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of numbers");
		int arr[]= new int[sc.nextInt()];
		System.out.println("Enter numbers to be sorted");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]= i+1;
		}
		double t1=System.nanoTime();
		
		
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length-1);
		double t2=System.nanoTime();
		System.out.println("TIME TAKEN "+(t2-t1));
		System.out.println("COUNT FOUND "+count );

       System.out.println("sorted array");
       printArray(arr);
   }
}
/*
OUTPUT
WORSTCASE
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac QuickSort.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
10
Enter numbers to be sorted
TIME TAKEN 23894.0
COUNT FOUND 181
sorted array
1 2 3 4 5 6 7 8 9 10

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
20
Enter numbers to be sorted
TIME TAKEN 34560.0
COUNT FOUND 666
sorted array
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
40
Enter numbers to be sorted
TIME TAKEN 124160.0
COUNT FOUND 2536
sorted array
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
60
Enter numbers to be sorted
TIME TAKEN 183466.0
COUNT FOUND 5606
sorted array
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
80
Enter numbers to be sorted
TIME TAKEN 397227.0
COUNT FOUND 9876
sorted array
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
100
Enter numbers to be sorted
TIME TAKEN 499627.0
COUNT FOUND 15346
sorted array
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
*/
/*
BEST CASE
C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
10
Enter numbers to be sorted
TIME TAKEN 21760.0
COUNT FOUND 85
sorted array
1 2 3 5 4 10 7 8 6 9

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
20
Enter numbers to be sorted
TIME TAKEN 25173.0
COUNT FOUND 218
sorted array
1 2 3 5 4 10 7 8 6 9 20 12 13 14 16 15 11 18 19 17

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
40
Enter numbers to be sorted
TIME TAKEN 33707.0
COUNT FOUND 519
sorted array
1 2 3 5 4 10 7 8 6 9 20 12 13 14 16 15 11 18 19 17 40 22 23 24 26 25 31 28 29 27 30 21 33 34 36 35 32 38 39 37

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
60
Enter numbers to be sorted
TIME TAKEN 44373.0
COUNT FOUND 860
sorted array
1 2 4 3 8 6 7 5 15 10 11 12 9 14 13 30 17 18 20 19 23 22 21 16 25 26 27 24 29 28 60 32 33 35 34 39 37 38 36 46 41 42 43 40 45 44 31 48 49 51 50 54 53 52 47 56 57 58 55 59

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
80
Enter numbers to be sorted
TIME TAKEN 76800.0
COUNT FOUND 1231
sorted array
1 2 3 5 4 10 7 8 6 9 20 12 13 14 16 15 11 18 19 17 40 22 23 24 26 25 31 28 29 27 30 21 33 34 36 35 32 38 39 37 80 42 43 44 46 45 51 48 49 47 50 61 53 54 55 57 56 52 59 60 58 41 63 64 65 67 66 71 69 70 68 62 73 74 76 75 72 78 79 77

C:\Users\PRIYAM SHAH\Desktop\AOAD>java QuickSort
Enter number of numbers
100
Enter numbers to be sorted
TIME TAKEN 69120.0
COUNT FOUND 1607
sorted array
1 2 4 3 7 6 5 13 9 10 11 8 12 25 15 16 17 20 19 18 14 22 23 21 24 50 27 28 29 32 31 30 38 34 35 36 33 37 26 40 41 42 45 44 43 39 47 48 46 49 100 52 53 55 54 58 57 56 64 60 61 62 59 63 76 66 67 68 71 70 69 65 73 74 72 75 51 78 79 80 83 82 81 89 85 86 87 84 88 77 91 92 93 95 94 90 97 98 96 99
*/