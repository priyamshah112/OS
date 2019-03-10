#include<stdio.h>

#include<malloc.h>
struct polynode *create(int);
void display(struct polynode *);
struct polynode * add(struct polynode *,struct polynode *);
struct polynode * sub(struct polynode *,struct polynode *);
struct polynode
{
int coeff;
int expox;
int expoy;
int expoz;
struct polynode *next;
};
void main()
{
struct polynode *poly1 ,*poly2, *addr, *subr;

int n,q;
printf("Enter number of terms in 1st Polynomial:(In increasing order of power)");
scanf("%d",&n);
poly1=create(n);
printf("Enter number of terms in 2nd Polynomial:(In increasing order of power)");
scanf("%d",&q);
poly2=create(q);
printf("\nFirst Polynomial is:");
display(poly1);
printf("\nSecond Polynomial is:");
display(poly2);
printf("\nAddition is:");
addr=add(poly1,poly2);
display(addr);
printf("\nSubtraction is:");
subr=sub(poly1,poly2);
display(subr);

}
struct polynode *create(int d)
{
int coef,powx,powy,powz,i;
struct polynode *s=NULL,*p,*temp;
for(i=0;i<d;i++)
{
printf("Enter Coeff and Pow of x,y,z:");
scanf("%d",&coef);
scanf("%d",&powx);
scanf("%d",&powy);
scanf("%d",&powz);
temp=(struct polynode *)malloc(sizeof(struct polynode));
temp->coeff=coef;
temp->expox=powx;
temp->expoy=powy;
temp->expoz=powz;
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
void display(struct polynode *t)
{
while(t->next!=NULL)
{
printf(" %dx^%dy^%dz^%d + ",t->coeff,t->expox,t->expoy,t->expoz);
t=t->next;
}
printf(" %dx^%dy^%dz^%d ",t->coeff,t->expox,t->expoy,t->expoz);
}
struct polynode * add(struct polynode *p1,struct polynode *p2)
{
struct polynode *r3=NULL,*p3=NULL,*last=NULL;
while(p1!=NULL&&p2!=NULL)
{
r3=(struct polynode *)malloc(sizeof (struct polynode));
if(p3==NULL)
{
p3=r3;
last=r3;
}
else
{
last->next=r3;
last=r3;
}
if((p1->expox==p2->expox)&&(p1->expoy==p2->expoy)&&(p1->expoz==p2->expoz)){
r3->expox=p1->expox;
r3->expoy=p1->expoy;
r3->expoz=p1->expoz;
r3->coeff=p1->coeff+p2->coeff;
r3->next=NULL;
p1=p1->next;
p2=p2->next;
}
else if((p1->expox>p2->expox)||((p1->expox==p2->expox)&&(p1->expoy>p2->expoy))||((p1->expox==p2->expox)&&(p1->expoy==p2->expoy)&&(p1->expoz>p2->expoz)))
{
r3->expox=p1->expox;
r3->expoy=p1->expoy;
r3->expoz=p1->expoz;
r3->coeff=p1->coeff;
r3->next=NULL;
p1=p1->next;
}
else
{
r3->expox=p2->expox;
r3->expoy=p2->expoy;
r3->expoz=p2->expoz;
r3->coeff=p2->coeff;
r3->next=NULL;
p2=p2->next;
}
}
if (p2==NULL)
{
while(p1!=NULL)
{
r3=(struct polynode *)malloc(sizeof (struct polynode));
last->next=r3;
last=r3;
r3->expox=p1->expox;
r3->expoy=p1->expoy;
r3->expoz=p1->expoz;
r3->coeff=p1->coeff;
r3->next=NULL;
p1=p1->next;
}
}
else
{
while(p2!=NULL)
{
r3=(struct polynode *)malloc(sizeof (struct polynode));
last->next=r3;
last=r3;
r3->expox=p2->expox;
r3->expoy=p2->expoy;
r3->expoz=p2->expoz;
r3->coeff=p2->coeff;
r3->next=NULL;
p2=p2->next;
}
}
return p3;
}
struct polynode * sub(struct polynode *p1,struct polynode *p2)
{
struct polynode *r3=NULL,*p3=NULL,*last=NULL;
while(p1!=NULL&&p2!=NULL)
{
r3=(struct polynode *)malloc(sizeof (struct polynode));
if(p3==NULL)
{
p3=r3;
last=r3;
}
else
{
last->next=r3;
last=r3;
}
if((p1->expox==p2->expox)&&(p1->expoy==p2->expoy)&&(p1->expoz==p2->expoz))
{
r3->expox=p2->expox;
r3->expoy=p2->expoy;
r3->expoz=p2->expoz;
r3->coeff=p1->coeff-p2->coeff;
r3->next=NULL;
p2=p2->next;
p1=p1->next;
}
else if((p1->expox>p2->expox)||((p1->expox==p2->expox)&&(p1->expoy>p2->expoy))||((p1->expox==p2->expox)&&(p1->expoy==p2->expoy)&&(p1->expoz>p2->expoz)))
{
r3->expox=p1->expox;
r3->expoy=p1->expoy;
r3->expoz=p1->expoz;
r3->coeff=p1->coeff;
r3->next=NULL;
p1=p1->next;
}
else
{
r3->expox=p2->expox;
r3->expoy=p2->expoy;
r3->expoz=p2->expoz;
r3->coeff=p2->coeff;
r3->next=NULL;
p2=p2->next;
}
}
if (p2==NULL)
{
while(p1!=NULL)
{
r3=(struct polynode *)malloc(sizeof (struct polynode));
last->next=r3;
last=r3;
r3->expox=p1->expox;
r3->expoy=p1->expoy;
r3->expoz=p1->expoz;
r3->coeff=p1->coeff;
r3->next=NULL;
p1=p1->next;
}
}
else
{
while(p2!=NULL)
{
r3=(struct polynode *)malloc(sizeof (struct polynode));
last->next=r3;
last=r3;
r3->expox=p2->expox;
r3->expoy=p2->expoy;
r3->expoz=p2->expoz;
r3->coeff=p2->coeff;
r3->next=NULL;
p2=p2->next;
}
}
return p3;
}
