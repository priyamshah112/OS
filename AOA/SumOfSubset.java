import java.util.*;

public class SumOfSubset
{

static int[] w;
static int[] x;
static int sum;
 
    public static void subset(int s, int k, int r) {
        int i = 0;
        x[k] = 1;
        if (s + w[k] == sum) {
			System.out.println("\t"+s+"\t"+k+"\t"+r);
            System.out.println("Ans:");
			
            for (i = 1; i <= k; i++) {
                System.out.print("\t" + x[i]);
            }
			System.out.println();
        } 
         else if ((s + w[k] + w[k + 1]) <= sum) 
          {
			System.out.println("\t" +s+"\t" +k+"\t" +r);
            subset(s + w[k], k + 1, r - w[k]);
        }
        if ((s + r - w[k]) >= sum && (s + w[k + 1]) <= sum) 
          {
			System.out.println("\t" +s+"\t" +k+"\t" +r);
            x[k] = 0;
            subset(s, k + 1, r - w[k]);
        }
    }

public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elements:");
int n = sc.nextInt();
w = new int[n + 1];
x = new int[n + 1];
int total = 0;
System.out.println("Enter " + n + " Elements :");
        for (int i = 1; i < n + 1; i++) {
            w[i] = sc.nextInt();
            total += w[i];
        }
		Arrays.sort(w);
		for (int i = 1; i <= n; i++) {
                System.out.print( w[i]+"\t" );
            }

        System.out.println("\n"+"Enter the sum to be obtained: ");
        sum = sc.nextInt();
        if (total < sum) {
            System.out.println("Not possible to obtain the subset");
            System.exit(1);
        }
       SumOfSubset.subset(0, 1, total);
}
}
