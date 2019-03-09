import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the no. of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter the no. of edges: ");
        int e=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n-1][n];
        int i,j,k,l;
        String path[]=new String[n];

        System.out.println("Enter the edges: ");
        for(i=0;i<e;i++)
        {
            a[sc.nextInt()-1][sc.nextInt()-1]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]==0&&i!=j)
                {
                    a[i][j]=999;
                }
            }
        }

        for(i=0;i<n;i++)
        {
            path[i]="1";
            if(a[0][i]!=0 && a[0][i]!=999)
            {
                path[i]=path[i]+" "+(i+1);
            }

        }

        System.out.println("\nThe adjacency matrix is: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
		 System.out.println("\nTable: \n");
        for(i=0;i<n;i++)
        {
            b[0][i]=a[0][i];
        }
        
        for(l=0;l<n;l++)
        {
            System.out.print(b[0][l]+" ");
        }

        int temp[]=new int[n];
        int t,t2=0,f,z=0;
        for(i=1;i<n-1;i++)
        {
            for(j=0;j<n;j++)
            {
                t=b[i-1][j];
                for(k=0;k<n;k++)
                {
                    temp[k]=b[i-1][k]+a[k][j];
                    if(k==0)
                    {
                        t2=temp[k];
                    }
                    else if(k>0&&temp[k]<t2)
                    {
                        t2=temp[k];
                        z=k;
                    }
                }
                if(t2<t)
                {
                    b[i][j]=t2;
                    path[j]=path[z]+" "+(j+1);
                }
                else
                    b[i][j]=t;
            }
            System.out.println();
            for(l=0;l<n;l++)
            {
                System.out.print(b[i][l]+" ");
            }

        }

        System.out.println();
        for(i=0;i<n;i++)
        {
            System.out.println("Shortest Distance for node "+(i+1)+" : "+b[n-2][i]);
        }

        System.out.println("\nPaths are:");
        for(i=0;i<n;i++)
        {
            System.out.println("Shortest route for vertex "+(i+1)+":"+path[i]); 
        }
        
        
    }
}
/*1 2 6
1 3 5
1 4 5
4 3 -2
3 2 -2
2 5 -1
4 6 -1
5 7 3
6 7 3*/
