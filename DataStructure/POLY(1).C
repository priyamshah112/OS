#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
 int coeff,pow;
 struct node *next;
}node;
void insert(node **p,int coeff,int pow)
{
  node *temp=*p,*prev=NULL;
  while(temp!=NULL)
  {
   if(temp->pow<=pow)
       break;
   prev=temp;
   temp=temp->next;
  }
  if(temp!=NULL && temp->pow==pow)
  {
   temp->coeff+=coeff;

  }
  else
  {
   node *newnode;
   newnode=(node *)malloc(sizeof(node));
   newnode->coeff=coeff;
   newnode->pow=pow;
   if(temp==*p)
   {
     newnode->next=*p;
	 *p=newnode;
   }
   else
   {
     newnode->next=prev->next;
	 prev->next=newnode;
   }


  }
 }
 void insert1(node **p,int coeff,int pow)
{
  node *temp=*p,*prev=NULL;
  while(temp!=NULL)
  {
   if(temp->pow<=pow)
       break;
   prev=temp;
   temp=temp->next;
  }
  if(temp!=NULL && temp->pow==pow)
  {
   temp->coeff-=coeff;

  }
  else
  {
   node *newnode;
   newnode=(node *)malloc(sizeof(node));
   newnode->coeff=coeff;
   newnode->pow=pow;
   if(temp==*p)
   {
     newnode->next=*p;
	 *p=newnode;
   }
   else
   {
     newnode->next=prev->next;
	 prev->next=newnode;
   }


  }
 }

void display(node *p)
{
  while(p!=NULL)
  {
    printf("%d x ^%d + \t",p->coeff,p->pow);
	p=p->next;
  }
}

node* add(node *p,node *q)
{ node *t=NULL;
  while(p!=NULL)
  {
    insert(&t,p->coeff,p->pow);
	p=p->next;

  }
  while(q!=NULL)
  {
    insert(&t,q->coeff,q->pow);
	q=q->next;

  }
  return t;

 }
node* subtract(node *p,node *q)
{ node *t=NULL;
  while(p!=NULL)
  {
    insert1(&t,p->coeff,p->pow);
	p=p->next;

  }
  while(q!=NULL)
  {
    insert1(&t,q->coeff,q->pow);
	q=q->next;

  }
  return t;

 }


void main()
 {
//ADDITION
printf("\n \n ADDITION \n");
 node *first=NULL,*second=NULL,*third=NULL;
 
 insert(&first,15,5);
 insert(&first,10,4);
 insert(&first,6,2);
 insert(&first,8,3);
 insert(&first,10,1);
 printf("first polynmial: \t");
 display(first);
 insert(&second,25,5);
 insert(&second,20,3);
 insert(&second,8,2);
 insert(&second,8,3);
 insert(&second,90,1);
 printf("\n second polynomial:\t");
 display(second);
 third=add(first,second);
 printf("\n addition is :     \t ");
 display(third);
//SUBTRACTION
printf("\n \n SUBTRACTION \n");
node *first1=NULL,*second1=NULL,*third1=NULL; 
 insert1(&first1,15,5);
 insert1(&first1,10,4);
 insert1(&first1,6,2);
 insert1(&first1,8,3);
 insert1(&first1,10,1);
 printf("\n first polynmial: \t");
 display(first1);
 insert1(&second1,25,5);
 insert1(&second1,20,3);
 insert1(&second1,8,2);
 insert1(&second1,8,3);
 insert1(&second1,90,1);
 printf("\n second polynomial:\t");
 display(second1);
 third1=subtract(first1,second1);
 printf("\nSubtraction is :     \t ");
 display(third1);
 }