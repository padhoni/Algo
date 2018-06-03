import java.util.*;

public class DifferentSummands {
    private static Scanner scanner;
   
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (1<=n && n<=1000000000)
        {
        	List<Integer> summands = optimalSummands(n);
        	System.out.println(summands.size());
        	for (Integer summand : summands) 
        	{
        		System.out.print(summand + " ");
        	}
        }
        else
        {
        	System.out.println("Value out of range");
        }
    }
    
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        //write your code here
        
        for (int k = n, m = 1; k > 0; m++) {
            if (k <= 2 * m) {
                summands.add(k);
                k -= k;
            } else {
                summands.add(m);
                k -= m;
            }
        }
        return summands;
    }
}