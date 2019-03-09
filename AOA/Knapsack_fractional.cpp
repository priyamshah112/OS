#include<stdio.h>
#include<stdlib.h>
typedef struct sack{
	float profit,weight;
	float pw,used;
}sack;
int partition(sack a[],int low,int high)
{
	sack t;
	sack pi=a[low];//pi is the pivot.
	float p=a[low].pw;
	int l=low+1;
	int r=high;
	while(1)
	{
		while(l<=high&&p>a[l].pw)
		l++;
		while(p<(a[r]).pw)
		r--;
		if(l<r)
		{
			t=a[l];
			a[l]=a[r];
			a[r]=t;	
		}
		else
		{
			a[low]=a[r];
			a[r]=pi;
			break;
		}
	}
	return r;
}
void quicksort(sack a[],int low,int high)
{
	if(low<high)
	{
		int p=partition(a,low,high);//p is the position of the pivot.
		quicksort(a,low,p-1);//left sub array. 
		quicksort(a,p+1,high);//right subarray.
	}
}
int knapsack(sack s[],float capacity){
	int visited[5]={0};
	float temp=0,pro;
	
	int i;
	for(i=4;i>=0;i--){
		if(temp<capacity&&!visited[i]){
			visited[i]=1;
			if(temp+s[i].weight>capacity){
			
			pro+=((capacity-temp)/(s[i].weight))*(s[i].profit);
			
			temp=temp+(capacity-temp);
			
			
			}
			else{
				
				temp+=s[i].weight;
				
				
				pro+=s[i].profit;
			}
		}
	}
	return pro;
}
int main(){
	sack s[5];
	int i;
	float cap;
	printf("enter profit followed by weight");
	for(int i=0;i<5;i++){
		scanf("%f%f",&s[i].profit,&s[i].weight);
		s[i].pw=(s[i].profit)/(s[i].weight);
		s[i].used=0;
	}
	printf("Enter capacity\n");
	scanf("%f",&cap);
	quicksort(s,0,4);
	float pro=knapsack(s,cap);
		for(int i=4;i>=0;i--){
		printf("%f\t%f\t%f\t\n",s[i].profit,s[i].weight,s[i].pw);
		//s[i].pw=s[i].profit/s[i].weight;
	}
	printf("%f",pro);
}
