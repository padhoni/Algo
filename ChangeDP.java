import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int V) {
        //write your code here
    	 int coins[] = {1, 3, 4};
         int m = coins.length;
    	 int table[] = new int[V + 1];
    	 
         // Base case (If given value V is 0)
         table[0] = 0;
  
         // Initialize all table values as Infinite
         for (int i = 1; i <= V; i++)
         table[i] = Integer.MAX_VALUE;
  
         // Compute minimum coins required for all
         // values from 1 to V
         for (int i = 1; i <= V; i++)
         {
             // Go through all coins smaller than i
             for (int j = 0; j < m; j++)
             if (coins[j] <= i)
             {
                 int sub_res = table[i - coins[j]];
                 if (sub_res != Integer.MAX_VALUE 
                        && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                         
                  
             }
              
         }
         return table[V];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}