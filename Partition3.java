import java.util.*;
import java.io.*;

public class Partition3 {
    private static int partition3(int[] A) {
        //write your code here
    	int sum = 0;
        int i, j;
        int n=A.length;
        // Caculcate sun of all elements
        for (i = 0; i < n; i++)
            sum += A[i];
 
        if (n<3 || sum%3 != 0)
            return 0;
 
        boolean part[][]=new boolean[(sum/3)+1][n+1];
 
        // initialize top row as true
        for (i = 0; i <= n; i++)
            part[0][i] = true;
 
        // initialize leftmost column, except part[0][0], as 0
        for (i = 1; i <= sum/3; i++)
            part[i][0] = false;
 
        // Fill the partition table in botton up manner
        for (i = 1; i <= sum/3; i++)
        {
            for (j = 1; j <= n; j++)
            {
                part[i][j] = part[i][j-1];
                if (i >= A[j-1])
                    part[i][j] = (part[i][j]) || (part[i - A[j-1]][j-1]);
            }
        }
 
        /* // uncomment this part to print table
        for (i = 0; i <= sum/2; i++)
        {
            for (j = 0; j <= n; j++)
                printf ("%4d", part[i][j]);
            printf("\n");
        } */
 
        boolean bb= part[sum/3][n];
        if(bb==true)
        {
        	return 1;
        }
        else
        {
        	return 0;
        }
    }
     //   return 0;
    //}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(partition3(A));
    }
}