
import java.util.*;

public class LargestNumber {
    private static Scanner scanner;

	private static String largestNumber(String[] a) {
        //write your code here
    	
    	int n=a.length;
    	String temp;
    	int x=0;
    	int rem=0;
    	while(n>1)
    	{
    		for (int i=0;i<n-1;i++)
    		{
    			if(a[i].length()==a[i+1].length())
    			{
    				int result = Integer.parseInt(a[i]);
    				int result1 = Integer.parseInt(a[i+1]);
    				if(result < result1)
    				{
    					temp=a[i];
    					a[i]=a[i+1];
    					a[i+1]=temp;
    				}
    			}
    			else if(a[i].length() > a[i+1].length())
    			{
    				
    				int y=Integer.parseInt(a[i+1]);
    				if(a[i].length()==2)
    				{
    					x=Integer.parseInt(a[i])/10;
    					rem=Integer.parseInt(a[i])%10;
    				}
    				else if(a[i].length()==3)
    				{
    					x=Integer.parseInt(a[i])/100;
    					rem=Integer.parseInt(a[i])%10;
    				}
    				else if(a[i].length()==4)
    				{
    					x=Integer.parseInt(a[i])/1000;
    					rem=Integer.parseInt(a[i])%10;
    				}
    				if(a[i+1].length()==2)
    				{
    					y=Integer.parseInt(a[i+1])/10;
    					rem=Integer.parseInt(a[i])%10;
    				}
    				else if(a[i+1].length()==3)
    				{
    					y=Integer.parseInt(a[i+1])/100;
    					rem=Integer.parseInt(a[i])%10;
    				}
    				else if(a[i].length()==4)
    				{
    					y=Integer.parseInt(a[i+1])/1000;
    					rem=Integer.parseInt(a[i])%10;
    				}
    				if ((x<=y) && (rem<=y))
    				{
    					temp=a[i];
    					a[i]=a[i+1];
    					a[i+1]=temp;
    				}
    			}
    			else
    			{
    				int y=Integer.parseInt(a[i]);
    				if(a[i+1].length()==2)
    				{
    					x=Integer.parseInt(a[i+1])/10;
    					rem=Integer.parseInt(a[i+1])%10;
    				}
    				else if(a[i+1].length()==3)
    				{
    					x=Integer.parseInt(a[i+1])/100;
    					rem=Integer.parseInt(a[i+1])%10;
    				}
    				else if(a[i+1].length()==4)
    				{
    					x=Integer.parseInt(a[i+1])/1000;
    					rem=Integer.parseInt(a[i+1])%10;
    				}
    				
    				if(a[i].length()==2)
    				{
    					y=Integer.parseInt(a[i])/10;
    					rem=Integer.parseInt(a[i+1])%10;
    				}
    				else if(a[i].length()==3)
    				{
    					y=Integer.parseInt(a[i])/100;
    					rem=Integer.parseInt(a[i+1])%10;
    				}
    				else if(a[i].length()==4)
    				{
    					y=Integer.parseInt(a[i])/1000;
    					rem=Integer.parseInt(a[i+1])%10;
    				}
    				if ((x>=y) && (rem>=y))
    				{
    					temp=a[i];
    					a[i]=a[i+1];
    					a[i+1]=temp;
    				}
    			}
    		}
    		n=n-1;
    	}
    	
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}