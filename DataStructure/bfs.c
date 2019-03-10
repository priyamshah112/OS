#include<stdio.h>
#include<stdlib.h>
#define n 4

void createGraph(int a[n][n],int directed)
{int ch=0;
  do{
    
    char x,y;
    printf("Enter the edge name \n");
    scanf(" %c %c",&x,&y);//use fflush(stdin); above 
    x=toupper(x);
    y=toupper(y);
    a[x-65][y-65]=1;
    if(!directed)
    a[y-65][x-65]=1;
    printf("Enter 1 to continue \n");
    scanf("%d",&ch);
    
  }while(ch==1);
}

void bfs(int a[n][n],int visited[n],int start)
{ int q[n],rear=-1,front=-1;
 q[++rear]=start;
  int i;
  visited[start]=1;
  printf("%c \t",start+65);
  while(front!=rear)
  {
    
   start=q[++front];
  for(i=0;i<n;i++)
  {
    if(a[start][i] && !visited[i])
     {
       q[++rear]=i;
       visited[i]=1;
       printf("%c \t",i+65);
     }
   
  }
}
}
int main()
{
  int visited[n]={0},a[n][n]={{0}};
  createGraph(a,0);//0 for undirected graph
  bfs(a,visited,0);
}