
public class BinSearch
{
public static void main(String args[])
{
int n=100;
int a[]=new int[n];



for(int i=0;i<n;i++)
{
a[i]=i+1;
System.out.print(a[i]+" ");
}
int q=97;

System.out.println();
int counter=0;

int lb=0;
int ub=n-1;
int m;
boolean flag=false;
final long startTime = System.nanoTime();


while(lb<=ub)
{
counter+=1;
m=(lb+ub)/2;counter+=1;
if(q>a[m])
{
counter+=1;
lb=m+1;counter+=1;
}
else if(q<a[m])
{
counter+=1;
ub=m-1;counter+=1;
}
if(a[m]==q)
{
counter+=1;
flag=true;counter+=1;
break;
}
}
counter+=1;


if(flag==true)
{
counter+=1;
System.out.println("Element found");counter+=1;
}
else
{
counter+=1;
System.out.println("Element not found");counter+=1;
}
final long duration = System.nanoTime() - startTime;	

System.out.println("Count="+counter);
System.out.println("Duration="+duration+"ns");
}
}


/*
BEST CASE
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
Element found
Count=7
Duration=55893ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80
Element found
Count=7
Duration=70400ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40
Element found
Count=7
Duration=152320ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
Element found
Count=7
Duration=642986ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10
Element found
Count=7
Duration=577706ns
*/

/*
WORST CASE
C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10
Element not found
Count=19
Duration=360533ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
Element not found
Count=23
Duration=192000ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40
Element not found
Count=27
Duration=75946ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80
Element not found
Count=31
Duration=757759ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
Element not found
Count=31
Duration=604586ns
*/
/*
Average case
C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10
Element found
Count=19
Duration=359680ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
Element found
Count=23
Duration=97706ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40
Element found
Count=27
Duration=288426ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60
Element found
Count=19
Duration=1247998ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80
Element found
Count=31
Duration=545279ns

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac BinSearch.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java BinSearch
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100
Element found
Count=23
Duration=459093ns
*/