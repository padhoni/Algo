
import java.util.Scanner;

public class Change {
    
	private static Scanner scanner;

	public static void main(String[] args) {
    	scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if(1<=m && m<=1000)
        {
        	System.out.println(getChange(m));
        }
        else
        {
        	System.out.println("Data out of range");
        }
    }
    
private static int getChange(int m) {
        
		int a=1;
		int i=0;
		int b=5;
		int c=10;
		while(m>0)
		{
			
			if(m>=c)
			{
				i=i+(m/c);
				m=m%c;
			}
			else if(m>=b)
			{
				i=i+(m/b);
				m=m%b;
			}
			else if(m>=a)
			{
				i=i+(m/a);
				m=m%a;
			}
		}
        return i;
    }
}