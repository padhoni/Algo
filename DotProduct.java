
import java.util.Arrays;
import java.util.Scanner;

public class DotProduct {
	private static Scanner scanner;
	
public static void main(String[] args) {
    scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    if(1<=n && n<=1000)
    {
    	long[] a = new long[n];
    	for (int i = 0; i < n; i++) {
    		a[i] = scanner.nextInt();
    	}
    	long[] b = new long[n];
    	for (int i = 0; i < n; i++) {
    		b[i] = scanner.nextInt();
    	}
    System.out.println(maxDotProduct(a, b));
    }
    else
    {
    	System.out.println("Number out of range");
    }
}

static void rvereseArray(long a[], int start, int end)
{
    long temp;
    if (start >= end)
        return;
    temp = a[start];
    a[start] = a[end];
    a[end] = temp;
    rvereseArray(a, start+1, end-1);
}

static void rvereseArray1(long b[], int start, int end)
{
    long temp;
    if (start >= end)
        return;
    temp = b[start];
    b[start] = b[end];
    b[end] = temp;
    rvereseArray1(b, start+1, end-1);
}
private static long maxDotProduct(long[] a, long[] b) {
//write your code here
Arrays.sort(a);
rvereseArray(a, 0, a.length-1);
Arrays.sort(b);
rvereseArray1(b, 0, b.length-1);
long result = 0;
for (int i = 0; i < a.length; i++) {
    result += a[i] * b[i];
}
return result;
}
}