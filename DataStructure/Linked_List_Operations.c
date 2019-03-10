#include<stdio.h>
#include<malloc.h>
struct node *create();
void insert();
void display(struct node *);
void count(struct node *);
void conc(struct node*,struct node*);
struct node* reve(struct node*);
struct node
{
int data;
struct node *next;
};
void main()
{
struct node *head1 ,*head2, *rev;
int a;

head1=create();
head2=create();
printf("\nFirst linked list is:");
display(head1);
count(head1);
printf("\nSecond linked list is:");
display(head2);
count(head2);
conc(head1,head2);
rev=reve(head1);
printf("\nReverse is:");
display(rev);

}
struct node *create()
{
int ele,i,n;
struct node *s=NULL,*p,*temp;
printf("enter the no. of elements");
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&ele);
temp=(struct node *)malloc(sizeof(struct node));
temp->data=ele;
temp->next=NULL;
p=s;
if(p==NULL)
{
s=temp;
}
else
{
while(p->next!=NULL)
{
p=p->next;
}
p->next=temp;
}
}
return s;
}
void display(struct node *head)
{
struct node *t;
t=head;
while(t!=NULL)
{
printf("\t%d",t->data);
t=t->next;
}
}
void count(struct node *head)
{
int i=0;
struct node *t;
t=head;
while(t!=NULL)
{
i++;
t=t->next;
}
printf("\nCount is:%d",i);
}
void conc(struct node *head1,struct node *head2)
{
printf("\nConcatinated Linked list is:");
struct node *temp=head1;
while(temp->next!=NULL)
{
temp=temp->next;
}
temp->next=head2;
display(head1);
}
struct node* reve(struct node*head1)
{
struct node*s=NULL,*t,*p;
p=head1;
while(p!=NULL)
{
t=(struct node*) malloc(sizeof(struct node));
t->data=p->data;
t->next=s;
s=t;
p=p->next;
}
return s;
}







