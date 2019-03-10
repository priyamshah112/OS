#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>

#define MAX 50

int pop();
int eval_pre();
char infix[MAX], prefix[MAX];
 int stack[MAX];
int top;
int isempty();
void infix_to_prefix();
int priority(char symbol);
void push( int symbol);
 int pop();
 int eval_pre();

void main()
{
	 int value;
	top = -1;

	printf("Enter infix : ");
	gets(infix);
	infix_to_prefix();
	printf("prefix : %s\n",prefix);
	value=eval_pre();
	printf("Value of expression : %d\n",value);



}

void infix_to_prefix()
{
	int i,j,p,n;
	char next ;
	char symbol;
	char temp;
	n=strlen(infix);
	p=0;

	for(i=n-1; i>=0; i--)
	{
		symbol=infix[i];
		if(!('\0'))
		{
			switch(symbol)
			{
			case ')':
				push(symbol);
				break;
			case '(':
				while( (next=pop()) != ')')
					prefix[p++] = next;
				break;
			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
			case '^':
				while( !isempty( ) &&  priority(stack[top])> priority(symbol) )
					prefix[p++] = pop();
				push(symbol);
				break;
			default:
			     prefix[p++] = symbol;
			}
		}
	}
	while(!isempty( ))
		prefix[p++] = pop();
	prefix[p] = '\0';

	for(i=0,j=p-1;i<j;i++,j--)
	{
		temp=prefix[i];
		prefix[i]=prefix[j];
		prefix[j]=temp;
	}
}

int priority(char symbol )
{
	switch(symbol)
	{
	case ')':
		return 0;
	case '+':
	case '-':
		return 1;
	case '*':
	case '/':
	case '%':
		return 2;
	case '^':
		return 3;
	default :
		 return 0;
	}
}

void push( int symbol)
{
	if(top > MAX)
	{
		printf("Stack overflow\n");
		exit(1);
	}
	else
	{
		top=top+1;
		stack[top] = symbol;
	}
}

int pop()
{
	if(top == -1 )
	{
		printf("Stack underflow \n");
		exit(2);
	}
	return (stack[top--]);
}
int isempty()
{
	if(top==-1)
		return 1;
	else
		return 0;
}

int eval_pre()
{
	 int a,b,temp,result;
	int i;

	for(i=strlen(prefix)-1;i>=0;i--)
	{
		if(prefix[i]<='9' && prefix[i]>='0')
			push( prefix[i]-48 );
		else
		{
			b=pop();
			a=pop();
			switch(prefix[i])
			{
			case '+':
				temp=b+a; break;
			case '-':
				temp=b-a;break;
			case '*':
				temp=b*a;break;
			case '/':
				temp=b/a;break;
			case '%':
				temp=b%a;break;
			case '^':
				temp=pow(b,a);
			}
			push(temp);
		}
	}
	result=pop();
	return result;

}