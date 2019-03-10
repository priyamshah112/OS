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

void dfs(int a[n][n],int visited[n],int start)
{ int i;
  visited[start]=1;
  printf("%c \t",start+65);
  for(i=0;i<n;i++)
  {
    if(a[start][i] && !visited[i])
    dfs(a,visited,i);
  }
}
int main()
{
  int visited[n]={0},a[n][n]={{0}};
  createGraph(a,0);//0 for undirected graph
  dfs(a,visited,0);
}