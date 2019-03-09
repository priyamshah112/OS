import java.util.Scanner;
 
public class KnapsackDP
{
    public void sol(int[] wt, int[] val, int W, int N)
    {
       
        int[][] m = new int[N + 1][W + 1];
        int[][] sol = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++)
        {
            for (int j = 0; j <= W; j++)
            {
                
                if (j >= wt[i]){
                   m[i][j] = Math.max(m[i - 1][j],  m[i - 1][j - wt[i]] + val[i]);
				System.out.print(m[i][j]+"\t");
                sol[i][j] = (m[i - 1][j - wt[i]] + val[i]) > (m[i - 1][j]) ? 1 : 0;}
				else{
					m[i][j]= m[i-1][j];
					System.out.print(m[i][j]+"\t");
				}
				
            }
			System.out.println();
        }        
        int[] selected = new int[N + 1];
        for (int n = N, w = W; n > 0; n--)
        {
            if (sol[n][w] != 0)
            {
                selected[n] = 1;
                w = w - wt[n];
            }
            else
                selected[n] = 0;
        }
        for (int i = 1; i < N + 1; i++)
            if (selected[i] == 1){
                System.out.print("Profit "+val[i] +" ");
				System.out.print("Weight "+wt[i]+" \n");
			}
        
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        KnapsackDP ks = new KnapsackDP();
 
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
 
        int[] wt = new int[n + 1];
        int[] val = new int[n + 1];
 
        System.out.println("Enter weight");
        for (int i = 1; i <= n; i++)
            wt[i] = sc.nextInt();
        System.out.println("Enter value ");
        for (int i = 1; i <= n; i++)
            val[i] = sc.nextInt();
 
        System.out.println("Enter capacity ");
        int W = sc.nextInt();
 
        ks.sol(wt, val, W, n);
    }
}