
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {
    private static Scanner scanner;

    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(1<=n && n<=1000)
        {
        	int capacity = scanner.nextInt();
        	int[] values = new int[n];
        	int[] weights = new int[n];
        	for (int i = 0; i < n; i++) {
        		values[i] = scanner.nextInt();
        		weights[i] = scanner.nextInt();
        	}
        	System.out.format("%.3f",getOptimalValue(capacity, values, weights));
        }
        else
        {
        	System.out.println("value out of range");
        }
    }
    
    private static double getOptimalValue(float capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here
        
        float sum=0;
        Float[][] a = new Float[values.length][2];
        for (int i=0;i<values.length;i++)
        	a[i][0]=(float)values[i]/(float)weights[i];
        for (int j=0;j<weights.length;j++)
        //{
        	a[j][1]=(float)weights[j];
        	//sum=sum+weights[j];
        //}
        if (a.length > 1)
        {
        Arrays.sort(a, new Comparator<Float[]>() {
			@Override
                        //arguments to this method represent the arrays to be sorted   
			public int compare(Float[] o1, Float[] o2) {
                                //get the item ids which are at index 0 of the array
				Float itemIdOne = o1[0];
				Float itemIdTwo = o2[0];
				// sort on item id
				return itemIdOne.compareTo(itemIdTwo);
			}
		});
        
        }
        /*for(int k=0;k<weights.length;k++)
		{
			for (int l=0;l<2;l++)
			System.out.println(a[k][l]);
		}*/
        int n=a.length-1;
        
        //if(capacity < sum)
        //{
        	while (capacity>0 && n>=0)
        	{
        		float f=Math.min(capacity, a[n][1]);
        		value=value+a[n][0]*f;
        		capacity=capacity-f;
        		n=n-1;
        		//sum=sum-a[n][1];
        	}
        //}
        //else
        //{
        	
        //}
    //    DecimalFormat df = new DecimalFormat(".####");
        //return (df.format(value));
       
        return value;
    }
}