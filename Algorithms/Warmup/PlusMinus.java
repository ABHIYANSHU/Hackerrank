package hackerrank;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class PlusMinus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n;
	    n = sc.nextInt();

	    float pl=0,mn=0,zr=0;

	    for(int i=0;i<n;i++)
	    {
	        int val;
	        val = sc.nextInt();
	        if(val==0)
	            zr++;
	        else if(val>0)
	            pl++;
	        else
	            mn++;

	    }
	    zr=zr/(float)n;
	    pl=pl/(float)n;
	    mn=mn/(float)n;
	    System.out.printf("%0.06f\n%0.06f\n%0.06f\n",pl,mn,zr);
		
		sc.close();
	}
}
