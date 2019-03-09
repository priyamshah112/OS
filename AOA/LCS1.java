import java.util.*;
public class LCS1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
System.out.println("enter the 1st string");
String s1=sc.nextLine();
System.out.println("enter the 2nd string" );
String s2=sc.nextLine();
char[] x=s1.toCharArray();

int a=s1.length();
int b=s2.length();

int[][] table=new int[a+2][b+2];
char[][] track=new char[a+2][b+2];
table[0][0]=0;
table[1][0]='X';
table[0][1]='Y';

		
for(i=0;i<a;i++)
{
	for(j=0;j<b;j++){
		if(s1.charAt(i)==s2.charAt(j)){
			table[i+2][j+2]=table[i+1][j+1]+1;
			System.out.print(table[i+2][j+2]);
			track[i+2][j+2]='D';
			System.out.print(track[i+2][j+2]+"\t");
		}
		else{
			
			table[i+2][j+2]=Math.max(table[i+1][j+2],table[i+2][j+1]);
			System.out.print(table[i+2][j+2]);
			if(table[i+1][j+2]>table[i+2][j+1]){
			track[i+2][j+2]='U';
			System.out.print(track[i+2][j+2]+"\t");
			}
			else{
			track[i+2][j+2]='L';
			System.out.print(track[i+2][j+2]+"\t");
			}
			
		}
	}
	System.out.println();
}/*
for(i=0;i<=a+1;i++)
{
	for(j=0;j<=b+1;j++){
		System.out.print(i+" "+j+" "+track[i][j]+"\t");
	}
	System.out.println();
}*/
printlcs(track,x,a,b);
}
 static void printlcs(char track[][],char x[],int i,int j){
  if(i==0 || j==0)
	  return;
 
  if(track[i+1][j+1]=='D'){
	printlcs(track,x,i-1,j-1);
	System.out.print(x[i-1]+"\t");
  }
  else if(track[i+1][j+1]=='U')
	  printlcs(track,x,i-1,j);
  else
	  printlcs(track,x,i,j-1);
 }
}